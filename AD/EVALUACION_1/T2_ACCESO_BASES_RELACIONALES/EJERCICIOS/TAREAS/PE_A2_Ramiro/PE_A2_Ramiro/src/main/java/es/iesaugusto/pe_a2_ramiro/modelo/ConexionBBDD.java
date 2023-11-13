package es.iesaugusto.pe_a2_ramiro.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Gestión de la conexión a la BBDDD
 *
 * @author Ramiro
 */
public class ConexionBBDD {

    private static ConexionBBDD instance = null;
    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String USER;
    private static String PASS;
    static final String BD = "PE_A2_Ramiro";
    static final String IP = "localhost";

    static final String DB_URL = "jdbc:mysql://" + IP + ":3306/" + BD + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static String getUSER() {
        return USER;
    }

    public static void setUSER(String USER) {
        ConexionBBDD.USER = USER;
    }

    public static String getPASS() {
        return PASS;
    }

    public static void setPASS(String PASS) {
        ConexionBBDD.PASS = PASS;
    }

    

    
    private ConexionBBDD() throws SQLException{

        try {

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);         

        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }

    }
    public static ConexionBBDD getInstance() throws SQLException {
        if (instance == null) {

            instance = new ConexionBBDD();

        }
        return instance;
    }
    
    public static Connection getConnection() {
        return con;
    }

    /**
     * Metodo para desconectar la BBDD
     */
    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
