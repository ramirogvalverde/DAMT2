
package es.iesaugusto.ejemplo2mihilothread;

/**
 *
 * @author damt210
 */
public class MihiloTread extends Thread{
    
    String nombreHilo;

    public MihiloTread(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }
    // los hlos comienzan a ejecutarse desde aquí
    //punto de entrada del hilo
    @Override
    public void run(){
        System.out.println("comenzando" + nombreHilo);
        
        for (int contar = 0; contar < 10; contar++) {
            
            System.out.println("En "+nombreHilo+ ", el recuento " + contar);
            
        }
        System.out.println("terminado" + nombreHilo);
        
    }
    
    
    
}
