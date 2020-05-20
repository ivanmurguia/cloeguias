package comunicacion.guias.ep;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.MailLogger;

public class Mail {
	private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
	    String remitente = "cloeinforma@gmail.com";
	    String clave = "Cloe.12345";

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", clave);
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipients(Message.RecipientType.TO, destinatario);
	        message.addRecipients(Message.RecipientType.CC, "ivanm@oemoda.com");
	        message.setSubject(asunto);
	        message.setText(cuerpo);
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, clave);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();
	    }
	}

	public static void main(String[] args) {
//		java.net.URL classUrl = Mail.getClass().getResource("com.sun.mail.util.TraceInputStream");
		java.net.URL classUrl = Mail.class.getClass().getResource("com.sun.mail.util.TraceInputStream");
		System.out.println(classUrl.getFile());
	    String destinatario =  "yordyg@oemoda.com";
	    String asunto = "Informacion importante";
	    String cuerpo = "Moy es un gay igual que tu joto";

//	    enviarConGMail(destinatario, asunto, cuerpo);
	}

}
