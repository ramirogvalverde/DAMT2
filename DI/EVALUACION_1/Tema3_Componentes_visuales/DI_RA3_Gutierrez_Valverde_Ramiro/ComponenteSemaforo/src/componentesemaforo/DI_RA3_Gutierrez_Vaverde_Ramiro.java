/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package componentesemaforo;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author damt210
 */
public class DI_RA3_Gutierrez_Vaverde_Ramiro extends javax.swing.JFrame {

    /**
     * Creates new form DI_RA3_Gutierrez_Vaverde_Ramiro
     */
    public DI_RA3_Gutierrez_Vaverde_Ramiro() {
        initComponents();
    }
    
    private Color selector() {
        //Crear Objeto Color Selector
        JColorChooser colorChooser = new JColorChooser();
        
        //Mostrar el selector
        int resultado = JOptionPane.showConfirmDialog(null, colorChooser, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
 
        
        //Coger el color
        if (resultado == JOptionPane.OK_OPTION) {
            return colorChooser.getColor();
 
        } else {
            return Color.BLACK;
        }
    }
    
    private Color jlabel1Color;
    private Color jlabel2Color;
    private Color jlabel3Color;

    public Color getJlabel1Color() {
        return jlabel1Color;
    }

    public void setJlabel1Color(Color jlabel1Color) {
        this.jlabel1Color = jlabel1Color;
    }

    public Color getJlabel2Color() {
        return jlabel2Color;
    }

    public void setJlabel2Color(Color jlabel2Color) {
        this.jlabel2Color = jlabel2Color;
    }

    public Color getJlabel3Color() {
        return jlabel3Color;
    }

    public void setJlabel3Color(Color jlabel3Color) {
        this.jlabel3Color = jlabel3Color;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        miBotonAlto = new componentesemaforo.MiBotonColores();
        miBotonPrecaucion = new componentesemaforo.MiBotonColores();
        miBotonPuedePasar = new componentesemaforo.MiBotonColores();
        jButtonColorPrecaucion = new javax.swing.JButton();
        jButtonColorPasar = new javax.swing.JButton();
        jButtonAlto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DI_RA3_Gutierrez_Vaverde_Ramiro");
        setResizable(false);

        jLabel1.setText("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        jLabel2.setText("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        jLabel3.setText("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        miBotonAlto.setBackground(new java.awt.Color(255, 0, 0));
        miBotonAlto.setText("ALTO");
        miBotonAlto.setA_colorMensaje(new java.awt.Color(0, 0, 51));
        miBotonAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBotonAltoActionPerformed(evt);
            }
        });

        miBotonPrecaucion.setBackground(new java.awt.Color(255, 255, 51));
        miBotonPrecaucion.setForeground(new java.awt.Color(51, 51, 0));
        miBotonPrecaucion.setText("PRECAUCION");
        miBotonPrecaucion.setA_colorMensaje(new java.awt.Color(0, 0, 102));
        miBotonPrecaucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBotonPrecaucionActionPerformed(evt);
            }
        });

        miBotonPuedePasar.setBackground(new java.awt.Color(51, 153, 0));
        miBotonPuedePasar.setText("PUEDE PASAR");
        miBotonPuedePasar.setA_colorMensaje(new java.awt.Color(51, 51, 255));
        miBotonPuedePasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBotonPuedePasarActionPerformed(evt);
            }
        });

        jButtonColorPrecaucion.setText("...");
        jButtonColorPrecaucion.setToolTipText("Cambia el color del texto oculto");
        jButtonColorPrecaucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorPrecaucionActionPerformed(evt);
            }
        });

        jButtonColorPasar.setText("...");
        jButtonColorPasar.setToolTipText("Cambia el color del texto oculto");
        jButtonColorPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorPasarActionPerformed(evt);
            }
        });

        jButtonAlto.setText("...");
        jButtonAlto.setToolTipText("Cambia el color del texto oculto");
        jButtonAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonColorPrecaucion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonColorPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(miBotonPuedePasar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(miBotonAlto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(miBotonPrecaucion, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlto))
                .addGap(18, 18, 18)
                .addComponent(miBotonAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonColorPrecaucion))
                .addGap(18, 18, 18)
                .addComponent(miBotonPrecaucion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonColorPasar))
                .addGap(18, 18, 18)
                .addComponent(miBotonPuedePasar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miBotonAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBotonAltoActionPerformed
        jLabel1.setText("Los vehículos que circulan por el carril deben detenerse");
        jLabel1.setForeground(miBotonAlto.getA_colorMensaje());
        
    }//GEN-LAST:event_miBotonAltoActionPerformed

    private void miBotonPrecaucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBotonPrecaucionActionPerformed
        jLabel2.setText("si es intermitente circule con precaución, si es fija pare");
        jLabel2.setForeground(miBotonPrecaucion.getA_colorMensaje());
    }//GEN-LAST:event_miBotonPrecaucionActionPerformed

    private void miBotonPuedePasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBotonPuedePasarActionPerformed
        jLabel3.setText("Los vehículos que circulan por el carril sobre el cual está situado han de parar");
       jLabel3.setForeground(miBotonPuedePasar.getA_colorMensaje());
    }//GEN-LAST:event_miBotonPuedePasarActionPerformed

    private void jButtonAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltoActionPerformed
        
        Color nuevoColor = selector();
        jLabel1.setForeground(nuevoColor);
    }//GEN-LAST:event_jButtonAltoActionPerformed

    private void jButtonColorPrecaucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorPrecaucionActionPerformed
        Color nuevoColor = selector();
        jLabel2.setForeground(nuevoColor);
    }//GEN-LAST:event_jButtonColorPrecaucionActionPerformed

    private void jButtonColorPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorPasarActionPerformed
        Color nuevoColor = selector();
        jLabel3.setForeground(nuevoColor);
    }//GEN-LAST:event_jButtonColorPasarActionPerformed

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
            java.util.logging.Logger.getLogger(DI_RA3_Gutierrez_Vaverde_Ramiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DI_RA3_Gutierrez_Vaverde_Ramiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DI_RA3_Gutierrez_Vaverde_Ramiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DI_RA3_Gutierrez_Vaverde_Ramiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DI_RA3_Gutierrez_Vaverde_Ramiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlto;
    private javax.swing.JButton jButtonColorPasar;
    private javax.swing.JButton jButtonColorPrecaucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private componentesemaforo.MiBotonColores miBotonAlto;
    private componentesemaforo.MiBotonColores miBotonPrecaucion;
    private componentesemaforo.MiBotonColores miBotonPuedePasar;
    // End of variables declaration//GEN-END:variables
}
