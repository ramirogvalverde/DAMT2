

package es.iesaugusto.ejercicio1;

/**
 *
 * @author Ramiro
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        HiloPar par = new HiloPar("1");
        HiloImpar impar = new HiloImpar("2");
        
        par.start();
        impar.start();
        
    }
}
