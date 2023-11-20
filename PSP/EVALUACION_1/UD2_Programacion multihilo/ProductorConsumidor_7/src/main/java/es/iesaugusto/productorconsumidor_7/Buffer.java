
package es.iesaugusto.productorconsumidor_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class Buffer {
    
    int[] buffer = new int[6];
    int posicion=0;
    
    
    public synchronized void escribir(){
        while(posicion>=5){
            try {  
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (int i = posicion; i < posicion + 3; i++) {
            buffer[i]= (int)(Math.random()*(9-0+1)+0);
            System.out.println("la escritura de la posicion " + i + " es " + buffer[i]);
        }
        posicion +=3;
        notifyAll();
        
    }
    
    public synchronized void leer(){
        while(posicion==0){        
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        
        for (int i = posicion -1 ; i >= posicion - 3; i--) {
            System.out.println("la lectura de la posicion " + i + " es " + buffer[i]);
            
        }
        posicion = posicion - 3;
        notifyAll();
        
    }
    
}
