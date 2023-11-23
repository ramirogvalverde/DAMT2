/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.ejemplohiloprincipal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class EjemploHiloPrincipal {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Hilo actual: " + t.toString());
        //nos devuelve el nombre del hilo
        System.out.println(t.getName());
        //cambiamos el nombre
        t.setName("miHilo");
        System.out.println(t.getName());
        
        for (int i = 5; i >0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(EjemploHiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
