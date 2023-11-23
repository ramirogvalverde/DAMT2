package com.cafeconpalito.garaje_repaso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Garaje {

    int cuenta;

    boolean lleno = false;

    public Garaje() {
        cuenta = 100;
    }

    public int getCuenta() {
        return cuenta;
    }
    


    public synchronized void entraCoche() {
        while (cuenta==200) {
            try {
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(EntraCoche.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cuenta++;
        notifyAll();
    }
    
    public boolean estalleno(){
        if(cuenta==200){
            System.out.println("Garaje completo, no puedes entrar");
            return true;            
        }
        return false;
    }

    public synchronized void saleCoche() {
        while (cuenta == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Garaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lleno= false;
        cuenta--;
        notifyAll();
    }

}
