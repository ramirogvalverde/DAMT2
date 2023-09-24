

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

                //¿Porque que hay que usar un manejador de procesos?
                ProcessHandle handle = p.toHandle();

                //Tambien se puede capturar el proceso asi
                //ProcessHandle handle=ProcessHandle.current()
                System.out.println("ID del proceso: " + handle.pid());
                //Si hemos cojido al hijo porque el nombre del comando es C:\Program Files\Java\jdk-20\bin\java.exe?
                System.out.println("Nombre del comando: " + handle.info().command().get());
                System.out.println("Argumentos usados: " + Arrays.toString(handle.info().arguments().orElse(new String[0])));
                System.out.println("Tiempo de comienzo: " + handle.info().startInstant().get());
                System.out.println("Tiempo de CPU: " + handle.info().totalCpuDuration().get());
                System.out.println("Propietario: " + handle.info().user().get());

                //Para obtener el padre
                //System.out.println("Padre"+ handle.parent().get().info().command().get());
                //Numero de hijos 0? Porque la calculadora no es hijo de java
                //Porque estamos cogiendo la info del proceso de la calculadora no de java
                //Ahora magicamente tiene 2 hijos despues de 10 min
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
