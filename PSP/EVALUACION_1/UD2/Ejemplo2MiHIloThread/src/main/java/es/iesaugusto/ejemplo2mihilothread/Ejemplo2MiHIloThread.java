/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.ejemplo2mihilothread;

/**
 *
 * @author damt210
 */
public class Ejemplo2MiHIloThread {

    public static void main(String[] args) {
        MihiloTread m1 = new MihiloTread("#1");
        MihiloTread m2 = new MihiloTread("#2");
        MihiloTread m3 = new MihiloTread("#3");
        
        m1.start();
        m2.start();
        m3.start();
        // parece que se ejecuta por completo el hilo principal
        for (int i = 0; i < 100; i++) {
            System.out.println(".");
        }
        
        System.out.println("Hilo principal finalizado");
        
    }
}
