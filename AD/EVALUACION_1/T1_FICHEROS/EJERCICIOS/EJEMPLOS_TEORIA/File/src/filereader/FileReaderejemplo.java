package filereader;

import java.io.*;

public class FileReaderejemplo {

    public static void main(String[] args) {

        String fichero= "fichero.txt";
        
        try {
            FileReader fr = new FileReader(fichero);
            int caracter;
            System.out.println("Contenido del archivo: " + fichero + ":");
            while((caracter =fr.read()) != -1){
                System.out.print((char)caracter);
            }
            fr.close();
        } catch (IOException ioe) {
            System.out.println("Ocurrió un error al leer el archivo");
             ioe.printStackTrace();
        }
        
        
        
    }

}
