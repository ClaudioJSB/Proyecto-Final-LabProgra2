package DAO;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guto
 */
public class Usuario {
     static Connection con = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public Usuario() {
        if (con == null) {
            con = (Connection) Conexion.iniciarConexion();
        }
    }
    //Insertar datos en la tabla
    public boolean insertar(String nombre, String clave){
        boolean respuesta = false;
        try{
            statement = con.createStatement();
            String sql = "INSERT INTO  user " + 
                                 " VALUES (null, '" + nombre + "', '" + clave + "')";
            statement.executeUpdate(sql);
            respuesta = true;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
}
