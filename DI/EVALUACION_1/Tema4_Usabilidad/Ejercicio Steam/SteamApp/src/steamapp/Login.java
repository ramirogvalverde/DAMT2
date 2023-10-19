/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package steamapp;

import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author damt210
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        ImageIcon image2 = new ImageIcon("src/images/equis.png");
        Image imgEscalada2 = image2.getImage().getScaledInstance(jLabelX.getWidth(), jLabelX.getHeight(), WIDTH);
        ImageIcon imgFinal2 = new ImageIcon(imgEscalada2);
        jLabelX.setIcon(imgFinal2);

        jLabel2.setText("<html>© 2023 Valve Corporation. Todos los derechos reservados.<br>Todas las marcas registradas pertenecen a sus respectivos dueños en EE. UU. y otros países</html>");
        jLabel6.setText("<html><u>Help, can´t log in</u></html>");

    }

    public Boolean estaEnLista(String email, String password) {
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        Usuario Ramiro = new Usuario("ramiro@steam.com", "1234");       
        listaUsuarios.add(Ramiro);
        
        Usuario usuarioBuscado = new Usuario(email, password);

        if (listaUsuarios.contains(usuarioBuscado)) {
            return true;
        
        }else{
            return false;
        }
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
        jPanelUp = new javax.swing.JPanel();
        jLabelX = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDown = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanelFondo.setBackground(new java.awt.Color(27, 40, 56));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUp.setBackground(new java.awt.Color(23, 26, 33));
        jPanelUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelXMouseClicked(evt);
            }
        });
        jPanelUp.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 40, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GAME ADMINISTRATION");
        jPanelUp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 40));

        jPanelFondo.add(jPanelUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 130));

        jPanelDown.setBackground(new java.awt.Color(23, 26, 33));
        jPanelDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footerLogo_valve.png"))); // NOI18N
        jPanelDown.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 50));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelDown.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 440, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_steam_footer.png"))); // NOI18N
        jPanelDown.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, 30));

        jPanelFondo.add(jPanelDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 900, 130));

        jTextFieldPassword.setBackground(new java.awt.Color(42, 71, 94));
        jTextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassword.setText("PASSWORD");
        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 50, 5, 5));
        jTextFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPasswordFocusLost(evt);
            }
        });
        jTextFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPasswordMouseClicked(evt);
            }
        });
        jPanelFondo.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 330, 50));

        jTextFieldId.setBackground(new java.awt.Color(42, 71, 94));
        jTextFieldId.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldId.setText("ID");
        jTextFieldId.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 50, 5, 5));
        jTextFieldId.setNextFocusableComponent(jTextFieldPassword);
        jTextFieldId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIdFocusLost(evt);
            }
        });
        jTextFieldId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldIdMouseClicked(evt);
            }
        });
        jPanelFondo.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 330, 50));

        jButtonLogin.setBackground(new java.awt.Color(172, 213, 80));
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 170, 50));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 192, 244));
        jLabel4.setText("ID (company email)");
        jPanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 330, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 192, 244));
        jLabel5.setText("PASSWORD");
        jPanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 330, -1));

        jCheckBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Remember me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanelFondo.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 90, -1));

        jPanel1.setBackground(new java.awt.Color(23, 26, 33));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 370, 300));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Login");
        jPanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 157, 160, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_login_bg_strong_mask.jpg"))); // NOI18N
        jPanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelXMouseClicked

    private void jTextFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPasswordMouseClicked
        if (jTextFieldPassword.getText().equalsIgnoreCase("PASSWORD")) {
            jTextFieldPassword.setText("");
        }


    }//GEN-LAST:event_jTextFieldPasswordMouseClicked

    private void jTextFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPasswordFocusLost
        if (jTextFieldPassword.getText().isBlank()) {
            jTextFieldPassword.setText("PASSWORD");
        }
    }//GEN-LAST:event_jTextFieldPasswordFocusLost

    private void jTextFieldIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdFocusLost
        if (jTextFieldId.getText().isBlank()) {
            jTextFieldId.setText("ID");
        }
    }//GEN-LAST:event_jTextFieldIdFocusLost

    private void jTextFieldIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldIdMouseClicked
        if (jTextFieldId.getText().equalsIgnoreCase("ID")) {
            jTextFieldId.setText("");
        }
    }//GEN-LAST:event_jTextFieldIdMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        if (estaEnLista(jTextFieldId.getText().toString(), jTextFieldPassword.getText().toString())){
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables
}
