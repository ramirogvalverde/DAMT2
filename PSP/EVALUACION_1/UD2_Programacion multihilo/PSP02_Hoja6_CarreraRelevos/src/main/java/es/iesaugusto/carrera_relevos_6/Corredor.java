
package es.iesaugusto.carrera_relevos_6;

/**
 *
 * @author damt210
 */
public class Corredor implements Runnable {

    int idCorredor;
    Relevo r;

    public Corredor(int idCorredor, Relevo r) {
        this.idCorredor = idCorredor;
        this.r = r;
    }

   
    
    
    @Override
    public void run() {
      r.iniciarCarrera(idCorredor);
    }
    
}
