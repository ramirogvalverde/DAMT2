package es.iesaugusto.proyectorepaso;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Buffer {

    int veces = 0;
    boolean hayTema = false;
    boolean termine = false;

    public synchronized void produce(String nombre, int espera) {
        while (hayTema) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(nombre + " prepara tema");
        try {
            sleep(espera);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("tema preparado");
        hayTema = true;
        notifyAll();

    }

    public synchronized void ejecuta(String nombre, int espera) {
        while (!hayTema) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(nombre + " comienza");
        try {
            sleep(espera);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nombre + " suma 1");

        veces++;
        termineLosTemas();
        System.out.println("Van " + veces + " veces");
        
        hayTema = false;
        notifyAll();
    }

    public synchronized void termineLosTemas(){ // Cuando llegues a la cantidad necesaria
        if (veces == 5 ) {
            termine = true;
        }
    }
    
}
