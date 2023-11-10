package componenteusersteam;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Ramiro
 */
public class Login extends javax.swing.JFrame {

    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    /**
     * Creates new form Login
     */
    public Login() {

        Usuario Ramiro = new Usuario("ramiro@steam.com", "1234");
        Usuario ra = new Usuario("Ramiro", "1234");
        listaUsuarios.add(Ramiro);
        listaUsuarios.add(ra);
        
        

        initComponents();

        ImageIcon image2 = new ImageIcon("src/images/equis.png");
        Image imgEscalada2 = image2.getImage().getScaledInstance(jLabelBack.getWidth(), jLabelBack.getHeight(), WIDTH);
        ImageIcon imgFinal2 = new ImageIcon(imgEscalada2);
        jLabelBack.setIcon(imgFinal2);
        
        check2.setVisible(false);
        check3.setVisible(false);

        jLabel2.setText("<html>© 2023 Valve Corporation. Todos los derechos reservados.<br>Todas las marcas registradas pertenecen a sus respectivos dueños en EE. UU. y otros países</html>");
        jLabel6.setText("<html><u>Help, can´t log in</u></html>");

    }

    public Boolean estaEnLista(String email, String password) {

        for (Usuario i : listaUsuarios) {
            if (i.getEmail().equals(email)) {
                if (i.getPassword().equals(password)) {
                    return true;
                } else {
                    check2.setVisible(true);
                    return false;
                }
            }

        }
        check3.setVisible(true);
        jPasswordField1.setText("");
        return false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        check1 = new javax.swing.JLabel();
        jPanelFondo = new javax.swing.JPanel();
        jPanelUp = new javax.swing.JPanel();
        jLabelBack = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDown = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        check2 = new javax.swing.JLabel();
        check3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        check1.setForeground(new java.awt.Color(255, 153, 153));
        check1.setText("check");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(27, 40, 56));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUp.setBackground(new java.awt.Color(23, 26, 33));
        jPanelUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        jPanelUp.add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 40, 40));

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

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 100, -1));

        jPanel1.setBackground(new java.awt.Color(23, 26, 33));

        jPasswordField1.setBackground(new java.awt.Color(42, 71, 94));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jTextFieldId.setBackground(new java.awt.Color(42, 71, 94));
        jTextFieldId.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldId.setText("ID");
        jTextFieldId.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 50, 5, 5));
        jTextFieldId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIdFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 192, 244));
        jLabel4.setText("ID (company email)");

        check2.setForeground(new java.awt.Color(255, 153, 153));
        check2.setText("check");

        check3.setForeground(new java.awt.Color(255, 153, 153));
        check3.setText("check");

        jCheckBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Remember me");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 192, 244));
        jLabel5.setText("PASSWORD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldId)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(check3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(check2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox1)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 370, 300));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Login");
        jPanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 157, 160, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jPanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jPanelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

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

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jTextFieldIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdFocusLost
        if (jTextFieldId.getText().isBlank()) {
            jTextFieldId.setText("ID");
        }
    }//GEN-LAST:event_jTextFieldIdFocusLost

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        if (estaEnLista(jTextFieldId.getText().toString(),String.valueOf(jPasswordField1.getPassword()))) {

           Options op = new Options(jTextFieldId.getText());
           //Options op = new Options();
           op.setVisible(true);
           this.setVisible(false);

           
        } else {

        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Password")||check2.isVisible()) {
            check2.setVisible(false);
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextFieldIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdFocusGained
        if (jTextFieldId.getText().equalsIgnoreCase("ID")|| check3.isVisible()) {
            check3.setVisible(false);
            jTextFieldId.setText("");
        }
    }//GEN-LAST:event_jTextFieldIdFocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if(String.valueOf(jPasswordField1.getPassword()).isBlank()){
            jPasswordField1.setText("Password");
        }
    
    }//GEN-LAST:event_jPasswordField1FocusLost

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel check1;
    private javax.swing.JLabel check2;
    private javax.swing.JLabel check3;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
