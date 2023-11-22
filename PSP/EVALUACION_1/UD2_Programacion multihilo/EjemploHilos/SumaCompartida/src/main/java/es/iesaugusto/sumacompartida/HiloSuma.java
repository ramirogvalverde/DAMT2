
package es.iesaugusto.sumacompartida;

/**
 *
 * @author damt210
 */
public class HiloSuma extends Thread {
    private int id;
    private Contador contador;
    
    public HiloSuma(int id, Contador c){
        
        this.id=id;
        this.contador = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.sumacontador(1);
        }
    }
    
    
     
}
