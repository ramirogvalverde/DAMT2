package com.mycompany.generafichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro gutiérrez Valverde
 */
public class GeneraFichero {

    public static void main(String[] args) {

        generarFicheros(3, 1000000);

    }

    /**
     * Método que genera ficheros de números enteros, entre 0 y 100, con formato
     * "contabilidad(n).txt"
     *
     * @param numeroFicheros recibe el número de ficheros que se quieren generar
     * @param cantidadNumeros recibe la cantidad de números que va a generar
     * dentro del fichero
     *
     */
    public static void generarFicheros(int numeroFicheros, int cantidadNumeros) {

        for (int i = 0; i < numeroFicheros; i++) {
            File archivo = new File("contabilidad" + (i + 1) + ".txt");
            
            if(archivo.exists()){
                archivo.delete();
            }

            try ( FileWriter fw = new FileWriter(archivo)) {
                for (int j = 0; j < cantidadNumeros; j++) {
                    fw.write((int) (Math.random() * 100) + "\n");
                }
                System.out.println("contabilidad" + (i + 1) + ".txt escrito con éxito");

            } catch (IOException ex) {
                System.err.println("IO Exception");
            }

        }
    }

}
