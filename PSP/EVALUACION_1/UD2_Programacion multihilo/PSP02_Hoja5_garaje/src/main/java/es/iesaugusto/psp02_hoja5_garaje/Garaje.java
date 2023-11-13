
package es.iesaugusto.psp02_hoja5_garaje;

/**
 *
 * @author Ramiro
 * 
 */
public class Garaje {
    
    private int numCoches=100;
    
    
    public synchronized int entra(){
        while (numCoches==200){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupcion del hilo...");
            }
        }
        numCoches++;
        notifyAll();
        return numCoches;
    }
    
    public synchronized int sale(){
        while(numCoches==0){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupcion del hilo...");
            }
        }
        numCoches--;
        notifyAll();
        return numCoches;
    }
    
    
}
