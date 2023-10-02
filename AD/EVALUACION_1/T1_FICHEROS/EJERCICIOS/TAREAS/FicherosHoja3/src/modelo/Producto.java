
package modelo;

import java.io.Serializable;

/**
 *
 * @author Ramiro
 */
public class Producto implements Serializable{
    
    String nombre;
    double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre :" + nombre + ". Precio: " + precio;
    }
    
    
    
}
