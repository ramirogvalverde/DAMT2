
package com.cafeconpalito.refuerzoHilos;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */

public class Hilo extends Thread{
    
    private boolean esCorrecto= false;

    public boolean compruebaEsCorrecto() {
        return esCorrecto;
    }
    
    @Override
    public void run() {
        
        Scanner lectura = new Scanner (System.in);
        int random = (int) (Math.random()*10);
        
        System.out.println("Adivina el número entre 0 y 10");
        System.out.println("Escribe un número");
        
        while (!esCorrecto){
            if (lectura.nextInt()==random) {
                esCorrecto=  true;
                
            }else{
                System.out.println("Puedes volver a intentarlo");
                System.out.println("Escribe un número");
            }    
        }
        System.out.println("GANASTE");
        
    }
    
    
    
}
