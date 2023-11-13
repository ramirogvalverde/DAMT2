package es.iesaugusto.pe_a2_ramiro.vista;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Ramiro
 */
public class Login extends javax.swing.JFrame {

    
    /**
     * Creates new form Ejercicio2
     */
    public Login() {
        initComponents();
    }
    
    
    // getters y setters de todos los campos editables y botones
    
    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonLogin() {
        return jButtonLogin;
    }

    public void setjButtonLogin(JButton jButtonLogin) {
        this.jButtonLogin = jButtonLogin;
    }

    public JTextField getjTextFieldContrasenia() {
        return jTextFieldContrasenia;
    }

    public void setjTextFieldContrasenia(JTextField jTextFieldContrasenia) {
        this.jTextFieldContrasenia = jTextFieldContrasenia;
    }

    public JTextField getjTextFieldMensaje() {
        return jTextFieldMensaje;
    }

    public void setjTextFieldMensaje(JTextField jTextFieldMensaje) {
        this.jTextFieldMensaje = jTextFieldMensaje;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldContrasenia = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jTextFieldMensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login_Ramiro_Gutierrez_Valverde");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("CONTRASEÑA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 120, 40));

        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, 40));
        getContentPane().add(jTextFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 40));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 250, 40));

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setName("cancelar"); // NOI18N
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 50));

        jButtonLogin.setText("LOGIN");
        jButtonLogin.setName("login"); // NOI18N
        jButtonLogin.setNextFocusableComponent(jTextFieldMensaje);
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 50));

        jTextFieldMensaje.setFocusable(false);
        getContentPane().add(jTextFieldMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 390, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldContrasenia;
    private javax.swing.JTextField jTextFieldMensaje;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
