
package crearjpanel;

import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Ramiro
 */

public class Jpanel_Imagen extends JPanel implements Serializable {

    String rutaImagen;
    
    public Jpanel_Imagen() {
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
    
}
