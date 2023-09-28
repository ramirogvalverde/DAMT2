
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;

/**
 *
 * @author Ramiro
 * 
 */
public class ControladorProducto implements ActionListener{
    
    
    private final Producto modelo;
    private final Ventana vista;

    public ControladorProducto(Ventana vista, Producto modelo) {
        this.vista = vista;
        this.modelo = modelo;      
        this.vista.jButtonGuardar.addActionListener(this);
        this.vista.JButtonCancelar.addActionListener(this);
        this.vista.jButtonListado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("cancelar")){guardar();}
        else if(e.getActionCommand().equalsIgnoreCase("cancelar")){cancelar();}
        else{listar();}
    }
    
    private void guardar(){
        
    }
    
    private void cancelar(){
        
    }
    
    private void listar(){
        
    }
    
    
    
    
}
