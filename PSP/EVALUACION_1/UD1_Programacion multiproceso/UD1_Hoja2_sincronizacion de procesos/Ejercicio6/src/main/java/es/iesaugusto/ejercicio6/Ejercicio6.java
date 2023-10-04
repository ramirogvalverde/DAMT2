

package es.iesaugusto.ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        /*6. Crea un programa en Java que imprima ¿qué pasa?, 10 veces esperando un
        segundo cada vez.*/
        
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("¿Qué pasa?");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("IO Exception");
            }
        }
    }
}
