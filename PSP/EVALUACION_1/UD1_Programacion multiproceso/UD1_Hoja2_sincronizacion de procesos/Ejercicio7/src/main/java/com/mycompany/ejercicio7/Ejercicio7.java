package com.mycompany.ejercicio7;

import java.io.IOException;

/**
 *
 * @author Ramiro
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        /*7. Crea un programa igual el ejercicio 3, pero justo después de crear el proceso hijo el padre
espera a que termine antes de generar los números aleatorios. ¿Qué ocurre? Por último, obtén
el valor de salida.*/

        try {

            Runtime rt = Runtime.getRuntime();
            String[] comando = {"notepad.exe"};

            Process p = rt.exec(comando);

            int valorSalida = p.waitFor();

            for (int i = 0; i < 10; i++) {
                System.out.println((int) (Math.random() * 9));
            }
            
            System.out.println("Valor Salida= " + valorSalida);

        } catch (IOException ex) {
            System.err.println("IO Exception");
        } catch (InterruptedException ex) {
            System.err.println("IO Exception");
        }

    }
}
