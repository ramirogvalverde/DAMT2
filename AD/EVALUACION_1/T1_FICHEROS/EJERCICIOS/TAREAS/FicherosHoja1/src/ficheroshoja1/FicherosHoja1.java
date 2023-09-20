package ficheroshoja1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 *
 * @author ramirogvalverde DAMT210
 *
 */
public class FicherosHoja1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        escribeFicheroTxt("Esto es el ejemplo del ejercicio 1 que genera un fichero a partir de un texto dado\n");
        leeFicheroTxt("fichero.txt");
        escribeFicheroPropiedades();
        leeFicheroPropiedades();
    }

    /*1. Crea un método en java que escriba en un fichero de texto.*/
    /**
     * Método que escribe un texto dado en un archivo .txt de nombre Fichero1.
     *
     * @param texto Contenido (texto) del fichero que se quiere escribir.
     */
    public static void escribeFicheroTxt(String texto) {

        try {
            FileWriter fw = new FileWriter("fichero.txt", true);
            fw.write(texto);
            fw.close();
            System.out.println("El fichero se ha escrito correctamente\n");

        } catch (IOException ex) {
            System.err.println("Ocurrió un error al escribir en el fichero");
        }

    }

    /*2. Crea un método en java que lea un fichero de texto línea a línea.*/
    /**
     * Método para leer un archivo existente. (Sin BufferedReader)
     *
     * @param fichero nombre del fichero que se quiere leer (con extensión).
     */
    public static void leeFicheroTxt(String fichero) {

        try {
            FileReader fr = new FileReader("fichero.txt");
            int caracter;
            System.out.println("Contenido del archivo: " + fichero + ":");
            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
            fr.close();
        } catch (IOException ioe) {
            System.out.println("Ocurrió un error al leer el archivo");
        }

    }

    /*3. Crea un método en java que escriba en un fichero de configuración los parámetros de
         conexión utilizando las propiedades de setProperty de System Properties.
         
         USER = administrador
         PASSW = Admin-123
         SERVER = localhost
         PORT = 3306*/
    /**
     * Método que escribe el fichero configuracion.props que guarda unas
     * propiedades de System. No recibe ningún parámetro.
     */
    public static void escribeFicheroPropiedades() {
        File f = new File("configuracion.props");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            if (f.exists()) {
                f.delete();
            }
            f.createNewFile();

            Properties prop = new Properties(System.getProperties());

            prop.setProperty("USER", "administrador");
            prop.setProperty("PASSW", "Admin-123");
            prop.setProperty("SERVER", "localhost");
            prop.setProperty("PORT", "3306");

            oos.writeObject(prop);
            oos.close();
            fos.close();

            System.out.println("El archivo configuracion.Props ha sido creado con éxito");

        } catch (IOException ioex) {
            System.err.println("Ha ocurrido un error durante la escritura");
        }

    }

    /*4. Crea un método en java que lea las propiedades de un fichero de propiedades.props*/
    /**
     * Método que lee las propiedades de un fichero .props
     */
    public static void leeFicheroPropiedades() {
        File f = new File("configuracion.props");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            Properties prop = new Properties();

            while (fis.available() > 0) {
                prop = (Properties) ois.readObject();
                System.out.println(prop.toString());
            }

            ois.close();
            fis.close();

        } catch (IOException ioex) {
            System.err.println("Ha ocurrido un error durante la escritura");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Clase no encontrada");
        }

    }

}
