
package ad_parte2;

import java.io.Serializable;

/**
 *
 * @author Ramiro
 */
public class Juego implements Serializable {
    
    /*objetos de tipo JUEGO,
donde cada juego está identificado por una clave única, un título y un PEGI*/
    int clave;
    String titulo;
    int pegi;

    public Juego(int clave, String título, int pegi) {
        this.clave = clave;
        this.titulo = titulo;
        this.pegi = pegi;
    }

    public Juego() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTítulo() {
        return titulo;
    }

    public void setTítulo(String título) {
        this.titulo = titulo;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
