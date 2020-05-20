package comunicacion.guias.ep;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JRadioButton;

public class Guias extends JPanel {
	private JTextField txtfiltro;
	private JTable table;
	private JLabel nprint, procesando;
    private TableRowSorter tableFiltro;
    private TableRowSorter tableFiltro2;
    private JRadioButton rddoble;
    public String user;
	ConexionBD bd = new ConexionBD();
	/**
	 * Create the panel.
	 */
	public Guias() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		procesando = new JLabel();
		procesando.setIcon(new ImageIcon(Guias.class.getResource("/recursos/oegif.gif")));
		procesando.setHorizontalAlignment(SwingConstants.CENTER);
		procesando.setBounds(0, 0, 874, 551);
		procesando.setVisible(false);
		add(procesando);
		
		JLabel label = new JLabel("Pedido SAP");
		label.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label.setBounds(10, 11, 104, 14);
		add(label);
		
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
		txtfiltro.setColumns(10);
		txtfiltro.setBounds(10, 34, 231, 20);
		add(txtfiltro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 833, 449);
		add(scrollPane);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de pedido", "Cajas", "Link de guia", "Imprimir"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(118);
		table.getColumnModel().getColumn(0).setMaxWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(41);
		table.getColumnModel().getColumn(1).setMaxWidth(41);
		table.getColumnModel().getColumn(2).setPreferredWidth(350);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setMaxWidth(50);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setFocusable(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Guias.class.getResource("/recursos/printw.png")));
				btnNewButton.setBackground(new Color(204, 204, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(Guias.class.getResource("/recursos/print.png")));
				btnNewButton.setBackground(Color.WHITE);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Guias.class.getResource("/recursos/print.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprime imprime = new imprime();
				imprime.execute();
			}
		});
		btnNewButton.setBounds(803, 11, 40, 43);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setIconTextGap(0);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nprint.setText(String.valueOf(Integer.parseInt(nprint.getText()) + 1));
			}
		});
		btnNewButton_1.setBounds(753, 11, 40, 10);
		btnNewButton_1.setBackground(new Color(204, 204, 204));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		add(btnNewButton_1);
		
		JButton button = new JButton("-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button.setBorderPainted(false);
		button.setVerticalAlignment(SwingConstants.TOP);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nprint.getText().equals("1")) {
					return;
				}
				nprint.setText(String.valueOf(Integer.parseInt(nprint.getText()) - 1));
			}
		});
		button.setBounds(753, 44, 40, 10);
		button.setBackground(new Color(204, 204, 204));
		button.setFocusable(false);
		button.setBorder(null);
		add(button);
		
		nprint = new JLabel("1");
		nprint.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		nprint.setHorizontalAlignment(SwingConstants.CENTER);
		nprint.setBounds(753, 19, 40, 25);
		add(nprint);
		
		rddoble = new JRadioButton("Pegatina");
		rddoble.setFocusable(false);
		rddoble.setFocusPainted(false);
		rddoble.setBackground(Color.WHITE);
		rddoble.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		rddoble.setBounds(656, 11, 91, 43);
		add(rddoble);

		actualiza actualiza = new actualiza();
		actualiza.execute();
	}
	private void imprimir() throws MalformedURLException, DocumentException, IOException {
        Label label = new Label();
        for(int i = 0; i < table.getRowCount(); i++){
            if(table.getValueAt(i, 3) != null){
            	String [] arrayString = table.getValueAt(i, 2).toString().split("/");
            	bd.ejecutar("insert into [GuiasB2C_Bitacora] ([fecha],[evento],[usuario],[guia]) values (getdate(), 'impresion','"+user+"', '" + arrayString[5] + "')");
                for(int j = 0; j < Integer.parseInt(nprint.getText()); j++){
    				label.printLabel(table.getValueAt(i, 2).toString());
    				if(rddoble.isSelected()) {
                        try {
    						Pdf(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString());
    					} catch (SQLException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    				}
                }
            }
        }
        for(int i = 0; i < table.getRowCount(); i++){
            table.setValueAt(null, i, 3);
        }
        nprint.setText("1");
	}
	private void actualizar() {
        try{
            bd.consultar("SELECT * FROM GuiasB2C_Enviadas_Recibidas order by NumPedidoSAP desc, NumCajas asc");
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			while(modelo.getRowCount() > 0) {
				modelo.removeRow(0);
			}
            while(bd.resultado.next()){
            	modelo.addRow(new Object[] {bd.resultado.getString(1),bd.resultado.getString(4),bd.resultado.getString(3)});
            }
        }catch(Exception e){
            System.out.println("error grave db: "+e);
        }
	}
    public void filtro(){
        tableFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(),0));
    }
    class imprime extends SwingWorker<Void,Void>{

		@Override
		protected Void doInBackground() throws Exception {
			// TODO Auto-generated method stub
			procesando.setVisible(true);
			imprimir();
			return null;
		}
		@Override
		protected void done() {
			// TODO Auto-generated method stub
			procesando.setVisible(false);
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
	public void Pdf(String orden,String caja) throws DocumentException, MalformedURLException, IOException, SQLException{
		 	String destinatario = "", cp = "", cliente = "", comentarios = "", fecha = "", po = "", transp = "";
	        PdfPCell celda = null;
	        Rectangle pageSize = new Rectangle(288f, 432f); //ancho y alto
            Document doc = new Document(pageSize,0,0,0,0);
		    Image imagen = Image.getInstance(MainWindow.class.getResource("/recursos/guiasbco_opt.png"));
		    PdfPTable tabla = new PdfPTable(2);
			bd.consultar("SELECT t0.CardName,t0.Address2,CONVERT(VARCHAR(10), t0.DocDueDate, 103), t0.NumAtCard,t0.Comments,t0.TrnspCode, t1.ZipCodeB " +
				     "FROM [OE_MODA2017].[dbo].[ORDR] t0 inner join [OE_MODA2017].[dbo].[RDR12] t1 on t0.DocEntry = t1.DocEntry WHERE DocNum = "+orden);
			while(bd.resultado.next()) {
				destinatario = bd.resultado.getString(1) + "\n" + bd.resultado.getString(2);
				fecha = bd.resultado.getString(3);
				po = bd.resultado.getString(4);
				comentarios = bd.resultado.getString(5);
				cp = bd.resultado.getString(7);
				if(bd.resultado.getString(6).equals("1")) {
					transp = "Express";
				}else {
					transp = "Terrestre";
				}
			}
			String[] parts = comentarios.split("Preguntar");
			cliente = parts[0].replace("Contacto: ", "");
		    tabla.setWidthPercentage(100f);
		    float[] medidaCeldas = {40f, 60f};
		    tabla.setWidths(medidaCeldas);
		    tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda = new PdfPCell(imagen);
		    celda.setColspan(2);
		    celda.setBorder(0);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Fecha",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setColspan(2);
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    Phrase frase = new Phrase(fecha);
		    celda = new PdfPCell(frase);
		    celda.setColspan(2);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Remitente",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Destinatario",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
            tabla.addCell(new Phrase("CLOE MODA SA de CV\nAv. Jalisco 1300 int 4\nCol. Real de Tesistan\nZapopan\nJalisco\nCP 45200",FontFactory.getFont("Century Gothic",9,Font.PLAIN,BaseColor.BLACK)));
            tabla.addCell(new Phrase(cliente.toUpperCase()+destinatario.replace("CLIENTE DE MOSTRADOR B2C", ""),FontFactory.getFont("Century Gothic",10,Font.PLAIN,BaseColor.BLACK)));
		    celda = new PdfPCell(new Phrase("CP",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Transporte",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase(cp,FontFactory.getFont("Century Gothic",9,Font.PLAIN,BaseColor.BLACK)));
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
            tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Estafeta " + transp,FontFactory.getFont("Century Gothic",9,Font.PLAIN,BaseColor.DARK_GRAY)));
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
            tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Orden",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("PO#",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("\n" + orden + "\n ",FontFactory.getFont("Century Gothic",16,Font.PLAIN,BaseColor.BLACK)));
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("\n" +po+ "\n ",FontFactory.getFont("Century Gothic",16,Font.PLAIN,BaseColor.BLACK)));
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Comentarios",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setColspan(2);
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase(comentarios,FontFactory.getFont("Century Gothic",9,Font.PLAIN,BaseColor.DARK_GRAY)));
		    celda.setColspan(2);
            tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase("Caja",FontFactory.getFont("Century Gothic",12,Font.PLAIN,BaseColor.WHITE)));
		    celda.setColspan(2);
		    celda.setBackgroundColor(BaseColor.BLACK);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
		    tabla.addCell(celda);
		    celda = new PdfPCell(new Phrase(caja,FontFactory.getFont("Century Gothic",20,Font.PLAIN,BaseColor.DARK_GRAY)));
		    celda.setColspan(2);
		    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		    celda.setVerticalAlignment(Element.ALIGN_CENTER);
            tabla.addCell(celda);
			FileOutputStream fis = new FileOutputStream("C:\\temp\\guias\\"+orden+caja.replace("/", "")+".pdf");
            PdfWriter.getInstance(doc, fis);
		    doc.open();
		    doc.add(tabla);
		    doc.close();
			Desktop.getDesktop().print(new File("C:\\temp\\guias\\"+orden+caja.replace("/", "")+".pdf"));
	}
}
