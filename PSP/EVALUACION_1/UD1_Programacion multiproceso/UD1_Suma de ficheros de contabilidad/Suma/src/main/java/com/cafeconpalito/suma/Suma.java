package com.cafeconpalito.suma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que, recibiendo el nombre de un archivo como argumento (String
 * args[]), genera otro archivo con formato: "nombreDelArchivo.res", en el que
 * se suma los números que contiene (sólo contiene números y estos están en
 * diferentes líneas). Además, imprime el resultado por pantalla.
 *
 * @author Ramiro Gutiérrez Valverde
 *
 */
public class Suma {

    public static void main(String[] args) {

        int suma = 0;
        String lectura = null;

        File fichero = new File(args[0]);
        File ficheroRes = new File(args[0] + ".res");

        if (ficheroRes.exists()) {
            ficheroRes.delete();
        }

        try ( FileReader fr = new FileReader(fichero);  BufferedReader br = new BufferedReader(fr);  FileWriter fw = new FileWriter(ficheroRes)) {

            while ((lectura = br.readLine()) != null) {
                suma += Integer.parseInt(lectura);
            }
            
            fw.write(suma +""); //al ponerlo sin las comillas me imprime un caracter, no el número
            
            System.out.println("La suma de los numeros del archivo es: " + suma);

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex) {
            System.err.println("IO Exception");
        }

    }

}
