
package es.iesaugusto.ejerciciojardin;

/**
 *
 * @author damt210
 */
public class Contador {
    
    private int personasDentro;

    public Contador() {
        personasDentro=100;
    }
    
    public synchronized void sumaContador(int personasEntran ){
        personasDentro=personasDentro+ personasEntran;
    }
    
    public synchronized void restaContador(int personasSalen){
        personasDentro=personasDentro- personasSalen;
    }
    
    public int muestraContador(){
        return personasDentro;
    }
    
}
