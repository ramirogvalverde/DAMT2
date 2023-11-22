

package es.iesaugusto.carrera_relevos_6;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Carrera_relevos_6 {

    public static void main(String[] args) {
        
        int NumCorredores = 6;
        
        Relevo r = new Relevo(NumCorredores);
        ArrayList<Thread> lista = new ArrayList<>();
        
        System.out.println("Comienza la carrera");
        
        for (int i = 0; i < NumCorredores; i++) {
            Corredor c = new Corredor(i+1, r);
            Thread t = new Thread(c);
            lista.add(t);
            t.start();
        }
        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera_relevos_6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Fin de la Carrera");
        
    }
}
