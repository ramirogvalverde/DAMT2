
package bbddconexion;

import java.sql.Connection;

/**
 *
 * @author Ramiro
 */
public class BBDDConexion {
    private static ConexionBBDD conBD = new ConexionBBDD();
    private static Connection con = conBD.conectar();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
