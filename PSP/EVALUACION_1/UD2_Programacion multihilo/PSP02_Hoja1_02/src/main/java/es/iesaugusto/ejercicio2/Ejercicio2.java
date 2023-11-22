

package es.iesaugusto.ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
       
        
        HiloLineas hilo = new HiloLineas(args[0]);
        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\nEjecución terminada. Adios!");
        
    }
}
