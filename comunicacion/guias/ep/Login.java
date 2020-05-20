package comunicacion.guias.ep;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Login extends JFrame {

       private JPanel contentPane;
       public JTextField txtUser;
       private JLabel procesando;
       private JPasswordField txtPass;
       private ResultSet resultado;
       ConexionBD baseDatos = new ConexionBD();

       /**
       * Launch the application.
       */
       public static void main(String[] args) {
             EventQueue.invokeLater(new Runnable() {
                    public void run() {
                           try {
                                  Login frame = new Login();
                                  frame.setVisible(true);
              					  new Thread (new Splash()).start();
                           } catch (Exception e) {
                                  e.printStackTrace();
                                  JOptionPane.showMessageDialog(null, "error" +e);
                           }
                    }
             });
       }

       /**
       * Create the frame.
       */
       public Login() {
       		 setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/recursos/oe3_opt.jpg")));
             setUndecorated(true);
             setFont(new Font("Century Gothic", Font.BOLD, 12));
             setTitle("oe | Token - Login");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setBounds(100, 100, 412, 400);
             contentPane = new JPanel();
             contentPane.setBackground(Color.WHITE);
             contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
             setContentPane(contentPane);
             contentPane.setLayout(null);
             this.setLocationRelativeTo(null);

     		 procesando = new JLabel();
    		 procesando.setIcon(new ImageIcon(Guias.class.getResource("/recursos/oegif.gif")));
    		 procesando.setHorizontalAlignment(SwingConstants.CENTER);
    		 procesando.setBounds(0, 0, 412, 400);
    		 procesando.setVisible(false);
    		 getContentPane().add(procesando);
             
             JLabel lblNewLabel_3 = new JLabel("");
             lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
             lblNewLabel_3.setBorder(new LineBorder(Color.GRAY));
             lblNewLabel_3.setForeground(Color.BLACK);
             lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/recursos/man-user.png")));
             lblNewLabel_3.setBounds(0, 147, 40, 40);
             contentPane.add(lblNewLabel_3);
             
             JLabel lblNewLabel = new JLabel("");
             lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
             lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/recursos/cloe guias.PNG")));
             lblNewLabel.setBounds(0, 0, 412, 75);
             contentPane.add(lblNewLabel);
                          
             JLabel lblNewLabel_1 = new JLabel("Usuario");
             lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
             lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 50));
             lblNewLabel_1.setBounds(0, 86, 412, 50);
             contentPane.add(lblNewLabel_1);
             
             txtUser = new JTextField();
             txtUser.addKeyListener(new KeyAdapter() {
             	@Override
             	public void keyTyped(KeyEvent e) {
             		if(e.getKeyChar() == e.VK_ENTER) {
                 	   Ingresa entra = new Ingresa();
                 	   entra.execute();
             		}
             	}
             });
             txtUser.setHorizontalAlignment(SwingConstants.LEFT);
             txtUser.setFont(new Font("Century Gothic", Font.PLAIN, 40));
             txtUser.setBounds(43, 147, 369, 40);
             contentPane.add(txtUser);
             txtUser.setColumns(10);
             
             JLabel lblContrasea = new JLabel("Contrase\u00F1a");
             lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
             lblContrasea.setFont(new Font("Century Gothic", Font.PLAIN, 50));
             lblContrasea.setBounds(0, 198, 412, 50);
             contentPane.add(lblContrasea);
             
             txtPass = new JPasswordField();
             txtPass.addKeyListener(new KeyAdapter() {
             	@Override
             	public void keyTyped(KeyEvent e) {
             		if(e.getKeyChar() == e.VK_ENTER) {
                 	   Ingresa entra = new Ingresa();
                 	   entra.execute();
             		}
             	}
             });
             txtPass.setHorizontalAlignment(SwingConstants.LEFT);
             txtPass.setFont(new Font("Tahoma", Font.PLAIN, 40));
             txtPass.setBounds(43, 259, 369, 40);
             contentPane.add(txtPass);
             
             JLabel lblNewLabel_2 = new JLabel("");
             lblNewLabel_2.setToolTipText("Entrar");
             lblNewLabel_2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent arg0) {
                           lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/recursos/login (1).png")));
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                           lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/recursos/login.png")));
                    }
                    @Override
                    public void mouseClicked(MouseEvent arg0) {
                    	   Ingresa entra = new Ingresa();
                    	   entra.execute();
                    }
             });
             lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
             lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
             lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/recursos/login.png")));
             lblNewLabel_2.setBounds(210, 302, 94, 75);
             contentPane.add(lblNewLabel_2);
             
             JLabel label = new JLabel("");
             label.setIcon(new ImageIcon(Login.class.getResource("/recursos/key-tool.png")));
             label.setHorizontalAlignment(SwingConstants.CENTER);
             label.setForeground(Color.BLACK);
             label.setBorder(new LineBorder(Color.GRAY));
             label.setBounds(0, 259, 40, 40);
             contentPane.add(label);
             
             JLabel label_1 = new JLabel("");
             label_1.setToolTipText("Salir");
             label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
             label_1.setIcon(new ImageIcon(Login.class.getResource("/recursos/logout.png")));
             label_1.setHorizontalAlignment(SwingConstants.CENTER);
             label_1.setBounds(106, 302, 94, 75);
             label_1.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseEntered(MouseEvent arg0) {
                	 label_1.setIcon(new ImageIcon(Login.class.getResource("/recursos/logout_opt.png")));
                 }
                 @Override
                 public void mouseExited(MouseEvent e) {
                	 label_1.setIcon(new ImageIcon(Login.class.getResource("/recursos/logout.png")));
                 }
                 @Override
                 public void mouseClicked(MouseEvent arg0) {
                     dispose();
                 }
             });
             contentPane.add(label_1);
       }
       public void entrar(){
             if(txtUser.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inserte un usuario.","cloe | Guias",JOptionPane.ERROR_MESSAGE);
                    return;
             }
             if(txtPass.getText().equals("")){
                 	JOptionPane.showMessageDialog(null, "Inserte la contraseña.","cloe | Guias",JOptionPane.ERROR_MESSAGE);
                    return;
             }
             resultado = baseDatos.consultar("select * from [GuiasB2C_Usuarios] where [usuario] = '"+txtUser.getText()+"' and contraseña = '"+txtPass.getText()+"'");
             try {
                    if(resultado.next()){
                    	baseDatos.ejecutar("insert into [GuiasB2C_Bitacora] ([fecha],[evento],[usuario]) values (getdate(), 'login', '"+txtUser.getText().toUpperCase()+"')");
                        MainWindow menu = new MainWindow();
                        menu.lbluser.setText(txtUser.getText().toUpperCase());
                        menu.setVisible(true);
                        dispose();
                    }else{
                    	JOptionPane.showMessageDialog(null, "Verificar usuario y contraseña.","cloe | Guias",JOptionPane.ERROR_MESSAGE);
                    }
             } catch (SQLException e) {
                    // TODO Bloque catch generado automï¿½ticamente
                    e.printStackTrace();
             }
       }
       class Ingresa extends SwingWorker<Void,Void>{
	   		@Override
	   		protected Void doInBackground() throws Exception {
	   			// TODO Auto-generated method stub
	   			procesando.setVisible(true);
	   			entrar();
	   			return null;
	   		}
	   		@Override
	   		protected void done() {
	   			// TODO Auto-generated method stub
	   			procesando.setVisible(false);
	   		}
       }
}
