
package es.iesaugusto.ejercicio1;

/**
 *
 * @author Ramiro
 */
public class HiloPar extends Thread {
    
    String nombreHiloPar;
int sumaPar=0; 
    public HiloPar(String nombreHilo) {
        this.nombreHiloPar = nombreHilo;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 1000; i++) {
          if(i%2==0){
              sumaPar+= i;
          }  
        }
        System.out.println("La suma de Pares es: " + sumaPar);
        
    }
    
}
