package es.iesaugusto.ramirogutierrezvalverde.ex.ra2;

/**
 *
 * @author Ramiro
 */
public class Ingeniero extends Thread {
    
    DispositivoDrones dd;
    String nombre;

    public Ingeniero(DispositivoDrones dd, String nombre) {
        this.dd = dd;
        this.nombre = nombre;
    }

    
    @Override
    public void run() {
        while(!dd.finBatalla){
            dd.setDron(nombre);            
        }   
    }
    
    public void mensajeFinal(String nombre){
        System.out.println(nombre + ":Si! La batalla ha terminado");
    }
    
    
    
}
