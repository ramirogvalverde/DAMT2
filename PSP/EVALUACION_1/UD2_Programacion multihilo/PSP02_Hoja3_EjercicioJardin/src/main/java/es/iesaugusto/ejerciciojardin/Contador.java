package es.iesaugusto.ejerciciojardin;

/**
 *
 * @author damt210
 */
public class Contador {

    private int personasDentro;

    public Contador() {
        personasDentro = 100;
    }

    public synchronized void sumaContador(int personasEntran) {
        personasDentro = personasDentro + personasEntran;
        System.out.println("Entra una persona");
        System.out.println("Quedan " + muestraContador() + " personas dentro");
    }

    public synchronized void restaContador(int personasSalen) {
        personasDentro = personasDentro - personasSalen;
        System.out.println("Sale una persona");
        System.out.println("Quedan " + muestraContador() + " personas dentro");
    }

    public int muestraContador() {
        return personasDentro;
    }

}
