package com.cafeconpalito.ejercicio3;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        /* 3.- Modifica el programa anterior para que lea el número de líneas de todos los
ficheros pasados como argumentos. El programa creará un array de hilos con
tantos elementos como ficheros pasados como argumentos. El programa
principal esperará a que termine la ejecución de todos los hilos.
En este caso se creará un hilo por fichero a leer las líneas. Por cada hilo se
guardará una referencia en un array para hacer al final un join de todos los hilos. */
        
        
        ArrayList <HiloLineas> lista = new ArrayList();
        
        for (int i = 0; i < args.length; i++) {

            HiloLineas hilo= new HiloLineas(args[i]);
            lista.add(hilo);
        
        }
 
        // cual es la diferencia entre esto y hacer un foreach separado para el join?
        
        for (HiloLineas i : lista) {
            
            
            try {
                i.run();
                i.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("\nEjecución terminada. Adios!");
    
    
    }
}
