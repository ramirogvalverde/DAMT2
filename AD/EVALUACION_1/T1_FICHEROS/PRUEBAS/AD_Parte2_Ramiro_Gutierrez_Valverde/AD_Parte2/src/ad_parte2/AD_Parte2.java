/*
 2. EJERCICIO 2. Realiza un programa en java que realice estas dos operaciones sobre un fichero binario que almacena objetos de tipo JUEGO,
donde cada juego está identificado por una clave única, un título y un PEGI. Operaciones:



2)     Método que borra un JUEGO del fichero anterior, localizado a partir del identificador.

3)     Documenta bien el código y genera el javadoc.
 */
package ad_parte2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class AD_Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        insertaObjetoEnFichero("Juegos.txt", 1, "Mario", 18);

    }

    /**
     * Método que recibe el nombre del fichero y un objeto para añadir al
     * fichero. El método comprueba que no exista el objeto que se quiere
     * añadir, es decir, que no esté almacenado otro objeto con la misma clave.
     * Siempre se añade contenido al fichero
     *
     * @param fichero nombre del fichero que se quiere crear que almacena los
     * juegos.
     * @param clave clave del juego. numérico.
     * @param titulo titulo del juego. numérico.
     * @param pegi numero pegi del juego
     *
     */
    public static void insertaObjetoEnFichero(String fichero, int clave, String titulo, int pegi) {

        File juegos = new File(fichero);
        Juego juego1 = new Juego(clave, titulo, pegi);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(juegos);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Juego(clave, titulo, pegi));
            System.out.println("Juego añadido correctamente");

        } catch (FileNotFoundException ex) {
            System.err.println("error en fichero");
        } catch (IOException ex) {
            System.err.println("io exception");
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                System.err.println("problema al cerrar el archivo");
            }

        }

    }

    /*
     * Método que borra un JUEGO del fichero anterior, localizado a partir del identificador
     * @param clave clave del juego. numérico. sirve para identificar el fichero a borrar
     * 
     */
    public static void borraJuego(String clave) {

        File fichero;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Juego juego2 = new Juego();

        try {
            fichero = new File("Juegos.txt");
            if (fichero.exists()) {
                fis = new FileInputStream(fichero);
                ois = new ObjectInputStream(fis);

                while (fis.available() > 0) {
                    juego2 = (Juego) ois.readObject();

                }
            }

        } catch (FileNotFoundException fnf) {
            System.err.println("archivo no encontrado");
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase Persona no encontrada");
        } catch (IOException ex) {
            System.err.println("IO Exception");
        } finally {
            try {
                if (fis != null) {
                    ois.close();
                    fis.close();
                }
            } catch (IOException ioe) {
                System.err.println("Algo ha ido mal con el cierre del fichero");
            }
        }
    }

}
