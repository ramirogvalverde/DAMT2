
package tarea_3_3_componentes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Ramiro
 * Extiende serializable y keyListener porque necesito que haga algo al manejar teclas
 */

public class TexfieldColor extends JTextField implements Serializable, KeyListener {
    
    
    //declaro variables que necesito para que el usuario pueda setearlas
    
    private Color a_colorFondoAntes;
    private Color a_colorFondoDespues;
    private Color a_colorTextoAntes;
    private Color a_colorTextoDespues;
    private int a_numCaracteres;

    //constructor por defecto que inicia los parámetros y componentes del textfield
    
    public TexfieldColor() {
        this.addKeyListener(this);
        
        this.a_numCaracteres = 6; //  porque el caracter numero 6 cambia el color
        this.a_colorFondoAntes= Color.WHITE;
        this.a_colorTextoAntes= Color.BLACK;
        
        this.setBackground(a_colorFondoAntes);
        this.setForeground(a_colorTextoAntes);
        
        this.setText("TexfieldColor");  
    }
    
    // getters y setters autogenerados
    
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

    public int getA_numCaracteres() {
        return a_numCaracteres;
    }

    public void setA_numCaracteres(int a_numCaracteres) {
        this.a_numCaracteres = a_numCaracteres;
    }

    
  
    
    // métodos que implementa el KeyListener

    @Override
    public void keyTyped(KeyEvent e) {        
    }

    @Override
    public void keyPressed(KeyEvent e) {        
    }

    @Override
    public void keyReleased(KeyEvent e) { // mejor al soltar la tecla 
        
        if (this.getText().length() >= a_numCaracteres) {
            this.setBackground(a_colorFondoDespues);
            this.setForeground(a_colorTextoDespues);
        }else{
            this.setBackground(a_colorFondoAntes);
            this.setForeground(a_colorTextoAntes);
        }
        
    }    
    
}
