

package es.iesaugusto.ejercicio5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String[] comando1 = new String[3];
        
        comando1[0]="cmd";
        comando1[1]="/c";
        comando1[2]="ver";
        
        String[] comando2={"cmd", "/c", "verr"};
        
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        
        File file1= new File("salida.txt");
        File file2=new File("error.txt");
        
        pb1.redirectOutput(file1);
        pb2.redirectError(file2);
        
        try {
            pb1.start();
            pb2.start();
        } catch (IOException ex) {
            System.err.println("io exception");
        }
        
        
    }
}
