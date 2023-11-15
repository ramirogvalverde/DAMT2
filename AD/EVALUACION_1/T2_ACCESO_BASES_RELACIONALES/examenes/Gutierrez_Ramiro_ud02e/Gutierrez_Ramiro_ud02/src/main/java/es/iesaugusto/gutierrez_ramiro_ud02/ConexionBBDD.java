
package es.iesaugusto.gutierrez_ramiro_ud02;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Clase para gestionar la conexion a la BBDDD
 * @author Ramiro
 */
public class ConexionBBDD {
    
   
    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String USER = "ramiro"; 
    static final String PASS = "1234";
    static final String BD = "ventas"; 
    static final String IP = "localhost";
    
   
    static final String DB_URL = "jdbc:mysql://"+ IP +":3306/"+BD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
       
    
    /**
     * Metodo para crear una conexion a la BBDD
     * @return Objeto de la clase Connection
     */
    public Connection conectar (){
        
        try {

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            
        } catch (SQLException ex) {
            System.err.println("problemas de conexión\n" + ex.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
        
        return con;
        
    }

    /**
     * Metodo para desconectar la BBDD
     */
    public void desconectar(){
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
