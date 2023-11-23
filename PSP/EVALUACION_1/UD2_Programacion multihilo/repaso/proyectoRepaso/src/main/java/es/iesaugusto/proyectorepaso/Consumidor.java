
package es.iesaugusto.proyectorepaso;

/**
 *
 * @author Ramiro
 */
public class Consumidor extends Thread{
    
    Buffer b;
    String nombre;
    int espera;

    public Consumidor(Buffer b, String nombre, int espera) {
        this.b = b;
        this.nombre = nombre;
        this.espera = espera;
    }
    

    @Override
    public void run() {
        while(!b.termine){
        b.ejecuta(nombre, espera);
        }
        
    }
    public void bla(){
        System.out.println("si termine");
    }
    
    
    
}
