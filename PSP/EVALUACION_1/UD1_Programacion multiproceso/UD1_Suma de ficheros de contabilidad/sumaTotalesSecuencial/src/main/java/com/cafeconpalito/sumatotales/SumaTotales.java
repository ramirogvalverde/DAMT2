package com.cafeconpalito.sumatotales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Programa que lanza n procesos, tantos como ficheros pasados como argumentos,
 * que calcula la suma de los números de dichos ficheros. Devuelve la suma total
 * de los totales de dichos ficheros y el tiempo de ejecución, en secuencial y
 * en paralelo.
 *
 * @author Ramiro Gutiérrez Valverde
 *
 */
public class SumaTotales {

    public static void main(String[] args) {

        sumaTotalSecuencial(args);
        sumaTotalParalela(args);

    }

    /**
     * Ejecuta los procesos de forma secuencial. Cuando se lanza un proceso,
     * espera a que éste termine para lanzar el siguiente
     *
     * @param args
     */
    public static void sumaTotalSecuencial(String[] args) {

        int sumaTotal = 0;
        //inicio el temporizador
        long start = System.nanoTime();
        System.out.println("\nEjecución SECUENCIAL\n");

        // bucle que lanza el proceso por cada argumento, generando un .res
        for (int i = 0; i < args.length; i++) {

            String[] command = {"/bin/bash", "-c", "java -jar Suma-1.0-SNAPSHOT-SHADED.jar " + args[i]};
            ProcessBuilder pb = new ProcessBuilder(command);
            Process p = null;

            try {
                // lanzo y detengo el proceso
                p = pb.start();
                p.waitFor();
                // leo el archivo .res
                FileReader fr = new FileReader(args[i] + ".res");
                BufferedReader br = new BufferedReader(fr);
                // imprimo por pantalla el resultado de cada proceso y lo almaceno en la suma total
                String linea = null;
                while ((linea = br.readLine()) != null) {
                    sumaTotal += Integer.parseInt(linea);
                    System.out.println("La suma del documento " + (i + 1) + " es: " + linea);
                }

            } catch (IOException ex) {
                System.err.println("IO Exception");
            } catch (InterruptedException ex) {
                System.err.println("Interrupted Exception");
            }

        }
        
        // paro el temporizador y calculo el tiempo total
        long finish = System.nanoTime();
        long tiempoTotal = finish - start;
        // finalmente imprimo la información
        System.out.println("El total de la suma de los documentos es: " + sumaTotal);

        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTotal / 1000000);

    }

    /**
     * Ejecuta los procesos de forma paralela. Se lanzan los tres procesos a la
     * vez y, cuando han terminado, se pasa a la lectura y suma total.
     *
     * @param args
     */
    public static void sumaTotalParalela(String[] args) {

        int sumaTotal = 0;
        long start = System.nanoTime();
        System.out.println("\nEjecución PARALELA\n");
        ProcessBuilder pb = null;
        Process[] p = new Process[args.length];// necesito un array de procesos para realizar lo siguiente:

        // inicio los procesos hijos con un bucle
        for (int i = 0; i < args.length; i++) {
            String[] command = {"/bin/bash", "-c", "java -jar Suma-1.0-SNAPSHOT-SHADED.jar " + args[i]};
            pb = new ProcessBuilder(command);

            try {
                p[i] = pb.start();

            } catch (IOException e) {
                System.err.println("IO EXception");
            }

        }

        // despues de que se hayan iniciado todos, los hago esperar a que terminen con otro bucle
        for (int i = 0; i < args.length; i++) {

            try {
                p[i].waitFor();

            } catch (InterruptedException ex) {
                System.err.println("Interrupted Exception");
            }

        }

        // con otro bucle leo el archivo res, e imprimo y sumo el total
        for (int i = 0; i < args.length; i++) {
        
            try {
                FileReader fr = new FileReader(args[i] + ".res");
                BufferedReader br = new BufferedReader(fr);

                String linea = null;
                while ((linea = br.readLine()) != null) {
                    sumaTotal += Integer.parseInt(linea);
                    System.out.println("La suma del documento " + (i + 1) + " es: " + linea);
                }

            } catch (IOException ex) {
                System.err.println("IO Exception");
            }

        }
        
        long finish = System.nanoTime();
        long tiempoTotal = finish - start;

        System.out.println("El total de la suma de los documentos es: " + sumaTotal);

        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTotal / 1000000);

    }

}
