/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tareapeliculas;

import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author damt210
 */
public class TareaPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form TareaPeliculas
     */
    public TareaPeliculas() {
        initComponents();
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
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldIntroTexto = new javax.swing.JTextField();
        jButtonAñadir = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jLabelFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("1_3_Películas_Ramiro_Gutierrez_Valverde");
        setBounds(new java.awt.Rectangle(0, 25, 600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("TOP 10 películas de la historia");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 20));

        jTextFieldIntroTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIntroTextoKeyPressed(evt);
            }
        });
        jPanelFondo.add(jTextFieldIntroTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 300, -1));

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jComboBox.setMaximumRowCount(10);
        jComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxKeyPressed(evt);
            }
        });
        jPanelFondo.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 380, -1));

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hollywood.jpg"))); // NOI18N
        jLabelFoto.setMaximumSize(new java.awt.Dimension(600, 350));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(600, 350));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(600, 350));
        jPanelFondo.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    LinkedList <String> peliculas = new LinkedList();
    
    
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        
        if(peliculas.size()<=9){
            String titulo=jTextFieldIntroTexto.getText();
            if(titulo.isBlank()){
                JOptionPane.showMessageDialog(jPanelFondo,"Debe escribir un título válido", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(peliculas.contains(titulo)){
                JOptionPane.showMessageDialog(jPanelFondo, "El título ya aparece en la lista","Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(jPanelFondo, "Película añadida con éxito","Message", JOptionPane.INFORMATION_MESSAGE);
                peliculas.add(titulo);
                jComboBox.addItem(titulo);
            
        }
                
        }else{
            JOptionPane.showMessageDialog(jPanelFondo,"Ha alcanzado el número máximo de películas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldIntroTexto.setText(null);
        jTextFieldIntroTexto.requestFocus();
        
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jTextFieldIntroTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIntroTextoKeyPressed
        if (evt.getExtendedKeyCode()==VK_ENTER) jButtonAñadir.doClick();
        if (evt.getExtendedKeyCode()==VK_ESCAPE) System.exit(0);
    }//GEN-LAST:event_jTextFieldIntroTextoKeyPressed

    private void jComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxKeyPressed
        if (evt.getExtendedKeyCode()==VK_ESCAPE) System.exit(0);
    }//GEN-LAST:event_jComboBoxKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TareaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareaPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldIntroTexto;
    // End of variables declaration//GEN-END:variables
}
