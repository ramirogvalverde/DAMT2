package conexion;




import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Clase para rgestionar la conexion a la BBDDD
 * @author Ramiro
 */
public class ConexionBBDD {
    
    //Datos necesarios para configurar la conexión a la base de datos
    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // esto por lo que entiendo utiliza el driver que bajamos (el jar)
    static final String USER = "root"; 
    static final String PASS = "";
    static final String BD = "ubisoft"; // nombre de la base de datos
   
    static final String IP = "localhost";
    
    //Todos los parametros para conectar a la BBDD
    static final String DB_URL = "jdbc:mysql://"+ IP +":3306/"+BD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
       
    
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
