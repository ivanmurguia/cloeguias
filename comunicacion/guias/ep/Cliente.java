package comunicacion.guias.ep;

import java.sql.SQLException;

public class Cliente {
	String pedido;
	String name;
	String company;
	String phone;
	String street;
	String city;
	String state;
	String postalCode;
	String countryCode;
	
	public Cliente(String pedido) {
		this.pedido = pedido;
		ConexionBD db = new ConexionBD();
		db.consultar("SELECT\r\n" + 
				"	t0.CardName [name],\r\n" + 
				"	t0.CardName [company],\r\n" + 
				"	ISNULL(t2.Phone1,'0') phone,\r\n" + 
				"	t1.StreetS street,\r\n" + 
				"	t1.CityS city,\r\n" + 
				"	t1.StateS [state],\r\n" + 
				"	t1.ZipCodeS postalCode,'mx' countryCode FROM \r\n" + 
				"[OE_MODA2017].[dbo].[ORDR] t0\r\n" + 
				"INNER JOIN [OE_MODA2017].[dbo].[RDR12] t1 ON t0.DocEntry = t1.DocEntry\r\n" + 
				"INNER JOIN [OE_MODA2017].[dbo].[OCRD]  t2 ON t0.CardCode = t2.CardCode\r\n" + 
				"WHERE DocNum = '"+pedido+"'");//'"+pedido+"'");
		try {
			while(db.resultado.next()) {
				this.name = db.resultado.getString(1);
				this.company = db.resultado.getString(2);
				this.phone = "0";//db.resultado.getString(3);
				this.street = db.resultado.getString(4);
				this.city = db.resultado.getString(5);
				this.state = db.resultado.getString(6);
				this.postalCode = db.resultado.getString(7);
				this.countryCode = db.resultado.getString(8);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this.phone);
		System.out.println(this.street);
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.postalCode);
		System.out.println(this.countryCode);
	}
	
	public String getPedido() {
		return pedido;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public String getPhone() {
		return phone;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
}
