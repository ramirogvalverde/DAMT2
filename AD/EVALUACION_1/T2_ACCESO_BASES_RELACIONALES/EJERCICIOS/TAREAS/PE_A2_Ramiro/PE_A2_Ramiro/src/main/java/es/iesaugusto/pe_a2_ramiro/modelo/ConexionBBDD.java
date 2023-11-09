
package es.iesaugusto.pe_a2_ramiro.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Clase para rgestionar la conexion a la BBDDD
 * @author Ramiro
 */
public class ConexionBBDD {
    
   
    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String USER = ""; 
    private String PASS = "";
    static final String BD = "tienda"; 
    static final String IP = "localhost";
    
    static final String DB_URL = "jdbc:mysql://"+ IP +":3306/"+BD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
    
    
    
    
    /**
     * Metodo para crear una conexion a la BBDD
     * @return Objeto de la clase Connection
     */
    
    public Connection conectar (){
        
        try {

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            /*if (con != null) {
                System.out.println("conexion realizada");
            }*/
            
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
