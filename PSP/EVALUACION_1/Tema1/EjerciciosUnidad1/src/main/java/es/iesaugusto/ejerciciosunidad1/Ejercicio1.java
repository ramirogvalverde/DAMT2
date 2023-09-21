

package es.iesaugusto.ejerciciosunidad1;

import java.io.IOException;

/**
 *
 * @author Ramiro
 */
public class Ejercicio1 {
    /*1. Utilizando la clase Runtime, realiza un programa que lance un proceso hijo que ejecute el
notepad de Windows pasándole como argumento un fichero de texto para que lo abra (crea un
fichero de ejemplo en la raíz del proyecto para probarlo). Los argumentos se pasan a través de
la línea de comandos (String[] args).*/

    public static void main(String[] args) {
        try {
            Runtime rt =Runtime.getRuntime();
            String [] comando= {"notepad.exe",args[0]};
            
            Process p = rt.exec(comando);
        } catch (IOException ex) {
            System.out.println("Ha ocurrido una excepción");
        }
    }
}
