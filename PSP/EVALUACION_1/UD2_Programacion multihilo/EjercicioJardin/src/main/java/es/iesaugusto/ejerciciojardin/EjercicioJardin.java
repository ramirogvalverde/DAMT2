/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.ejerciciojardin;

/**
 *
 * @author damt210
 */
public class EjercicioJardin {

    public static void main(String[] args) {
        Contador c= new Contador();
        
        HiloSuma hs[]= new HiloSuma[10];
        HiloResta hr[]= new HiloResta[15];
        
        for (int i = 0; i < hs.length; i++) {
            hs[i] = new HiloSuma(c);
            hs[i].start();
        }
        
        for (int i = 0; i < hr.length; i++) {
            hr[i] = new HiloResta(c);
            hr[i].start();
        }
        
        for (int i = 0; i < hs.length; i++) {
            try {
                hs[i].join();
            } catch (InterruptedException ex) {
                System.err.println("Excepción");
            }
        }
        
        for (int i = 0; i < hr.length; i++) {
            try {
                hr[i].join();
            } catch (InterruptedException ex) {
                System.err.println("Excepción");
            }
        }
        
        System.out.println("El numero de personas en el interior es de: " + c.muestraContador());
       
        
        
    }
}
