package com.cafeconpalito.refuerzoHilos;

/**
 *
 * @author Ramiro
 */
public class UD2_Refuerzo_Hilos {

    public static void main(String[] args) {

        Hilo juego = new Hilo();
        juego.start();

        for (int i = 0; i < 10; i++) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                System.err.println("INTERRUPTED Exception");
            }

            if (juego.compruebaEsCorrecto()) {
                //Si acierta se sale del for
                break;
            }

        }
        
        // Aquí solo entra si el for se ejecuta completo siendo falso el esCorrecto
        if (!juego.compruebaEsCorrecto()) {
            System.out.println("Fin del tiempo de juego. Perdiste");
            
            //tengo que matar el programa, no me sirve con matar el hilo...
            System.exit(0);
                    
        }

    }
}
