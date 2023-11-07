package componenteusersteam;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Ramiro
 */
public class UserLogueado extends javax.swing.JPanel implements Serializable {

    /**
     * Creates new form UserLogueado
     */
    public UserLogueado() {
        initComponents();
    }
    private File rutaImagen;
    
    private String User;

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
        jLabel1.setText(User);
    }
    
    private LocalDate fechaLogin = LocalDate.now();

    public void setFechaLogin(String fechaLogin1) {
        fechaLogin1 = fechaLogin.toString();
        jLabel2.setText(fechaLogin1);
    }
    

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
        jpanel_Imagen1.setRutaImagen(rutaImagen);
    }

    public Jpanel_Imagen getJpanel_Imagen1() {
        return jpanel_Imagen1;
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpanel_Imagen1 = new componenteusersteam.Jpanel_Imagen();

        jLabel1.setText("Nombre del tíu");

        jLabel2.setText("Hora del login");

        javax.swing.GroupLayout jpanel_Imagen1Layout = new javax.swing.GroupLayout(jpanel_Imagen1);
        jpanel_Imagen1.setLayout(jpanel_Imagen1Layout);
        jpanel_Imagen1Layout.setHorizontalGroup(
            jpanel_Imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jpanel_Imagen1Layout.setVerticalGroup(
            jpanel_Imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jpanel_Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelFondo;
    private componenteusersteam.Jpanel_Imagen jpanel_Imagen1;
    // End of variables declaration//GEN-END:variables
}
