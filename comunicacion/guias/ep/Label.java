package comunicacion.guias.ep;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.JOptionPane;

public class Label {
    /*public static void main(String[] args) {
    
    // TODO Apéndice de método generado automáticamente
}*/

private JsonObject json(String orden,String ordenSAP, int numcajas,String envio){
	JsonObject json = new JsonObject();
	
	JsonObject meta = new JsonObject();
	JsonObject settings = new JsonObject();
	JsonObject cajas = new JsonObject();
	JsonArray cajasA = new JsonArray();
	
	meta.addProperty("class", "WCaaSShipmentRequest");
	meta.addProperty("version", "1");
	
	json.add("_meta", meta);
	json.addProperty("orderNumber", orden);
	json.addProperty("shippingMode", envio);
	
	for(int i = 0; i < numcajas; i++) {
	        cajas.addProperty("code", "BOX_A");
	        cajas.addProperty("contents", "B2C " + orden);
	        cajasA.add(cajas);
	}
	
	json.add("parcelChoices", cajasA);
	settings.addProperty("aditionalInfo", "Pedido " + ordenSAP);
	
	json.add("settings",settings);
	
	System.out.println("Token: \n" + json.toString());
	
	return json;
	}

	public JsonObject jsonLabel(String orden,String ordenSAP, int numcajas,String envio){
	JsonObject jsonObject = null;
	try {
	    URL objectlbl = new URL("https://merchants.wcaas.com/couriers/shipment");
	   
	    HttpURLConnection conlbl = (HttpURLConnection) objectlbl.openConnection();
	    conlbl.setDoOutput(true);
	    conlbl.setDoInput(true);
	    conlbl.setRequestProperty("Authorization", tokenAccess());
	    conlbl.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	    conlbl.setRequestProperty("Accept", "application/json");
	    conlbl.setRequestMethod("POST");
	    
	    OutputStreamWriter wrlbl = new OutputStreamWriter(conlbl.getOutputStream());
	    wrlbl.write(json(orden,ordenSAP,numcajas,envio).toString());
	    wrlbl.flush();

	    StringBuilder sblbl = new StringBuilder();;
	    if (conlbl.getResponseCode() == HttpURLConnection.HTTP_OK) {
	        BufferedReader brlbl = new BufferedReader(new InputStreamReader(conlbl.getInputStream(), "UTF-8"));
	        String linelbl = null;  
	        while ((linelbl = brlbl.readLine()) != null) {  
	            sblbl.append(linelbl + "\n");
	        }
	        brlbl.close();
	        System.out.println("Json: \n\t" + sblbl.toString());
	        System.out.println("Se creo la guia con exito!");
	        
	    } else {
		    JsonParser parserError = new JsonParser();
		    Object objError = parserError.parse(conlbl.toString());
	    	JsonObject jsonError = (JsonObject) objError;
	    	JsonArray mensaje = (JsonArray) jsonError.get("details");
	    	JOptionPane.showMessageDialog(null, "No se obtuvo respuesta de la API, contacte a su proveedor de sistemas. \nError: " + 
	    			jsonError.get("details").toString(),"cloe | Guias", JOptionPane.ERROR_MESSAGE);
//        	JOptionPane.showMessageDialog(null, "No se obtuvo respuesta de la API, contacte a su proveedor de sistemas. \nError: " + conlbl.getResponseMessage(),"cloe | Guias", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    
	    JsonParser parser = new JsonParser();
	    
	    Object obj = parser.parse(sblbl.toString());
	    
	    jsonObject = (JsonObject) obj;
	    
	} catch (MalformedURLException ex) {
	    Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	}
	return jsonObject;
	}
	private String tokenAccess(){
	String tokenAcceso = null;
	try {
	    JsonObject json = new JsonObject();
	    json.addProperty("client_id", "2347sjna8togtmq3u37p4n32tv");
	    json.addProperty("username", "luise@oemoda.com");
	    json.addProperty("password", "vh+eLeOl1oxzn7moQu/uJxZnuULyy6dCzixGxtHoa2fGvJY=");
	    
	    String url="https://merchants.wcaas.com/auth/login";
	    URL object = new URL(url);
	    
	    HttpURLConnection con;
	    try {
	        con = (HttpURLConnection) object.openConnection();
	        con.setDoOutput(true);
	        con.setDoInput(true);
	        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	        con.setRequestProperty("Accept", "application/json");
	        con.setRequestMethod("POST");
	        
	        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
	        wr.write(json.toString());
	        wr.flush();
	        
	        StringBuilder sb = new StringBuilder();
	        if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
	        String line = null;  
	        while ((line = br.readLine()) != null) {
	            sb.append(line + "\n");
	        }
	        br.close();
	        System.out.println("Json: \n\t" + sb.toString());
	        } else {
	        	JOptionPane.showMessageDialog(null, "No se obtuvo el acceso contacte a su proveedor de sistemas. \nError: " + con.getResponseMessage(),"cloe | Guias", JOptionPane.ERROR_MESSAGE);
	            System.out.println(con.getResponseMessage());
	        }
	        
	        JsonParser parser = new JsonParser();
	
	try {
	        Object obj = parser.parse(sb.toString());
	
	        JsonObject jsonObject = (JsonObject) obj;
	        System.out.println("TokenType: \n\t" + jsonObject.get("tokenType"));
	        System.out.println("AccessToken: \n\t" + jsonObject.get("accessToken"));
	        System.out.println("refreshToken: \n\t" + jsonObject.get("refreshToken"));
	        System.out.println("ExpiresIn: \n\t" + jsonObject.get("expiresIn"));
	        System.out.println("ID_Token: \n\t" + jsonObject.get("idToken"));
	        tokenAcceso = jsonObject.get("idToken").toString().replace("\"", "");
	
	} catch (JsonIOException e) {
		// TODO Bloque catch generado automáticamente
		e.printStackTrace();
	} catch (JsonSyntaxException e) {
		// TODO Bloque catch generado automáticamente
		e.printStackTrace();
	}
	    } catch (IOException ex) {
	        Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	    }
	} catch (MalformedURLException ex) {
	    Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	}
	return tokenAcceso;
	}
	public void printLabel(String link){
	File carpeta = new File("C:\\temp\\guias");
	carpeta.mkdirs();
	String nombre;
	nombre = link.replace("https://s3.amazonaws.com/wcaas-couriers/cloemx/","");
	nombre = nombre.replace("/", "").replace("_estafeta","");
	System.out.println(nombre);
	URL url;
	  try {
	      url = new URL(link);
	BufferedInputStream bis = new BufferedInputStream(url.openStream());
	
	FileOutputStream fis = new FileOutputStream("C:\\temp\\guias\\" + nombre);
	byte[] buffer = new byte[1024];
	int count=0;
	while((count = bis.read(buffer,0,1024)) != -1)
	{
	    fis.write(buffer, 0, count);
	}
	fis.close();
	bis.close();

	Desktop.getDesktop().print(new File("C:\\temp\\guias\\"+nombre));

	} catch (MalformedURLException ex) {
	    Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
	}
	}
	
}
