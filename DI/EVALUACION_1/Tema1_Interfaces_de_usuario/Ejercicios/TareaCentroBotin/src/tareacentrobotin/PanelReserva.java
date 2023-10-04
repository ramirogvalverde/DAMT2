/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tareacentrobotin;

/**
 *
 * @author damt210
 */
public class PanelReserva extends javax.swing.JDialog {

    /**
     * Creates new form PanelReserva
     */
    public PanelReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jPanelOpcionesSeminario.setVisible(false);
    }

    public boolean compruebaDatosPersonales() {
        boolean fallaDatosPersonales = false;
        if(jTextFieldNombre.getText().isBlank()||!jTextFieldTelefono.getText().matches(".*\\d.*")){
           return true; 
        }
        return false;
    }

    public boolean compruebaDatosReserva() {
        boolean fallaDatosReserva = false;

        return false;
    }

    public boolean compruebaDatosSeminario() {
        boolean fallaDatosSeminario = false;

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

        buttonGroupReserva = new javax.swing.ButtonGroup();
        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        jPanelfondo = new javax.swing.JPanel();
        jPanelDatosPersonales = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanelDatosReserva = new javax.swing.JPanel();
        jLabelTipoEvento = new javax.swing.JLabel();
        jRadioButtonBanquete = new javax.swing.JRadioButton();
        jRadioButtonJornada = new javax.swing.JRadioButton();
        jRadioButtonSeminario = new javax.swing.JRadioButton();
        jLabelFecha = new javax.swing.JLabel();
        jLabelMaterial = new javax.swing.JLabel();
        jComboBoxMaterial = new javax.swing.JComboBox<>();
        jLabelPersonas = new javax.swing.JLabel();
        jSpinnerPersonas = new javax.swing.JSpinner();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanelOpcionesSeminario = new javax.swing.JPanel();
        jLabelJornadas = new javax.swing.JLabel();
        jSpinnerJornadas = new javax.swing.JSpinner();
        jLabelHabitaciones = new javax.swing.JLabel();
        jRadioButtonHabitacionesSi = new javax.swing.JRadioButton();
        jRadioButtonHabitacionesNo = new javax.swing.JRadioButton();
        jButtonReservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelfondo.setPreferredSize(new java.awt.Dimension(600, 650));
        jPanelfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabelNombre.setText("Nombre");

        jLabelTelefono.setText("Teléfono");

        javax.swing.GroupLayout jPanelDatosPersonalesLayout = new javax.swing.GroupLayout(jPanelDatosPersonales);
        jPanelDatosPersonales.setLayout(jPanelDatosPersonalesLayout);
        jPanelDatosPersonalesLayout.setHorizontalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelDatosPersonalesLayout.setVerticalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelfondo.add(jPanelDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 160));

        jPanelDatosReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos de Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabelTipoEvento.setText("Tipo de Evento");

        buttonGroupReserva.add(jRadioButtonBanquete);
        jRadioButtonBanquete.setText("Banquete");
        jRadioButtonBanquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBanqueteActionPerformed(evt);
            }
        });

        buttonGroupReserva.add(jRadioButtonJornada);
        jRadioButtonJornada.setText("Jornada");
        jRadioButtonJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJornadaActionPerformed(evt);
            }
        });

        buttonGroupReserva.add(jRadioButtonSeminario);
        jRadioButtonSeminario.setText("Seminario");
        jRadioButtonSeminario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSeminarioActionPerformed(evt);
            }
        });

        jLabelFecha.setText("Fecha del Evento");

        jLabelMaterial.setText("Préstamo Material");

        jComboBoxMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Proyector", "Video pantalla táctil", "Tablets", "Portátiles" }));

        jLabelPersonas.setText("Nº de Personas");

        jSpinnerPersonas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanelDatosReservaLayout = new javax.swing.GroupLayout(jPanelDatosReserva);
        jPanelDatosReserva.setLayout(jPanelDatosReservaLayout);
        jPanelDatosReservaLayout.setHorizontalGroup(
            jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosReservaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosReservaLayout.createSequentialGroup()
                        .addComponent(jRadioButtonBanquete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonJornada)
                        .addGap(58, 58, 58)
                        .addComponent(jRadioButtonSeminario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosReservaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelPersonas)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanelDatosReservaLayout.setVerticalGroup(
            jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosReservaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonBanquete)
                    .addComponent(jRadioButtonJornada)
                    .addComponent(jRadioButtonSeminario))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jComboBoxMaterial)
                    .addComponent(jLabelMaterial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelfondo.add(jPanelDatosReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 560, 190));

        jPanelOpcionesSeminario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelJornadas.setText("Nº de jornadas");

        jSpinnerJornadas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabelHabitaciones.setText("Requiere Habitaciones");

        jRadioButtonHabitacionesSi.setText("Si");

        jRadioButtonHabitacionesNo.setText("No");

        javax.swing.GroupLayout jPanelOpcionesSeminarioLayout = new javax.swing.GroupLayout(jPanelOpcionesSeminario);
        jPanelOpcionesSeminario.setLayout(jPanelOpcionesSeminarioLayout);
        jPanelOpcionesSeminarioLayout.setHorizontalGroup(
            jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesSeminarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHabitaciones)
                    .addComponent(jLabelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerJornadas)
                    .addComponent(jRadioButtonHabitacionesNo)
                    .addComponent(jRadioButtonHabitacionesSi))
                .addGap(35, 35, 35))
        );
        jPanelOpcionesSeminarioLayout.setVerticalGroup(
            jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesSeminarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOpcionesSeminarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHabitacionesSi)
                    .addComponent(jLabelHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonHabitacionesNo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelfondo.add(jPanelOpcionesSeminario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 270, 170));

        jButtonReservar.setText("RESERVAR");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });
        jPanelfondo.add(jButtonReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 150, 50));

        getContentPane().add(jPanelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 598, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonBanqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBanqueteActionPerformed
        jPanelOpcionesSeminario.setVisible(false);
    }//GEN-LAST:event_jRadioButtonBanqueteActionPerformed

    private void jRadioButtonJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJornadaActionPerformed
        jPanelOpcionesSeminario.setVisible(false);
    }//GEN-LAST:event_jRadioButtonJornadaActionPerformed

    private void jRadioButtonSeminarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSeminarioActionPerformed
        jPanelOpcionesSeminario.setVisible(true);
    }//GEN-LAST:event_jRadioButtonSeminarioActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed



    }//GEN-LAST:event_jButtonReservarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelReserva dialog = new PanelReserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.ButtonGroup buttonGroupReserva;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JComboBox<String> jComboBoxMaterial;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHabitaciones;
    private javax.swing.JLabel jLabelJornadas;
    private javax.swing.JLabel jLabelMaterial;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPersonas;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoEvento;
    private javax.swing.JPanel jPanelDatosPersonales;
    private javax.swing.JPanel jPanelDatosReserva;
    private javax.swing.JPanel jPanelOpcionesSeminario;
    private javax.swing.JPanel jPanelfondo;
    private javax.swing.JRadioButton jRadioButtonBanquete;
    private javax.swing.JRadioButton jRadioButtonHabitacionesNo;
    private javax.swing.JRadioButton jRadioButtonHabitacionesSi;
    private javax.swing.JRadioButton jRadioButtonJornada;
    private javax.swing.JRadioButton jRadioButtonSeminario;
    private javax.swing.JSpinner jSpinnerJornadas;
    private javax.swing.JSpinner jSpinnerPersonas;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
