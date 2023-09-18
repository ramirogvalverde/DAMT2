
package printwriter;

import java.io.*;
import java.util.Arrays;

public class PrintWriterejemplo {
    
   

    
    public static void main(String[] args) {
        String fichero= "fichero.txt";
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero));
            pw.print("Esto es un texto sin salto de línea");
            pw.println("Nueva Palabra");
            pw.println("esto es un texto con salto de línea");
            pw.println(4.5455);
            
            Arrays.stream(new int[] {1,2,3,4,10})
                    .filter(n -> n > 2)
                    .map(n -> n * 2)
                    .forEach(n -> pw.println(n));
            
            pw.close();
        } catch (IOException ex) {
            System.err.println("Fichero no encontrado");
        }
        
        
        
    }
    
}
