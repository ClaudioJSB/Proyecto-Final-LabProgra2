package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection iniciarConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        String serv = "jdbc:mysql://localhost:3306/usuario";
            String usuarioBD = "root";
            String passwordBD = "";
            conexion = DriverManager.getConnection(serv, usuarioBD, passwordBD);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR DB" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR SQL" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

}
