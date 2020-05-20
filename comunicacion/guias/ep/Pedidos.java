package comunicacion.guias.ep;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sap.smb.sbo.api.IDocuments;
import com.sap.smb.sbo.api.SBOCOMConstants;
import com.sap.smb.sbo.api.SBOCOMException;
import com.sap.smb.sbo.api.SBOCOMUtil;

import comunicacion.guias.ep.Guias.actualiza;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

public class Pedidos extends JPanel {
	private JTextField txtfiltro;
	private JTextField txtpedido;
	private JTextField txtpeso;
	private JTextField txtreferencia;
	private JTextField txtenvio;
	private JTextField txtcajas;
	private JTable table;
    private TableRowSorter tableFiltro;
    private TableRowSorter tableFiltro2;
    private JLabel procesando;
    private JComboBox cmbpaqueteria;
    public String user;
	
	ConexionBD bd = new ConexionBD();
	private JTextField txtdocentry;

	/**
	 * Create the panel.
	 */
	public Pedidos() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(175, 140, 853, 530);
		
		procesando = new JLabel();
		procesando.setBackground(Color.WHITE);
		procesando.setIcon(new ImageIcon(Guias.class.getResource("/recursos/oegif.gif")));
		procesando.setHorizontalAlignment(SwingConstants.CENTER);
		procesando.setBounds(0, 0, 865, 531);
		procesando.setVisible(false);
		add(procesando);
		
