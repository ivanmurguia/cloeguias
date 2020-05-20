package comunicacion.guias.ep;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Registros extends JPanel {
	ConexionBD bd = new ConexionBD();
	private JTable table;

	public Registros(String tipo) {
		setLayout(null);
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exportar();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setIcon(new ImageIcon(Registros.class.getResource("/recursos/excelw.png")));
				button.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(Color.WHITE);
				button.setIcon(new ImageIcon(Registros.class.getResource("/recursos/excel.png")));
			}
		});
		button.setIcon(new ImageIcon(Registros.class.getResource("/recursos/excel.png")));
		button.setFocusable(false);
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(797, 11, 40, 43);
		add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 827, 458);
		add(scrollPane);
		
		if(tipo.equals("registros")) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Fecha", "Evento", "Usuario", "Guia"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(119);
			table.getColumnModel().getColumn(1).setPreferredWidth(50);
			table.getColumnModel().getColumn(2).setPreferredWidth(45);
			table.getColumnModel().getColumn(3).setPreferredWidth(80);
			scrollPane.setViewportView(table);
			actualizarRegistros();
			
		}else if(tipo.equals("reportes")) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Cliente", "eCommerce", "SAP", "Guia", "Mail"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(119);
			table.getColumnModel().getColumn(1).setPreferredWidth(50);
			table.getColumnModel().getColumn(2).setPreferredWidth(45);
			table.getColumnModel().getColumn(3).setPreferredWidth(80);
			table.getColumnModel().getColumn(4).setPreferredWidth(126);
			scrollPane.setViewportView(table);
			actualizarReportes();
		}
	}
	public void actualizarRegistros() {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		bd.conectar();
		bd.consultar("EXEC [dbo].[GUIAS_REGISTROS]");
		if(bd.resultado != null){
			try {
				while(bd.resultado.next()){
					modelo.addRow(new Object[] {bd.resultado.getString(1),bd.resultado.getString(2),bd.resultado.getString(3),bd.resultado.getString(4)});
				}
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}
	public void actualizarReportes() {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		bd.conectar();
		bd.consultar("EXEC [dbo].[GUIAS]");
		if(bd.resultado != null){
			try {
				while(bd.resultado.next()){
					modelo.addRow(new Object[] {bd.resultado.getString(1),bd.resultado.getString(2),bd.resultado.getString(3),bd.resultado.getString(4),bd.resultado.getString(5)});
				}
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}
	public void exportar() {
		if(table.getRowCount() > 0) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
			chooser.setFileFilter(filter);
			chooser.setDialogTitle("Cloe | Guias");
			chooser.setAcceptAllFileFilterUsed(false);
			if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				 List tb = new ArrayList();
				 List nom = new ArrayList();
				 tb.add(table);
				 nom.add("Guias enviadas B2C");
				 String file = chooser.getSelectedFile().toString().concat(".xls");
				 try {
					 Exporter e = new Exporter(new File(file), tb, nom);
					 if (e.export()) {
						 JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente", "cloe | Guias", JOptionPane.INFORMATION_MESSAGE);
					 }
				 } catch (Exception e) {
				 JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), "cloe | Guias", JOptionPane.ERROR_MESSAGE);
				 }
			}
		}else {
			JOptionPane.showMessageDialog(null, "No hay datos para exportar","cloe | Guias",JOptionPane.ERROR_MESSAGE);
		}
	}
}
