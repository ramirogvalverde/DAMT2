
package es.iesaugusto.ejerciciojardin;

/**
 *
 * @author Ramiro
 */
public class HiloResta extends Thread{
    

    private Contador contador;
    
    public HiloResta(Contador c){
        this.contador = c;
    }

    @Override
    public void run() {
      contador.restaContador(1);
    }
    
}
