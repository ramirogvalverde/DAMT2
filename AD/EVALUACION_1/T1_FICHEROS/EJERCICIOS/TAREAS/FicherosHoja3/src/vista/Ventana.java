
package vista;

import modelo.Metodos;

/**
 *
 * @author Ramiro
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        jButtonListado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setText("NOMBRE");
        jPanelFondo.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 20));
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, -1));

        jLabelPrecio.setText("PRECIO");
        jPanelFondo.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 20));
        jPanelFondo.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, -1));

        jButtonGuardar.setText("GUARDAR");
        jPanelFondo.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, 70));

        JButtonCancelar.setText("CANCELAR");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });
        jPanelFondo.add(JButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, -1));

        jButtonListado.setText("LISTADO");
        jButtonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 110, 40));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoActionPerformed

    }//GEN-LAST:event_jButtonListadoActionPerformed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JButtonCancelar;
    public javax.swing.JButton jButtonGuardar;
    public javax.swing.JButton jButtonListado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanelFondo;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
