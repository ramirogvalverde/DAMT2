package es.iesaugusto.finalizaciondehilos;

/**
 *
 * @author Ramiro
 */
public class NombreEstudianteHilo extends Thread {

    private String nombreHilo;
    private int numIteracion = 0;

    public NombreEstudianteHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    public String getNombreHilo() {
        return nombreHilo;
    }

    public void setNombreHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    public int getNumIteracion() {
        return numIteracion;
    }

    public void setNumIteracion(int numIteracion) {
        this.numIteracion = numIteracion;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5 && !Thread.interrupted(); i++) {
                System.out.println("Hilo de nombre: " + nombreHilo);
                System.out.println("Iteración: " + numIteracion);
                numIteracion = numIteracion + 1;

                sleep(2000);
            }
        } catch (InterruptedException ex) {
            System.err.println("El hilo " + getNombreHilo() + " ha terminado por una interrupción");

        }
    }

}
