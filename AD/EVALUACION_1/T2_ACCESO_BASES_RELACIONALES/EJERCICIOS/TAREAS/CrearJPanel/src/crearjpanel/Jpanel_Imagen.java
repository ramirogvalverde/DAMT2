
package crearjpanel;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ramiro
 */

public class Jpanel_Imagen extends JPanel implements Serializable {

    private File rutaImagen;
    
    public Jpanel_Imagen() {
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(rutaImagen!=null && rutaImagen.exists())
        {
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
            
        }
    }

    
    
    
    
}
