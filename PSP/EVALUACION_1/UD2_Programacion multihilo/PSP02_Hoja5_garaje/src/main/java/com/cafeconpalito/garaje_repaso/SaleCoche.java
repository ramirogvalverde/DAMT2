package com.cafeconpalito.garaje_repaso;

/**
 *
 * @author Ramiro
 */
public class SaleCoche extends Thread{
    
    
    Garaje g;
    
    int numcoche;

    public SaleCoche(Garaje g, int numcoche) {
        this.g = g;
        this.numcoche = numcoche;
    }

    @Override
    public void run() {
        g.saleCoche();
        System.out.println("El coche " + numcoche + " sale del garaje");
        System.out.println("Coches en el garaje = "+ g.getCuenta());
    }
    
    
    
}
