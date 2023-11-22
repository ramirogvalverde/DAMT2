

package es.iesaugusto.productorconsumidor_7;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class ProductorConsumidor_7 {

    public static void main(String[] args) {
        
        Buffer b = new Buffer();
        
        ArrayList<Thread> lista= new ArrayList<>();
        
        for (int i = 0; i < 15; i++) {
            Productor p = new Productor(b);
            lista.add(p);
            p.start();
        }
        for (int i = 0; i < 15; i++) {
            Consumidor c = new Consumidor(b);
            lista.add(c);
            c.start();
        }
        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor_7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("\nFIN DEL PROGRAMA: BUFFER VACÍO");

    }
}
