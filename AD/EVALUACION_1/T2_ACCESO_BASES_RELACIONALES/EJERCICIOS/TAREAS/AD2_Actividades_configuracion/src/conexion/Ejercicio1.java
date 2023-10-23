package conexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author Ramiro
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1: llamo al método que creo fuera del main
        leerFichero();
    }

    /* 1. Realiza un proyecto en Netbeans que lea los parámetros o propiedades de conexión de un fichero.
    El fichero configuración.props  */
    
    public static void leerFichero() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(new File("configuracion.props")));

            System.out.println(properties.get("DB"));
            System.out.println(properties.get("SERVER"));
            System.out.println(properties.get("PORT"));
            System.out.println(properties.get("USER"));
            System.out.println(properties.get("PASSWORD"));

        } catch (FileNotFoundException ex) {
            System.err.println("error File not found");
        } catch (IOException ex) {
            System.err.println("error IO");
        }
    }

}
