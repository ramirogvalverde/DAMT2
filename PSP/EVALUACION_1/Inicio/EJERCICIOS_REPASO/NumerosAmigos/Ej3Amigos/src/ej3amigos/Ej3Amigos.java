package ej3amigos;

/**
 *
 * @author ramirogvalverde
 */
public class Ej3Amigos {

    public static void main(String[] args) {
        sonNumerosAmigos(220, 284);
    }

    public static boolean sonNumerosAmigos(int num1, int num2) {
        int sumaNum1 = 1;
        int sumaNum2 = 1;

        for (int i = num1 - 1; i > 1; i--) {
            if (num1 % i == 0) {
                sumaNum1 += i;
            }

        }
        if (sumaNum1 != num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " NO son amigos.");
            return false;
        }

        for (int i = num2 - 1; i > 1; i--) {
            if (num2 % i == 0) {
                sumaNum2 += i;
            }
        }
        if (sumaNum2 != num1) {
            System.out.println("Los números " + num1 + " y " + num2 + " NO son amigos.");
            return false;
        }
        System.out.println("Los números " + num1 + " y " + num2 + " SI son amigos.");
        return true;
    }

}
