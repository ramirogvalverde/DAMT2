package com.cafeconpalito.jardin_repaso;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Jardin_repaso {

    public static void main(String[] args) {
        Contador c = new Contador();

        /*HiloEntra he= new HiloEntra(c);
        Thread t = new Thread(he);
        
        HiloSale hs= new HiloSale(c);
        Thread t2 = new Thread(hs);

        HiloSale[] salen = new HiloSale[15];
        HiloEntra[] entran = new HiloEntra[10];

        for (int i = 0; i < salen.length; i++) {
            salen[i] = new HiloSale(c);
            t2.start();
        }
        
        for (int i = 0; i < entran.length; i++) {
            entran[i] = new HiloEntra(c);
            t.start();
        }

        //el join del executor
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Jardin_repaso.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        ArrayList<Thread> lista = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            HiloSale hs = new HiloSale(c);
            Thread t = new Thread(hs);
            lista.add(t);
        }
        for (int i = 0; i < 10; i++) {
            HiloEntra he = new HiloEntra(c);
            Thread t = new Thread(he);
            lista.add(t);
        }
        for (Thread t : lista) {
            t.start();
        }
        for (Thread t : lista) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Jardin_repaso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("numero de personas dentro del jardín: " + c.muestraCuenta());

    }
}
