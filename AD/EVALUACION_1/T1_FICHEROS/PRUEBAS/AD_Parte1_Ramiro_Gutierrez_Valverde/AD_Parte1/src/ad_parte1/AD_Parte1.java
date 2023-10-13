/*
 1. EJERCICIO 1. Realiza un programa en java que muestre por pantalla el nombre
del Sistema Operativo, del usuario y cambie el nombre del usuario por tu nombre
y dos apellidos y establezca un nuevo directorio de trabajo.

Guarda el resultado en un archivo

 */
package ad_parte1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ramiro
 */
public class AD_Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("CONFIGURACIÓN PREVIA A LOS CAMBIOS\n");
        System.out.println("El sistema operativo es: " + System.getProperty("os.name") + ", versión: " + System.getProperty("os.version"));
        System.out.println("El nombre del usuario: " + System.getProperty("user.name"));
        System.out.println("El directorio de trabajo es: " + System.getProperty("user.dir"));

        System.setProperty("user.name", "Ramiro Gutiérrez Valverde");
        System.setProperty("user.dir", "D:\\Users");
        
        System.out.println("\nCONFIGURACIÓN TRAS LOS CAMBIOS\n");
        System.out.println("El sistema operativo es: " + System.getProperty("os.name") + ", versión: " + System.getProperty("os.version"));
        System.out.println("El nombre del usuario: " + System.getProperty("user.name"));
        System.out.println("El directorio de trabajo es: " + System.getProperty("user.dir"));
        
        //Para guardarlo en el fichero:
        
        String linea1= "El sistema operativo es: " + System.getProperty("os.name") + ", versión: " + System.getProperty("os.version");
        String linea2= "\nEl nombre del usuario: " + System.getProperty("user.name");
        String linea3= "\nEl directorio de trabajo es: " + System.getProperty("user.dir");
        
        String fichero= "Ramiro.txt";
        
        try {
            FileWriter fw = new FileWriter(fichero, true);
            fw.write(linea1);
            fw.write(linea2);
            fw.write(linea3);
            fw.close();
            System.out.println("Se ha escrito el fichero correctamente");
        } catch (IOException ex) {
            System.err.println("Ocurrió un error al escribir en el fichero");
            ex.printStackTrace();
        }
        
    }

}
