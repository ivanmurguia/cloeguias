package comunicacion.guias.ep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionBD {
  private java.sql.Connection con = null;
  private final String url = "jdbc:sqlserver://";
  private final String userName = "sa";
  private final String password = "B1Admin";
  public Statement sentencia;
  public ResultSet resultado;
  
  private String URLconexion() {
  	return url + "192.168.1.26;databaseName=SAP_AUX;";
  }
  public java.sql.Connection conectar() {
      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          con = java.sql.DriverManager.getConnection(URLconexion(), userName, password);
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error de conexion: \n"+ e.getMessage(),"Cloe",JOptionPane.ERROR_MESSAGE);
      }
      return con;
  }
  public void desconectar() {
      try {
          if (con != null) {
              con.close();
          }
          con = null;
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
  public ResultSet consultar(String sql) {
      try {
          sentencia = conectar().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          resultado = sentencia.executeQuery(sql);
      } catch (SQLException e) {
          e.printStackTrace();
          return null;
      }
      return resultado;
  }
  public boolean ejecutar(String sql) {
      try {
          sentencia = conectar().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          sentencia.executeUpdate(sql);
          sentencia.close();
      } catch (SQLException e) {
          e.printStackTrace();
          return false;
      }
      return true;
  }
}
