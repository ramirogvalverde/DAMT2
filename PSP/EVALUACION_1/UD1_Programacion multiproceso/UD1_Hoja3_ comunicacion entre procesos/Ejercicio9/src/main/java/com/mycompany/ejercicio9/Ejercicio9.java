package com.mycompany.ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Ramiro
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        /*9. En este ejercicio el estudiante debe realizar un ejercicio que lance el comando:
            1• Imprime el sistema operativo donde estamos.
            2• Esperamos 5 segundos.
            3• Si estamos en Windows, abre ipconfig /all e imprime su salida por pantalla y en un fichero.
            4• Si estamos en Linux o Mac OS abrimos ifconfig e imprimimos su salida por pantalla y en un fichero. En Linux también se puede probar con el
            comando ip a.
            5• Esperamos tres segundos.
            6• Imprimimos “Las redes parecen que van bien”.*/
        


        //1 Uso el getProperty
        String sistemaOperativo = System.getProperty("os.name");

        System.out.println("El Sistema operativo actual es: " + sistemaOperativo);
        

        //2 Un simple Thread.sleep
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.err.println("Error en la primera interrupción de 5 segundos");
        }
        

        // Creo el proceso e inicio una variable para determinar el nombre del archivo, que será diferente según el SO
        ProcessBuilder pb = null;
        Process p = null;
        String nombreArchivo = null;
        

        //3 caso Windows
        if (sistemaOperativo.toLowerCase().contains("win")) {
            try {
                String[] comando = {"CMD", "/c", "ipconfig /all"};
                pb = new ProcessBuilder(comando);
                p = pb.start();
                nombreArchivo = "salidaWindows.txt";

            } catch (IOException ex) {
                System.err.println("IO Exception 1");
            }

        //4.1 caso Linux
        } else if (sistemaOperativo.toLowerCase().contains("nux")) {
            try {
                String[] comando = {"/bin/bash", "-c", "ifconfig -a"};
                pb = new ProcessBuilder(comando);
                p = pb.start();
                nombreArchivo = "salidaLinux.txt";

            } catch (IOException ex) {
                System.err.println("IO Exception 2");
            }

        //4.2 caso MacOS
        } else if (sistemaOperativo.toLowerCase().contains("mac")) {
            try {

                String[] comando = {"/bin/bash", "-c", "ifconfig -a"};
                pb = new ProcessBuilder(comando);
                p = pb.start();
                nombreArchivo = "salidaMac.txt";

            } catch (IOException ex) {
                System.err.println("IO Exception 3");
            }
        }

        // Genero lo necesario para realizar la lectura
        InputStream is = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linea = null;

        try {
            linea = br.readLine();
        } catch (IOException ex) {
            System.err.println("Error al leer la consola");
        }

        // Creo (borrando si ya existe) el archivo
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            archivo.delete();
        }

        //Imprimo por pantalla y en el archivo, la ejecución, a la vez
        FileWriter fw = null;
        try {
            fw = new FileWriter(archivo, true);
            while (linea != null) {
                System.out.println(linea);
                fw.write(linea + "\n");
                linea = br.readLine();
            }
        } catch (IOException ex) {
            System.err.println("Error al crear el Filewriter del archivo");
        } finally {
            try {
                fw.close();
                br.close();
            } catch (IOException ex) {
                System.err.println("Excepcion al cerrar el archivo");
            }
        }

        //5
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.err.println("Error en la segunda interrupción de 3 segundos");
        }

        //6
        System.out.println("\nLas redes parece que están bien");

        





//ATENCIÓN!!. : Modifica haz otra versión del ejercicio utilizando el bloque “try-with-resources”.

        //Optimizo el código después de darle una vuelta:

        sistemaOperativo = System.getProperty("os.name");
        System.out.println("\nEl Sistema operativo actual es: " + sistemaOperativo);

        String[] comando = new String[3];

        String linea2 = null;

        if (sistemaOperativo.toLowerCase().contains("win")) {
            comando[0] = "CMD";
            comando[1] = "/c";
            comando[2] = "ipconfig /all";
            nombreArchivo = "salidaWindows2.txt";

        } else if (sistemaOperativo.toLowerCase().contains("nux")) {
            comando[0] = "/bin/bash";
            comando[1] = "-c";
            comando[2] = "ifconfig -a";
            nombreArchivo = "salidaLinux2.txt";

        } else if (sistemaOperativo.toLowerCase().contains("mac")){
            comando[0] = "/bin/bash";
            comando[1] = "-c";
            comando[2] = "ifconfig -arrrrgggggg";// error forzado
            nombreArchivo = "salidaMac2.txt";
        }

        try {
            ProcessBuilder pb2 = new ProcessBuilder(comando);
            p = pb2.start();
            File archivo2 = new File(nombreArchivo);
                if (archivo2.exists()) {
                    archivo2.delete();
                }
                
            //Para cerrar los flujos directamente al terminar uso el try whith resources:
            
            try ( InputStream is2 = p.getInputStream();  InputStreamReader isr2 = new InputStreamReader(is2);  BufferedReader br2 = new BufferedReader(isr2);  FileWriter fw2 = new FileWriter(archivo2, true);) {

                linea2 = br2.readLine();
                
                while (linea2 != null) {
                    System.out.println(linea2);
                    fw2.write(linea2 + "\n");
                    linea2 = br2.readLine();
                }

            } catch (IOException e) {
                System.err.println("IO Exception2.1");

            }

        } catch (IOException ex) {
            System.err.println("IO Exception 2.2");
        }
        
        

//ATENCIÓN2!!: Añade al ejercicio anterior el código necesario para imprimir también la salida de error estándar sterr.





        
        sistemaOperativo = System.getProperty("os.name");
        System.out.println("\nEl Sistema operativo actual es: " + sistemaOperativo);

        String[] comando3 = new String[3];

        String linea3 = null;

        if (sistemaOperativo.toLowerCase().contains("win")) {
            comando3[0] = "CMD";
            comando3[1] = "/c";
            comando3[2] = "ipconfig /allesgood";// error forzado
            nombreArchivo = "salidaWindows3Error.txt";

        } else if (sistemaOperativo.toLowerCase().contains("nux")) {
            comando3[0] = "/bin/bash";
            comando3[1] = "-c";
            comando3[2] = "ifconfig -arrrrgggggg";// error forzado
            nombreArchivo = "salidaLinux3Error.txt";

        } else if (sistemaOperativo.toLowerCase().contains("mac")){
            comando3[0] = "/bin/bash";
            comando3[1] = "-c";
            comando3[2] = "ifconfig -arrrrgggggg";// error forzado
            nombreArchivo = "salidaMac3Error.txt";
        }

        try {
            ProcessBuilder pb3 = new ProcessBuilder(comando3);
            p = pb3.start();
            File archivo3 = new File(nombreArchivo);
                if (archivo3.exists()) {
                    archivo3.delete();
                }
                
            //el proceso p recoge los errores por el .getErrorStream()
            try ( InputStream is3 = p.getErrorStream();  InputStreamReader isr3 = new InputStreamReader(is3);  BufferedReader br3 = new BufferedReader(isr3);  FileWriter fw3 = new FileWriter(archivo3, true);) {

                linea3 = br3.readLine();
                
                while (linea3 != null) {
                    System.out.println(linea3);
                    fw3.write(linea3 + "\n");
                    linea3 = br3.readLine();
                }

            } catch (IOException e) {
                System.err.println("IO Exception3.1");

            }

        } catch (IOException ex) {
            System.err.println("IO Exception 3.2");
        }

    }

}
