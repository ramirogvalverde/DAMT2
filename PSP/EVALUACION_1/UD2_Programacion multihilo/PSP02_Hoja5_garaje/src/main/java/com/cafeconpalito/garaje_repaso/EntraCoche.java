package com.cafeconpalito.garaje_repaso;

/**
 *
 * @author Ramiro
 */
public class EntraCoche extends Thread {

    Garaje g;
    int numCoche;

    public EntraCoche(Garaje g, int numCoche) {
        this.g = g;
        this.numCoche = numCoche;
    }


    @Override
    public void run() {
        g.entraCoche();
        System.out.println("Coche " + numCoche + " Ya puedo entrar! Coches en el garaje = " + g.getCuenta());
        g.estalleno();
    }

}
