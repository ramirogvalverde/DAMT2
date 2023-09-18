
package filewriter;


import java.io.*;

public class FileWriterejemplo {

    
    public static void main(String[] args) {
        String texto= "Este es un ejemplo de uso de FileWriter en Java";
        String fichero= "Fichero.txt";
        
        try {
            FileWriter fw = new FileWriter(fichero, true);
            fw.write(texto);
            fw.close();
            System.out.println("Se ha escrito el fichero correctamente");
        } catch (IOException ex) {
            System.err.println("Ocurrió un error al escribir en el fichero");
            ex.printStackTrace();
        }
        
        
    }
    
}
