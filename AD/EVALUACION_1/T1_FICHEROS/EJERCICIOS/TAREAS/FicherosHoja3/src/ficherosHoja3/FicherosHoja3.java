
package ficherosHoja3;

import controlador.*;
import modelo.*;
import vista.*;
/**
 *
 * @author Ramiro
 * 
 */
public class FicherosHoja3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto modelo =new Producto();
        Ventana vista = new Ventana();
        ControladorProducto controlador = new ControladorProducto(vista, modelo);
        controlador.iniciar();
        
    }
    
}
