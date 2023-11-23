package es.iesaugusto.ramirogutierrezvalverde.ex.ra2;

/**
 *
 * @author Ramiro
 */


public class Oficial extends Thread {

    DispositivoDrones dd;
    String nombre;
    int numImpactos;// cuenta el numero de impactos de cada hilo

    public int getNumImpactos() {// necesario para poder ser llamado desde el main, donde se imprime el mensaje
        return numImpactos;
    }
    
    

    public Oficial(DispositivoDrones dd, String nombre) {
        this.dd = dd;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while(!dd.finBatalla){
            dd.getDron(nombre);
            numImpactos++;
        }   
    }
    
    public void mensajeFinal(String nombre){
        System.out.println(nombre + ":Si! La batalla ha terminado");
    }
    
}
