
package es.iesaugusto.pe_a2_ramiro.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Ramiro
 */
public class ConsultasBBDD {
    
    //Comentaré solo uno de los métodos, los demás son iguales 
    
    //Método que retorna una lista de arreglos de cadenas con los resultados de la consulta
    public static ArrayList<String[]> juego() {

        // Lista para almacenar los resultados de la consulta
        ArrayList<String[]> lista = new ArrayList<>();
        
        // Obtiene una conexión a la base de datos utilizando el patrón Singleton
        Connection con;

        // Objetos para preparar y ejecutar la consulta SQL
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Consulta SQL para seleccionar todos los registros de la tabla "juego"
        String select = "SELECT * FROM juego";

        try {
            // Obtiene la instancia única de la conexión a la base de datos
            con = ConexionBBDD.getInstance().getConnection();

            // Prepara la consulta SQL
            ps = con.prepareStatement(select);

            // Ejecuta la consulta y obtiene los resultados
            rs = ps.executeQuery();

            // Itera sobre los resultados y los agrega a la lista
            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
            }

        } catch (NumberFormatException e) {
            // Maneja errores de conversión de número
            System.err.println("Error de conversión de número");
        } catch (SQLException ex) {
            // Maneja errores en la ejecución de la consulta SQL
            System.err.println("Error en el select");
        } finally {
            // Cierra los recursos (ResultSet, PreparedStatement) para evitar fugas de memoria
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar los recursos");
            }
        }

        // Retorna la lista de resultados
        return lista;
    }
    
    public static ArrayList<String[]> jugador() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select * from jugador";

        try {
            con = ConexionBBDD.getInstance().getConnection();

            ps = con.prepareStatement(select);

            rs = ps.executeQuery();

            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
            }

        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            System.err.println("Error en el select");
        }
        return lista;
    }
    public static ArrayList<String[]> jugadorSesionJuego() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select alias,juego.nombre,fecha_conexion from jugador inner join sesion using (id_jugador) inner join juego using (id_juego)";

        try {
            con = ConexionBBDD.getInstance().getConnection();

            ps = con.prepareStatement(select);

            rs = ps.executeQuery();

            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
            }

        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            System.err.println("Error en el select");
        }
        return lista;
    }
    
}
