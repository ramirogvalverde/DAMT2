package com.cafeconpalito.jardin_repaso;

/**
 *
 * @author Ramiro
 */
public class HiloSale implements Runnable{
    
    private Contador c;

    public HiloSale(Contador c) {
        this.c = c;
    }

    @Override
    public void run() {
       c.sale(1);
        
    }
    
}
