package es.iesaugusto.ejercicio10_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Ramiro
 */
public class Ejercicio10_2 {

    public static void main(String[] args) {
        /*10. Obtener la salida estándar de un .jar.
            Crea dos programas en Java:
            - El primero imprime por su salida estándar 10 números aleatorios. A continuación, genera un .jar del programa.
            - El segundo tiene que ejecutar el .jar del primer programa y leer su salida estándar para calcular la suma de los 10 números aleatorios*/

        String[] comando = {"CMD", "/c", "java", "-jar", "Ejercicio10-1.0-SNAPSHOT-SHADED.jar"};

        try {
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process p = pb.start();
            File archivo = new File("numeros.txt");
            if (archivo.exists()) {
                archivo.delete();
            }

            try {
                InputStream is = p.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                
                String linea = br.readLine();
                int suma = 0;
                
                while (linea != null) {
                    System.out.println(linea);
                    suma += Integer.parseInt(linea);
                    linea = br.readLine();
                }
                System.out.println("El resultado de la suma es: " + suma);

            } catch (IOException e) {
                System.err.println("IO Exception");

            }

        } catch (IOException ex) {
            System.err.println("IO Exception2");
        }
        

    }
}