		JLabel lblNewLabel = new JLabel("Pedido SAP");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 104, 14);
		add(lblNewLabel);
		
		txtfiltro = new JTextField();
		txtfiltro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				  char caracter= evt.getKeyChar();
			        if(!Character.isDigit(caracter)&&!Character.isLetter(caracter)){
			            evt.consume();
			        }
			        txtfiltro.addKeyListener(new KeyAdapter() {
				        public void keyReleased(final KeyEvent e) {
				        String cadena = (txtfiltro.getText());
				        txtfiltro.setText(cadena);
				        repaint();
				        filtro();
				        }
			        });
			        tableFiltro = new TableRowSorter(table.getModel());
			        table.setRowSorter(tableFiltro);       
			}
		});
		txtfiltro.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtfiltro.setBounds(10, 34, 231, 20);
		add(txtfiltro);
		txtfiltro.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 833, 341);
		add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
				txtpedido.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
				txtdocentry.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
				txtreferencia.setText(table.getValueAt(table.getSelectedRow(), 1).toString().replace("B2C-", "").replace("B2B-", "").replaceAll("[^0-9]", ""));
				txtpeso.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
				txtenvio.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
				txtcajas.setText("0");
				}catch(Exception e) {
					txtpedido.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
					txtpeso.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
					txtenvio.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
					txtcajas.setText("0");
					txtreferencia.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de pedido SAP", "Referencia B2C", "Peso Volumetrico", "Tipo de envio", "ID" 
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		
		JLabel lblNumeroDePedido = new JLabel("Numero de pedido SAP");
		lblNumeroDePedido.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNumeroDePedido.setBounds(10, 417, 231, 20);
		add(lblNumeroDePedido);
		
		txtpedido = new JTextField();
		txtpedido.setEditable(false);
		txtpedido.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtpedido.setColumns(10);
		txtpedido.setBounds(10, 440, 110, 20);
		add(txtpedido);
		
		JLabel lblPesoVolumetricokg = new JLabel("Peso volumetrico (Kg)");
		lblPesoVolumetricokg.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblPesoVolumetricokg.setBounds(10, 471, 231, 20);
		add(lblPesoVolumetricokg);
		
		txtpeso = new JTextField();
		txtpeso.setEditable(false);
		txtpeso.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtpeso.setColumns(10);
		txtpeso.setBounds(10, 494, 231, 20);
		add(txtpeso);
		
		JLabel lblReferenciaBc = new JLabel("Referencia B2C");
		lblReferenciaBc.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblReferenciaBc.setBounds(251, 417, 231, 20);
		add(lblReferenciaBc);
		
		txtreferencia = new JTextField();
		txtreferencia.setEditable(false);
		txtreferencia.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtreferencia.setColumns(10);
		txtreferencia.setBounds(251, 440, 231, 20);
		add(txtreferencia);
		
		JLabel lblTipoDeEnvio = new JLabel("Tipo de envio");
		lblTipoDeEnvio.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblTipoDeEnvio.setBounds(251, 471, 231, 20);
		add(lblTipoDeEnvio);
		
		txtenvio = new JTextField();
		txtenvio.setEditable(false);
		txtenvio.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtenvio.setColumns(10);
		txtenvio.setBounds(251, 494, 231, 20);
		add(txtenvio);
		
		JLabel lblNumeroDeCajas = new JLabel("Numero de cajas");
		lblNumeroDeCajas.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNumeroDeCajas.setBounds(492, 417, 231, 20);
		add(lblNumeroDeCajas);
		
		txtcajas = new JTextField();
		txtcajas.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtcajas.setColumns(10);
		txtcajas.setBounds(492, 440, 231, 20);
		add(txtcajas);
		
		JLabel lblPaqueteria = new JLabel("Paqueteria");
		lblPaqueteria.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblPaqueteria.setBounds(492, 471, 231, 20);
		add(lblPaqueteria);
		
		cmbpaqueteria = new JComboBox();
		cmbpaqueteria.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		cmbpaqueteria.setModel(new DefaultComboBoxModel(new String[] {"ESTAFETA_STD", "ESTAFETA_EXP","FEDEX"}));
		cmbpaqueteria.setBounds(492, 494, 231, 20);
		add(cmbpaqueteria);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(204, 204, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.BLACK);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!revisar(txtpedido.getText(), txtreferencia.getText())) {
					Enviar enviar = new Enviar();
					enviar.execute();
				}else {
					JOptionPane.showMessageDialog(null, "Ya se creó la guia de este pedido");
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNewButton.setBounds(733, 417, 110, 97);
		btnNewButton.setFocusable(false);
		add(btnNewButton);
		
		txtdocentry = new JTextField();
		txtdocentry.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtdocentry.setEditable(false);
		txtdocentry.setColumns(10);
		txtdocentry.setBounds(131, 440, 110, 20);
		add(txtdocentry);
		
		actualiza actualiza = new actualiza();
		actualiza.execute();
	}
	
	private void actualizar(){
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		bd.conectar();
		bd.consultar("EXEC GUIAS_PEDIDOS");
		if(bd.resultado != null){
			try {
				while(bd.resultado.next()){
					modelo.addRow(new Object[] {bd.resultado.getString(1),bd.resultado.getString(2),42,"Local",bd.resultado.getString(3)});
				}
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}
    public void filtro(){
        tableFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(),0));
    }
    public boolean estafeta() {
    	
    	System.out.println("Se va a enviar por estafeta");
    	
        Label label = new Label();
        String etiqueta=null;
        String codigoRastreo = null;
        int i = 1;

        JsonObject jsonObject = label.jsonLabel(txtreferencia.getText(),txtpedido.getText(), Integer.parseInt(txtcajas.getText()),cmbpaqueteria.getSelectedItem().toString());

        if(jsonObject == null) {
        	return false;
        }
        
        JsonArray arraylbl = new JsonArray();

        arraylbl = (JsonArray) jsonObject.get("waybills");
        
        System.out.println("Traking code: \n" + arraylbl.get(0).getAsJsonObject().get("trackingCode").toString().replace("\"",""));
        
        System.out.println("Se va a actualizar en SAP");
        System.out.println(guiaSap(Integer.parseInt(txtdocentry.getText()),arraylbl.get(0).getAsJsonObject().get("trackingCode").toString().replace("\"","")));
        System.out.println("Termino proceso de actualizacion");

        for(int j = 0; j < arraylbl.size(); j++) {
        	JsonObject labelNow = new JsonObject();
        	labelNow = (JsonObject) arraylbl.get(j);
        	
        	etiqueta = labelNow.get("labelUrl").toString().replace("\"","");
        	codigoRastreo = labelNow.get("trackingCode").toString().replace("\"","");
        	
    		System.out.println("Etiqueta: \n" + etiqueta);
    		System.out.println("Codigo de rastreo: \n" + codigoRastreo);
        	
            bd.ejecutar("insert into GuiasB2C_Enviadas_Recibidas ([NumPedidoSAP],[ReferenciaB2C],[LinkGuia],[NumCajas],[Paqueteria]) " +
                    "values ('"+txtpedido.getText()+"','"+txtreferencia.getText()+"','"+etiqueta+"','"+i+"/"+txtcajas.getText()+"','"+cmbpaqueteria.getSelectedItem().toString()+"') ");
        	bd.ejecutar("insert into [GuiasB2C_Bitacora] ([fecha],[evento],[usuario],[guia]) values (getdate(), 'creacion','"+user+"', '" + txtreferencia.getText() + "')");
        
        	
        }
        
//        while (iterator.hasNext()) {
//        	System.out.println("entro en while");
//        	JsonObject labelNow = new JsonObject();
//        	labelNow = iterator.next();
//            etiqueta = ((JsonObject) iterator.next()).get("labelUrl").toString().replace("\"","");
//            System.out.println("se tomo el url del label");
//            codigoRastreo = ((JsonObject iterator.)).get("trackingCode").toString().replace("\"","");
//            
//            System.out.println("Etiqueta:\n" + etiqueta);
//            System.out.println("Codigo de rastreo:\n" + codigoRastreo);
//            try{
//                bd.ejecutar("insert into GuiasB2C_Enviadas_Recibidas ([NumPedidoSAP],[ReferenciaB2C],[LinkGuia],[NumCajas],[Paqueteria]) " +
//                                    "values ('"+txtpedido.getText()+"','"+txtreferencia.getText()+"','"+etiqueta+"','"+i+"/"+txtcajas.getText()+"','"+cmbpaqueteria.getSelectedItem().toString()+"') ");
//                bd.ejecutar("insert into [GuiasB2C_Bitacora] ([fecha],[evento],[usuario],[guia]) values (getdate(), 'creacion','"+user+"', '" + txtreferencia.getText() + "')");
//                i++;
//            }catch(Exception e){
//                System.out.println("Error de Excepcion de try: "+e);
//                return false;
//            }
//        }
        
        System.out.println("retorno true");
        
        return true;
    }
    private void enviar() {
    	System.out.println("ENVIAR_1");
        if(Integer.parseInt(txtcajas.getText().toString()) > 0){
        	System.out.println(txtcajas.getText());
        	if(cmbpaqueteria.getSelectedItem().equals("ESTAFETA_STD") || cmbpaqueteria.getSelectedItem().equals("ESTAFETA_EXP")) {
        		System.out.println("1");
        		System.out.println("se va a enviar estafeta");
        		if(estafeta()) {
        			System.out.println("Se creo con exito 200");
        			JOptionPane.showMessageDialog(null, "Se creo la guia con exito!","cloe | Guias", JOptionPane.INFORMATION_MESSAGE);	
        		}else {
        			JOptionPane.showMessageDialog(null, "No se obtuvo respuesta de la API, contacte a su proveedor de sistemas.","cloe | Guias", JOptionPane.ERROR_MESSAGE);	
        		}
                
        	}else if(cmbpaqueteria.getSelectedItem().equals("FEDEX") ) {
        		System.out.println("se va a enviar fedex: " + table.getValueAt(table.getSelectedRow(), 0).toString());
        		ShipWebServiceClient envioFedEx = new ShipWebServiceClient();
        		if(envioFedEx.crearGuia(table.getValueAt(table.getSelectedRow(), 0).toString()).equals("")) {
        	    	JOptionPane.showMessageDialog(null, "No se obtuvo respuesta de la API, contacte a su proveedor de sistemas.","cloe | Guias", JOptionPane.ERROR_MESSAGE);
        		}else {
        			JOptionPane.showMessageDialog(null, "Se creo la guia con exito!","cloe | Guias", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        }else{
        	System.out.println("2");
            if(txtcajas.getText().equals("") || Integer.parseInt(txtcajas.getText().toString()) <= 0){
                JOptionPane.showMessageDialog(null, "Inserte el numero de cajas");
            }
            System.out.println("3");
	        txtcajas.setText("0");
        }
        System.out.println("4");
        txtcajas.setText("0");
        System.out.println("5");
    }
    private boolean revisar(String pedido, String referencia){
    	boolean resp = true;
    	bd.consultar("if exists (\r\n" + 
    				 "	select [NumPedidoSAP],[ReferenciaB2C] \r\n" + 
    				 "	from [GuiasB2C_Enviadas_Recibidas] \r\n" + 
    				 "	where [NumPedidoSAP] = '"+pedido+"'\r\n" + 
    				 "	and [ReferenciaB2C] = '"+referencia+"'\r\n" + 
    				 "	)\r\n" + 
    				 "begin\r\n" + 
    				 "	select top 1 'si' from [GuiasB2C_Enviadas_Recibidas] \r\n" + 
    				 "end\r\n" + 
    				 "\r\n" + 
    				 "else\r\n" + 
    			 	 "	select top 1 'no' from [GuiasB2C_Enviadas_Recibidas] ");
    	try {
			while(bd.resultado.next()) {
				if(bd.resultado.getString(1).toString().equals("si")) {
					resp = true;
				}else {
					resp = false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return resp;
    }
    
    private String guiaSap(int docEntry, String guia){
    	System.out.println("Inicia proceso de actualiacion en SAP");
    	try {
    		System.out.println("Conectando con SAP...");
    		ConexionSap sap = new ConexionSap();
    		sap.conectar();
    		System.out.println("Ya se conecto");
    		System.out.println("Buscando el pedido...");
			IDocuments pedido = SBOCOMUtil.getDocuments(sap.company, SBOCOMConstants.BoObjectTypes_Document_oOrders, docEntry);
			System.out.println("Ya se encontro el pedido");
			System.out.println("Dato en campo: " + pedido.getUserFields().getFields().item("U_NumdeGuia").getValue());
			pedido.getUserFields().getFields().item("U_NumdeGuia").setValue(guia);
			System.out.println("actualizando");
			if(pedido.update() == 0) {
				
				sap.company.disconnect();
				return "ok";
			}else {
				sap.company.disconnect();
				System.out.println("Error SAP" + sap.company.getLastErrorDescription());
				return "Error SAP: " + sap.company.getLastErrorDescription();
			}
			
			
    	} catch (SBOCOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
    }
    
    class actualiza extends SwingWorker<Void,Void>{

		@Override
		protected Void doInBackground() throws Exception {
			// TODO Auto-generated method stub
			procesando.setVisible(true);
			actualizar();
			return null;
		}
		@Override
		protected void done() {
			// TODO Auto-generated method stub
			procesando.setVisible(false);
		}
    }
    class Enviar extends SwingWorker<Void,Void>{

		@Override
		protected Void doInBackground() throws Exception {
			// TODO Auto-generated method stub
			procesando.setVisible(true);
			enviar();
			return null;
		}
		@Override
		protected void done() {
			// TODO Auto-generated method stub
			procesando.setVisible(false);
		}
    }	
}