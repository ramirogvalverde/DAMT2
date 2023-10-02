

package es.iesaugusto.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        String appComando;
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el comando de inicio de una App del SO actual: ");
        appComando= lectura.nextLine();
        
        
        ProcessBuilder pb= new ProcessBuilder(appComando);
       
        
    }
}
