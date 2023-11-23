package com.cafeconpalito.jardin_repaso;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Jardin_repaso {

    public static void main(String[] args) {
        Contador c = new Contador();
        
        ExecutorService es= Executors.newFixedThreadPool(10);
        
        HiloSale[] salen= new HiloSale[15];
        HiloEntra[] entran = new HiloEntra[10];
        
        for (int i = 0; i < salen.length; i++) {
           salen[i] = new HiloSale(c);
           es.execute(salen[i]);
        }
        for (int i = 0; i < entran.length; i++) {
            entran[i] = new HiloEntra(c);
            es.execute(entran[i]);
        }
        
        //el join del executor
        
         try {
            es.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jardin_repaso.class.getName()).log(Level.SEVERE, null, ex);
        }
        es.shutdown();
       
        System.out.println("numero de personas dentro del jardín: " + c.muestraCuenta());
        
    }
}
