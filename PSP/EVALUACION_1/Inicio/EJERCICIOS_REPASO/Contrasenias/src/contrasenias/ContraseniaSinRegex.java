package contrasenias;

import java.util.Scanner;

public class ContraseniaSinRegex {

    public static void main(String[] args) {

        String cadena;
        boolean esCorrecto = false;
        boolean esMinuscula = false;
        boolean esMayuscula = false;
        boolean esNumero = false;
        boolean esEspecial = false;

        do {
            Scanner lectura = new Scanner(System.in);
            System.out.println("Introduce un password correcto");

            cadena = lectura.next();
            if (cadena.length() < 8) {
                System.out.println("la longitud del password no es correcta");

            } else {

                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);

                    if (Character.isLowerCase(caracter)) {
                        esMinuscula = true;
                    }
                    if (Character.isUpperCase(caracter)) {
                        esMayuscula = true;
                    }
                    if (Character.isDigit(caracter)) {
                        esNumero = true;
                    }
                    if (caracter == '-' || caracter == '_' || caracter == '/') {
                        esEspecial = true;
                    }

                }
                if (!esMinuscula){System.out.println("Necesitas al menos una minúscula");};
                if (!esMayuscula){System.out.println("Necesitas al menos una mayúscula");};
                if (!esNumero){System.out.println("Necesitas al menos un número");};
                if (!esEspecial){System.out.println("Necesitas al menos un caracter especial (- _ /)");};
                
                if (esMinuscula && esEspecial && esNumero && esMayuscula) {
                    System.out.println("El password es correcto");
                    esCorrecto = true;

                } else {
                    System.out.println("El password es incorrecto");
                }

            }

        } while (!esCorrecto);

    }

}
