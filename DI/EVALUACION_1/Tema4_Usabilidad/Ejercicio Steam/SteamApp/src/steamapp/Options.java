/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package steamapp;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author damt210
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Options() {
        initComponents();
        
        ImageIcon image2 = new ImageIcon("src/images/leftArrow32.png");
        Image imgEscalada2 = image2.getImage().getScaledInstance(jLabelX.getWidth(), jLabelX.getHeight(), WIDTH);
        ImageIcon imgFinal2 = new ImageIcon(imgEscalada2);
        jLabelX.setIcon(imgFinal2);
        
        jLabel2.setText("<html>© 2023 Valve Corporation. Todos los derechos reservados.<br>Todas las marcas registradas pertenecen a sus respectivos dueños en EE. UU. y otros países</html>");
    
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
        jButtonLogin = new javax.swing.JButton();
        jButtonLogin1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 650));

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

        jButtonLogin.setBackground(new java.awt.Color(102, 192, 244));
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("LIST");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFondo.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 170, 50));

        jButtonLogin1.setBackground(new java.awt.Color(172, 213, 80));
        jButtonLogin1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin1.setText("ADD NEW");
        jButtonLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 170, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFocusable(false);
        jScrollPane1.setHorizontalScrollBar(null);

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Platform"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 350, 150));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last added");
        jPanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 160, 20));

        jPanel1.setBackground(new java.awt.Color(23, 26, 33));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 640, 230));

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
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelXMouseClicked

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
