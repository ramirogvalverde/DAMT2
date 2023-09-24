

package com.mycompany.ejercicio1;

import java.io.IOException;

/**
 *
 * @author ramirogvalverde
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Runtime rt =Runtime.getRuntime();
            String [] comando= {"notepad.exe",args[0]};
            
            Process p = rt.exec(comando);
        } catch (IOException ex) {
            System.out.println("Ha ocurrido una excepción");
        };
    }
}
