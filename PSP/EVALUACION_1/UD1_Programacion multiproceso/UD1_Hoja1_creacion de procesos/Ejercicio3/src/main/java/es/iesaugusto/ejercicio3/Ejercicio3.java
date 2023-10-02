
package es.iesaugusto.ejercicio3;

import java.io.IOException;

/**
 *
 * @author Ramiro
 */

public class Ejercicio3 {
    
    /*3. Modifica el programa del ejercicio 1 que lanzaba el Notepad de Windows. Ahora, el padre,
mientras el hijo se está́ ejecutando, debe realizar una tarea sencilla que consiste en generar 10
números aleatorios entre el 0 y el 9. ¿qué ocurre y por qué?*/

    public static void main(String[] args) {
        
        try {
            Runtime rt =Runtime.getRuntime();
            String [] comando= {"notepad.exe"};         
            
            Process p = rt.exec(comando);
            
            for (int i = 0; i < 10; i++) {
                System.out.println((int)(Math.random()*9));
            }
            
        } catch (IOException ex) {
            System.out.println("Ha ocurrido una excepción");
        }
        
        
    }
    
}
