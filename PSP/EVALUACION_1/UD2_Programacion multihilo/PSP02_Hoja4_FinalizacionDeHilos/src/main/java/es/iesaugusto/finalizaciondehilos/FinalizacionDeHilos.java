package es.iesaugusto.finalizaciondehilos;

/**
 *
 * @author Ramiro
 */
public class FinalizacionDeHilos {

    public static void main(String[] args) {
        NombreEstudianteHilo neh1 = new NombreEstudianteHilo("Anibal");
        NombreEstudianteHilo neh2 = new NombreEstudianteHilo("Murdock");
        NombreEstudianteHilo neh3 = new NombreEstudianteHilo("Fenix");
        
        neh1.setPriority(10);
        neh2.setPriority(1);
        
        neh1.start();
        neh2.start();
        neh3.start();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.err.println("El hilo ha sido interrumpido");
        }
        
        neh2.interrupt();
        
    }
}
