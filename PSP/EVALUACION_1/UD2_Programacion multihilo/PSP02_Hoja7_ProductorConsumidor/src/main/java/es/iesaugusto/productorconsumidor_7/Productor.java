
package es.iesaugusto.productorconsumidor_7;

/**
 *
 * @author damt210
 */
public class Productor extends Thread{

    Buffer b;

    public Productor(Buffer b) {
        this.b = b;
    }
    
    
    @Override
    public void run() {
        
       b.escribir();
    }
    
    
    
}
