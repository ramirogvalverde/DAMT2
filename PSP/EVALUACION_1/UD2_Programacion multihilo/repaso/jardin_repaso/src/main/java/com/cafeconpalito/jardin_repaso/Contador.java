package com.cafeconpalito.jardin_repaso;

/**
 *
 * @author Ramiro
 */
public class Contador {

    int cuenta;

    public Contador() {
        cuenta = 100;
    }

    public synchronized void entra(int personasEntran) {
        cuenta = cuenta + personasEntran;
        System.out.println("Entra una persona");
        System.out.println("Quedan " + muestraCuenta() + " personas dentro");
    }

    public synchronized void sale(int personasSalen) {
        cuenta = cuenta - personasSalen;
        System.out.println("Sale una persona");
        System.out.println("Quedan " + muestraCuenta() + " personas dentro");
    }

    public int muestraCuenta() {
        return cuenta;
    }

}
