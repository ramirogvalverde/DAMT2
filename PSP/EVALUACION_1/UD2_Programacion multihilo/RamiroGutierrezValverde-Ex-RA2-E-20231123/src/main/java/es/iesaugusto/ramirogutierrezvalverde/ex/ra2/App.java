package es.iesaugusto.ramirogutierrezvalverde.ex.ra2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class App {

    public static void main(String[] args) {
        
        
        System.out.println("\nHola, el usuario <Ramiro> está haciendo la aplicación para el RA2");
        System.out.println("--------------STAR WARS--------------");
        System.out.println("\nHace mucho tiempo en una galaxia muy muy lejana...");
        System.out.println("se está librando una horrible batalla en las afueras de la Galaxia");
        System.out.println("entre las flotas rebeldes e imperiales . . .");
        System.out.println("\n-------------------------------------");

        DispositivoDrones dd = new DispositivoDrones();

        ArrayList<Thread> lista = new ArrayList<>();

        Ingeniero i = new Ingeniero(dd, "Belsu Palug");
        lista.add(i);

        Oficial o1 = new Oficial(dd, "Daor Ban");
        o1.setPriority(10);
        lista.add(o1);

        Oficial o2 = new Oficial(dd, "Maza Aho");
        o2.setPriority(5);
        lista.add(o2);

        i.start();
        o1.start();
        o2.start();

        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        i.mensajeFinal("Belsu Palug");
        o1.mensajeFinal("Daor Ban");
        o2.mensajeFinal("Maza Aho");
        
        System.out.println("___________________________________________");        
        System.out.println("Daor Ban ha disparado "+ o1.getNumImpactos() + " drones");
        System.out.println("Maza Aho ha disparado "+ o2.getNumImpactos() + " drones" );        
        System.out.println("FIN");
        System.out.println("___________________________________________");

    }
}
