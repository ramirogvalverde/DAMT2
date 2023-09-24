package ficheroshoja2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class FicherosHoja2 {

    public static void main(String[] args) {

    }

    /*1. Crea un método para serializar un objeto de la clase Persona. Se trata de escribir en un
    fichero los datos de un objeto de tipo Persona.*/
    public static void serializarPersona(String nombre, String apellido, int telefono) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("personas.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Persona(nombre,apellido, telefono));
           
        } catch (FileNotFoundException ex) {
            System.err.println("archivo no encontrado");
        } catch (IOException ioe) {
            System.err.println("archivo no encontrado");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.err.println("problemas");
            }
        }
    }
    /*2. Crea un método para leer un objeto de tipo Persona del fichero creado anteriormente*/
    public static void leerPersona(String archivo){
        
        File fichero;
        FileInputStream fis =null;
        ObjectInputStream ois=null;
        
        fichero = new File("personas.dat");
        
        
        
    }
    
    
}
