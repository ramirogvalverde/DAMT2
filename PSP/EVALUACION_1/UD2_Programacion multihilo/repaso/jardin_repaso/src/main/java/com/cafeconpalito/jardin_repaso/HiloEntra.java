package com.cafeconpalito.jardin_repaso;

/**
 *
 * @author Ramiro
 */
public class HiloEntra implements Runnable {

    private Contador c;

    public HiloEntra(Contador c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.entra(1);
       
    }

}
