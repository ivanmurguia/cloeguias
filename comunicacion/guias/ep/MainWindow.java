package comunicacion.guias.ep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JPanel workArea;
	public JLabel lbluser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/recursos/oe3_opt.jpg")));
		setTitle("cloe | Guias");
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1028, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Guias");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(581, 0, 160, 141);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/CLOE_LAYOUT_v.png")));
		lblNewLabel_2.setBounds(470, 0, 111, 141);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/CLOE_LAYOUT_v copia 4.png")));
		lblNewLabel.setBounds(0, 0, 1024, 140);
		contentPane.add(lblNewLabel);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(new Color(204, 204, 204));
		Menu.setBounds(0, 140, 175, 530);
		contentPane.add(Menu);
		Menu.setLayout(null);

		JButton btnNewButton = new JButton("  Pedidos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				workArea.removeAll();
				Pedidos pedidos = new Pedidos();
				pedidos.user = lbluser.getText();
				pedidos.setBounds(0,0,workArea.getWidth(),workArea.getHeight());
				pedidos.setVisible(true);
				workArea.add(pedidos);
				workArea.repaint();
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/boxw.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.DARK_GRAY);
				btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/box.png")));
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		btnNewButton.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/box.png")));
		btnNewButton.setBounds(0, 10, 170, 40);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		Menu.add(btnNewButton);

		JButton btnGuias = new JButton("  Guias     ");
		btnGuias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				workArea.removeAll();
				Guias guias = new Guias();
				guias.user = lbluser.getText();
				guias.setBounds(0,0,workArea.getWidth(),workArea.getHeight());
				guias.setVisible(true);
				workArea.add(guias);
				workArea.repaint();
			}
		});
		btnGuias.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGuias.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/warehousew.png")));
				btnGuias.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGuias.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/warehouse.png")));
				btnGuias.setForeground(Color.DARK_GRAY);
			}
		});
		btnGuias.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/warehouse.png")));
		btnGuias.setForeground(Color.DARK_GRAY);
		btnGuias.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		btnGuias.setFocusable(false);
		btnGuias.setContentAreaFilled(false);
		btnGuias.setBorderPainted(false);
		btnGuias.setBorder(null);
		btnGuias.setBackground(new Color(204, 204, 204));
		btnGuias.setBounds(0, 60, 170, 40);
		Menu.add(btnGuias);

		JButton btnReporte = new JButton("  Reporte ");
		btnReporte.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/tables.png")));
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				workArea.removeAll();
				Registros registros = new Registros("reportes");
				registros.setBounds(0,0,workArea.getWidth(),workArea.getHeight());
				registros.setVisible(true);
				workArea.add(registros);
				workArea.repaint();
			}
		});
		btnReporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReporte.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/tablesw.png")));
				btnReporte.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReporte.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/tables.png")));
				btnReporte.setForeground(Color.DARK_GRAY);
			}
		});
		btnReporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReporte.setForeground(Color.DARK_GRAY);
		btnReporte.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		btnReporte.setFocusable(false);
		btnReporte.setContentAreaFilled(false);
		btnReporte.setBorderPainted(false);
		btnReporte.setBorder(null);
		btnReporte.setBackground(new Color(204, 204, 204));
		btnReporte.setBounds(0, 111, 170, 40);
		Menu.add(btnReporte);

		JButton btnRegistros = new JButton("  Registros");
		btnRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				workArea.removeAll();
				Registros registros = new Registros("registros");
				registros.setBounds(0,0,workArea.getWidth(),workArea.getHeight());
				registros.setVisible(true);
				workArea.add(registros);
				workArea.repaint();
			}
		});
		btnRegistros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRegistros.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/clipboardsw.png")));
				btnRegistros.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistros.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/clipboards.png")));
				btnRegistros.setForeground(Color.DARK_GRAY);
			}
		});
		btnRegistros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistros.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/clipboards.png")));
		btnRegistros.setForeground(Color.DARK_GRAY);
		btnRegistros.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		btnRegistros.setFocusable(false);
		btnRegistros.setContentAreaFilled(false);
		btnRegistros.setBorderPainted(false);
		btnRegistros.setBorder(null);
		btnRegistros.setBackground(new Color(204, 204, 204));
		btnRegistros.setBounds(0, 162, 170, 40);
		Menu.add(btnRegistros);

		workArea = new JPanel();
		workArea.setBackground(Color.WHITE);
		workArea.setBounds(175, 140, 853, 530);
		contentPane.add(workArea);
		workArea.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainWindow.class.getResource("/recursos/CLOE_LAYOUT_v copia 5.png")));
		lblNewLabel_1.setBounds(0, 198, 305, 288);
		workArea.add(lblNewLabel_1);

		lbluser = new JLabel("USER");
		lbluser.setHorizontalAlignment(SwingConstants.RIGHT);
		lbluser.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbluser.setForeground(Color.WHITE);
		lbluser.setBounds(858, 669, 154, 46);
		contentPane.add(lbluser);
	}
}