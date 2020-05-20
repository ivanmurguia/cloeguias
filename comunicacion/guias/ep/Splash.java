package comunicacion.guias.ep;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Splash extends JFrame implements Runnable{

	private JPanel contentPane;
	Thread hilo = null;
	/**
	* Launch the application.
	*/
	@Override
	public void run() {
	       // TODO Apéndice de método generado automáticamente
	       try {
	       this.setLocationRelativeTo(null);
	       this.setVisible(true);
	       hilo.sleep(2000);
	       this.dispose();
	       } catch (InterruptedException e) {
	                       e.printStackTrace();
	       }
	}
	public Splash() {
	       setUndecorated(true);
	       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   setBounds(50, 0, 1300, 740);
	       contentPane = new JPanel();
	       contentPane.setBackground(Color.BLACK);
	       contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	       setContentPane(contentPane);
	       contentPane.setLayout(null);
	
	       JLabel lblNewLabel = new JLabel("");
	       lblNewLabel.setBackground(Color.WHITE);
	       lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	       lblNewLabel.setIcon(new ImageIcon(Splash.class.getResource("/recursos/oeprocesando.gif")));
	       lblNewLabel.setBounds(100, 0, 1028, 740);
	       contentPane.add(lblNewLabel);
	}
}
