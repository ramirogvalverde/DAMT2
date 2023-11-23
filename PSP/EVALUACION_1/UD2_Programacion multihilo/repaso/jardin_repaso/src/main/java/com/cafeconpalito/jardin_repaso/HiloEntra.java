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
        System.out.println("Entra una persona");
        System.out.println("Quedan " + c.muestraCuenta() + " personas dentro");
    }

}
