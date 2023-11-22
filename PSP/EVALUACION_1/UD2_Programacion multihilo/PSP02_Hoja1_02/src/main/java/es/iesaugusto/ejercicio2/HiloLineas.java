package es.iesaugusto.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ramiro
 */
public class HiloLineas extends Thread {

    String nombreArchivo;

    public HiloLineas(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public HiloLineas() {
    }

    @Override
    public void run() {
        try {

            FileReader fr = new FileReader(nombreArchivo);            
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            int sumaLineas = 0;

            while (linea != null) {
                sumaLineas += 1;
                linea = br.readLine();
            }
            System.out.println("Hay " + sumaLineas + " lineas en el archivo");

        } catch (IOException e) {
            System.err.println("IO Exception");

        }

    }
}
