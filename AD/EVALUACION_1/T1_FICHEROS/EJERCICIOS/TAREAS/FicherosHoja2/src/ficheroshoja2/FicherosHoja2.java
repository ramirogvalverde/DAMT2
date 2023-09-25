package ficheroshoja2;

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
public class FicherosHoja2 {

    public static void main(String[] args) {
        serializarPersona("Ramiro", "Gutiérrez", 654094447);
        leerPersona("personas.dat");
        escribirBinarioPersona();
        leerEnArraylist();
    }

    /*1. Crea un método para serializar un objeto de la clase Persona. Se trata de escribir en un
    fichero los datos de un objeto de tipo Persona.*/
    public static void serializarPersona(String nombre, String apellido, int telefono) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("personas.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Persona(nombre, apellido, telefono));
            System.out.println("Fichero escrito corectamente");

        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado");
        } catch (IOException ioe) {
            System.err.println("Archivo no encontrado");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.err.println("Problemas");
            }
        }
    }

    /*2. Crea un método para leer un objeto de tipo Persona del fichero creado anteriormente*/
    public static void leerPersona(String archivo) {

        File fichero;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fichero = new File("personas.dat");
            if (fichero.exists()) {
                fis = new FileInputStream(fichero);
                ois = new ObjectInputStream(fis);

                while (fis.available() > 0) {
                    Persona p1 = (Persona) ois.readObject();
                    System.out.println("datos de la persona almacenada en el fichero:");
                    System.out.println(p1.toString());
                }
            }

        } catch (FileNotFoundException fnf) {
            System.err.println("archivo no encontrado");
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase Persona no encontrada");
        } catch (IOException ex) {
            Logger.getLogger(FicherosHoja2.class.getName()).log(Level.SEVERE, null, ex);
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

    /*3. Crea un método que escriba en un fichero binario un ArrayList de objetos de tipo Persona.*/
    public static void escribirBinarioPersona() {

        File fichero2 = null;
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;

        try {
            fichero2 = new File("personas2.dat");
            fos2 = new FileOutputStream(fichero2);
            oos2 = new ObjectOutputStream(fos2);

            Persona p1 = new Persona("Albano", "CafeConPalito", 600000000);
            Persona p2 = new Persona("Daniel", "CafeConPalito", 611111111);
            Persona p3 = new Persona("Ramiro", "CafeConPalito", 622222222);
            Persona p4 = new Persona("Carmen", "CafeConPalito", 633333333);

            ArrayList<Persona> ListaPersonas = new ArrayList();
            ListaPersonas.add(p1);
            ListaPersonas.add(p2);
            ListaPersonas.add(p3);
            ListaPersonas.add(p4);

            oos2.writeObject(ListaPersonas);
            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.err.println("Ocurrió una IO excepcion");
        } finally {
            try {
                if (fos2 != null) {
                    fos2.close();
                    oos2.close();
                }

            } catch (IOException e) {
                System.err.println("Ocurrió una IO excepcion");
            }
        }
    }

    /*4. Crea un método que vuelque en un ArrayList los objetos almacenados en el fichero anterior.*/
    public static void leerEnArraylist() {

        ArrayList<Persona> listaPersonas2 = new ArrayList();

        File fichero3 = null;
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;

        try {

            fichero3 = new File("personas2.dat");
            fis2 = new FileInputStream(fichero3);
            ois2 = new ObjectInputStream(fis2);
            
            while (fis2.available()>0){
                listaPersonas2 = (ArrayList) ois2.readObject();
            }
            for (Persona i : listaPersonas2) {
                System.out.println(i.toString());
            }
            
            
            
        } catch (IOException e) {
            System.err.println("Error1");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error2");
        } finally {
            try {
                if (fis2 != null) {
                    fis2.close();
                    ois2.close();
                }
            } catch (IOException e) {
                System.err.println("Error3");
            }
            
        }

    }

}
