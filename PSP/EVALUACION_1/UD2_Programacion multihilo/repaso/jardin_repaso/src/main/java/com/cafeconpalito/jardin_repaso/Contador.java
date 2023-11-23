package com.cafeconpalito.jardin_repaso;

/**
 *
 * @author Ramiro
 */
public class Contador {
    
    int cuenta;

    public Contador() {
        cuenta=100;
    }
    
    public synchronized void entra(int personasEntran){
        cuenta = cuenta + personasEntran;
        
    }
    
    public synchronized void sale(int personasSalen){
        cuenta = cuenta - personasSalen;
    }
    
    public int muestraCuenta(){
        return cuenta;
    }
    
    
}
