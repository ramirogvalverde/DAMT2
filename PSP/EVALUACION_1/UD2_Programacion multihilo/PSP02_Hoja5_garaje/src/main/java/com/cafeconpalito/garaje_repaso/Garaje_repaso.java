package com.cafeconpalito.garaje_repaso;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Garaje_repaso {

    public static void main(String[] args) {
        
        Garaje g = new Garaje();
        
        ArrayList<Thread> lista= new ArrayList<>();
        
        for (int i = 0; i < 150; i++) {
            EntraCoche ec= new EntraCoche(g, i);
            lista.add(ec);
            ec.start();
        }
        for (int i = 0; i < 60; i++) {
            SaleCoche sc= new SaleCoche(g, i);
            lista.add(sc);
            sc.start();
        }
        
        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Garaje_repaso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("GARAJE CERRADO");  
    }
}
