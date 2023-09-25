

package com.mycompany.ejercicio2;

import com.sun.tools.javac.Main;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramirogvalverde
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        String operatingSystem = System.getProperty("os.name").toLowerCase();
        if (operatingSystem.contains("win")) {
            try {
                Runtime rt = Runtime.getRuntime();
                String[] comando = {"calc.exe"};
                Process p = rt.exec(comando);
                ProcessHandle handle = p.toHandle();

                System.out.println("ID del proceso: " + handle.pid());
                System.out.println("Nombre del comando: " + handle.info().command().get());
                System.out.println("Argumentos usados: " + Arrays.toString(handle.info().arguments().orElse(new String[0])));
                System.out.println("Tiempo de comienzo: " + handle.info().startInstant().get());
                System.out.println("Tiempo de CPU: " + handle.info().totalCpuDuration().get());
                System.out.println("Propietario: " + handle.info().user().get());
                System.out.println("Número de hijos: " + handle.descendants().count());
                
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (operatingSystem.contains("nux")) {
            try {
                Runtime rt = Runtime.getRuntime();
                String[] comando = {"firefox"};
                Process p = rt.exec(comando);

                ProcessHandle handle = p.toHandle();

                System.out.println("ID del proceso: " + handle.pid());

                System.out.println("Nombre del comando: " + handle.info().command().get());
                System.out.println("Argumentos usados: " + Arrays.toString(handle.info().arguments().orElse(new String[0])));
                System.out.println("Tiempo de comienzo: " + handle.info().startInstant().get());
                System.out.println("Tiempo de CPU: " + handle.info().totalCpuDuration().get());
                System.out.println("Propietario: " + handle.info().user().get());

                System.out.println("Número de hijos: " + handle.descendants().count());

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
