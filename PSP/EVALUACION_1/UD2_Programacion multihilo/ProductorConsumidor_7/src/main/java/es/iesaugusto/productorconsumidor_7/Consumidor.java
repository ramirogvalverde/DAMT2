
package es.iesaugusto.productorconsumidor_7;

/**
 *
 * @author Ramiro
 */
public class Consumidor extends Thread{
    
    Buffer b;

    public Consumidor(Buffer b) {
        this.b = b;
    }
    

    @Override
    public void run() {
        b.leer();
        
    }
    
    
    
}