package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Ramiro
 *
 */
public class Metodos {
    
    private static ArrayList<Producto> lista = new ArrayList();

    public static void insertarProducto(String archivo, String nombreProducto, double precioProducto) {
        
        Producto producto1 = new Producto(nombreProducto, precioProducto);
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            lista.add(producto1);
            oos.writeObject(lista);

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

    public static ArrayList<Producto> listarProductos(String archivo) {

        ArrayList<Producto> lista2 = new ArrayList();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            while (fis.available() >0) {
                lista2= (ArrayList<Producto>) ois.readObject();
            }
            return lista2;

        } catch (FileNotFoundException ex) {
            System.err.println("error en fichero");
        } catch (IOException ex) {
            System.err.println("io exception");
        } catch (ClassNotFoundException ex) {
            System.err.println("clase no encontrada");
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                System.err.println("problema al cerrar el archivo");
            }
            
        }
        return null;

    }

}
