/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author damt210
 */
public class Conversor extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public Conversor() {
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

        Background = new javax.swing.JPanel();
        EntradaCelsius = new javax.swing.JTextField();
        Celsius = new javax.swing.JLabel();
        Fahrenheit = new javax.swing.JLabel();
        Convertir = new javax.swing.JButton();
        respuesta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor C a F");
        setBounds(new java.awt.Rectangle(0, 0, 230, 200));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(230, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(153, 204, 255));
        Background.setForeground(new java.awt.Color(153, 204, 255));
        Background.setMaximumSize(new java.awt.Dimension(230, 200));
        Background.setMinimumSize(new java.awt.Dimension(230, 200));
        Background.setPreferredSize(new java.awt.Dimension(230, 200));

        EntradaCelsius.setMaximumSize(new java.awt.Dimension(64, 22));
        EntradaCelsius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaCelsiusKeyPressed(evt);
            }
        });

        Celsius.setText("º C");

        Fahrenheit.setText("º F");

        Convertir.setBackground(new java.awt.Color(102, 255, 0));
        Convertir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Convertir.setText("Convertir");
        Convertir.setAlignmentY(0.0F);
        Convertir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Convertir.setIconTextGap(0);
        Convertir.setMaximumSize(new java.awt.Dimension(82, 22));
        Convertir.setMinimumSize(new java.awt.Dimension(82, 22));
        Convertir.setPreferredSize(new java.awt.Dimension(88, 22));
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        respuesta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        respuesta.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Conversor");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EntradaCelsius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respuesta)
                            .addComponent(Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Celsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Celsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuesta)
                    .addComponent(Fahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        String valorCelsius = EntradaCelsius.getText();
        double celsius;

        try {

            celsius = Double.parseDouble(valorCelsius);

            double fahrenheit;

            fahrenheit = (celsius * 9/5) + 32;

            respuesta.setText(Double.toString(fahrenheit));

        } catch (NumberFormatException e) {
            String error =e.getMessage();
            
            JOptionPane jop =new JOptionPane("Campo vacío", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jop.createDialog("ATENCIÓN");
            dialog.setLocation(Background.getLocationOnScreen().x + 300,Background.getLocationOnScreen().y);
            
            JOptionPane jop2 =new JOptionPane("Dato con coma", JOptionPane.ERROR_MESSAGE);
            JDialog dialog2 = jop2.createDialog("ERROR");
            dialog2.setLocation(Background.getLocationOnScreen().x + 300,Background.getLocationOnScreen().y);
            
            JOptionPane jop3 =new JOptionPane("Input erróneo", JOptionPane.ERROR_MESSAGE);
            JDialog dialog3 = jop3.createDialog("ERROR");
            dialog3.setLocation(Background.getLocationOnScreen().x + 300,Background.getLocationOnScreen().y);
            
            if(e.getMessage().contains("empty")){
                //respuesta.setText("");
                dialog.setVisible(true);               
               // EntradaCelsius.requestFocus();           
            }else if(e.getMessage().contains(",")){           
                respuesta.setText("");
                dialog2.setVisible(true);
                EntradaCelsius.setText(null);
                EntradaCelsius.requestFocus();
            }else{
                respuesta.setText("");
                dialog3.setVisible(true);
                EntradaCelsius.setText(null);
                EntradaCelsius.requestFocus();
            }
            System.out.println(error);
            
            
        }
    }//GEN-LAST:event_ConvertirActionPerformed

    private void EntradaCelsiusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaCelsiusKeyPressed
        if (evt.getExtendedKeyCode()==VK_ENTER) Convertir.doClick();
        if (evt.getExtendedKeyCode()==VK_ESCAPE) System.exit(0);
    }//GEN-LAST:event_EntradaCelsiusKeyPressed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Celsius;
    private javax.swing.JButton Convertir;
    private javax.swing.JTextField EntradaCelsius;
    private javax.swing.JLabel Fahrenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
