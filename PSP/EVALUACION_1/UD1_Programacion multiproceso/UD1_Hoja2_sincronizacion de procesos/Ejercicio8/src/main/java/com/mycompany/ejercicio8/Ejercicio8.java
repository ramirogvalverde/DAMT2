package com.mycompany.ejercicio8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        /*
            8. En este ejercicio el estudiante debe crear un programa que:
        
            • Abra una aplicación introducida por argumento (String[] args), por ejemplo “Notepad”
            en Windows o “gedit” en Linux.
            • 10 segundos después se cerrará el proceso (con código no a mano)
            • Después de que la app se cierre, el programa espera 5 segundo y se imprimirá “Buenas
            noches amigo!”.
         */
        

        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(args);

            p.waitFor(10, TimeUnit.SECONDS);
            p.destroy();
            

            Thread.sleep(5000);
            System.out.println("Buenas noches amigou!!");

        } catch (IOException ex) {
            System.err.println("IO Exception");
        } catch (InterruptedException ex) {
            System.err.println("Interrupted Exception");
        }

    }
}
