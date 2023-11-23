package es.iesaugusto.proyectorepaso;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class ProyectoRepaso {

    public static void main(String[] args) {
        
        Buffer b = new Buffer();

        ArrayList<Thread> lista = new ArrayList<>();



        Productor p = new Productor(b, "ramiro", 7000);
        lista.add(p);
        
        p.start();
        
        Consumidor c1 = new Consumidor(b, "albano", 5000);
        lista.add(c1);
        c1.setPriority(Thread.MAX_PRIORITY);
        
        Consumidor c2 = new Consumidor(b, "daniel", 8000);
        lista.add(c2);
        c2.setPriority(Thread.NORM_PRIORITY);

        c1.start();
        c2.start();

        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProyectoRepaso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        p.bla();
        c1.bla();
        c2.bla();
        
        System.out.println("se acabo la historia");
    }
}
