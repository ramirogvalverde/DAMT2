

package es.iesaugusto.ejercicio10;

/**
 *
 * @author Ramiro
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        /*10. Obtener la salida estándar de un .jar.
            Crea dos programas en Java:
            - El primero imprime por su salida estándar 10 números aleatorios. A continuación, genera un .jar del programa.
            - El segundo tiene que ejecutar el .jar del primer programa y leer su salida estándar para calcular la suma de los 10 números aleatorios*/
        
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random()*10));
        }
        
        
        
        
        
    }
}
