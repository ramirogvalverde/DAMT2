
package es.iesaugusto.sumacompartida;

/**
 *
 * @author Ramiro
 */
public class Contador {
    int numero;

    public Contador() {
        numero=0;    
    }
    
    public synchronized void sumacontador(int valor){
        numero=numero+valor;
    }
    
    public int getContador(){
        return numero;
    }
    
}
