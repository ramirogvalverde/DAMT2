
package componentesemaforo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Ramiro
 * 
 */
public class MiBotonColores extends JButton implements Serializable, MouseListener {
    
    private Color a_colorFondoAntes;
    private Color a_colorFondoDespues;
    private Color a_colorTextoAntes;
    private Color a_colorTextoDespues;
    private Color a_colorMensaje;
    
    


    public MiBotonColores() {
        this.addMouseListener(this);
        
        this.a_colorFondoAntes= Color.WHITE;
        this.a_colorTextoAntes= Color.BLACK;
        
        this.setBackground(a_colorFondoAntes);
        this.setForeground(a_colorTextoAntes);
    }

    public Color getA_colorMensaje() {
        return a_colorMensaje;
    }

    public void setA_colorMensaje(Color a_colorMensaje) {
        this.a_colorMensaje = a_colorMensaje;
    }
    
    

    public Color getA_colorFondoAntes() {
        return a_colorFondoAntes;
    }

    public void setA_colorFondoAntes(Color a_colorFondoAntes) {
        this.a_colorFondoAntes = a_colorFondoAntes;
    }

    public Color getA_colorFondoDespues() {
        return a_colorFondoDespues;
    }

    public void setA_colorFondoDespues(Color a_colorFondoDespues) {
        this.a_colorFondoDespues = a_colorFondoDespues;
    }

    public Color getA_colorTextoAntes() {
        return a_colorTextoAntes;
    }

    public void setA_colorTextoAntes(Color a_colorTextoAntes) {
        this.a_colorTextoAntes = a_colorTextoAntes;
    }

    public Color getA_colorTextoDespues() {
        return a_colorTextoDespues;
    }

    public void setA_colorTextoDespues(Color a_colorTextoDespues) {
        this.a_colorTextoDespues = a_colorTextoDespues;
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.a_colorFondoDespues= Color.BLACK;
        this.a_colorTextoDespues= Color.WHITE;
        this.setBackground(a_colorFondoDespues);
        this.setForeground(a_colorTextoDespues);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
