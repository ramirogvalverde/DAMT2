package com.mycompany.ejercicio9;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        FileWriter fw= null;
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

    }
}
