
package es.iesaugusto.carrera_relevos_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Relevo {
    
    int numCorredores;
    int corredoresPreparados = 1;
    

    public Relevo(int numCorredores) {
        this.numCorredores = numCorredores;
    }
    
    
    
    public synchronized void iniciarCarrera(int idCorredor){
        //System.out.println(numCorredores + " " + corredoresPreparados);
        while(numCorredores != corredoresPreparados){
            
            System.out.println("El corresor" + idCorredor + " está esperando");
            corredoresPreparados ++;  
            //System.out.println(numCorredores + " " + corredoresPreparados);
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Relevo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        try {
            System.out.println("el corredor "+ idCorredor + " cogió el relevo");
            System.out.println("el corredor "+ idCorredor + " inició la carrera");
            //simulamos la carrera
            Thread.sleep((int)(Math.random()*4001));//*(max-min+1)-min
        } catch (InterruptedException ex) {
            Logger.getLogger(Relevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("el corredor "+ idCorredor + " terminó la carrera, pasa el testigo al siguiente");
        notifyAll();
        
    }
    
    
    
}
