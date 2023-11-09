
package es.iesaugusto.pe_a2_ramiro.controlador;

import es.iesaugusto.pe_a2_ramiro.modelo.ConexionBBDD;
import es.iesaugusto.pe_a2_ramiro.vista.Login;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Ramiro
 */
public class ControladorLogin implements MouseListener{
    
    private ConexionBBDD con;
    private Login lg = new Login();
    
    public void run(){
        lg.setVisible(true);
        
        lg.getjButtonLogin().addMouseListener(this);
        lg.getjButtonCancelar().addMouseListener(this);
        
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getComponent().getName().equalsIgnoreCase("cancelar")){
            lg.getjTextFieldContrasenia().setText("");
            lg.getjTextFieldUsuario().setText("");
            lg.getjTextFieldMensaje().setText("");
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
