
package es.iesaugusto.ejerciciojardin;

/**
 *
 * @author Ramiro
 */
public class HiloSuma extends Thread{
    

    private Contador contador;
    
    public HiloSuma(Contador c){
        this.contador = c;
    }

    @Override
    public void run() {
      contador.sumaContador(1);
    }
    
}
