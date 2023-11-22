package es.iesaugusto.ejercicio1;

/**
 *
 * @author Ramiro
 */
public class HiloImpar extends Thread {

    String nombreHiloImpar;
    int sumaImpar = 0;

    public HiloImpar(String nombreHilo) {
        this.nombreHiloImpar = nombreHilo;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                sumaImpar += i;
            }
        }

        System.out.println("La suma de Impares es: " + sumaImpar);
    }

}
