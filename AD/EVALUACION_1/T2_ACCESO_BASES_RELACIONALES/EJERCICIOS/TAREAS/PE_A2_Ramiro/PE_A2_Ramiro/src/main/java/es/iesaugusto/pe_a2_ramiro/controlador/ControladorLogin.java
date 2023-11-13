package es.iesaugusto.pe_a2_ramiro.controlador;

import es.iesaugusto.pe_a2_ramiro.modelo.ConexionBBDD;
import es.iesaugusto.pe_a2_ramiro.vista.ConsultaDatos;
import es.iesaugusto.pe_a2_ramiro.vista.Login;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ramiro
 */
public class ControladorLogin implements MouseListener {

    private ConexionBBDD con;
    private Login lg;

    public void run() {
        lg = new Login();

        lg.setVisible(true);

        lg.getjButtonLogin().addMouseListener(this);
        lg.getjButtonCancelar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().getName().equalsIgnoreCase("cancelar")) {
            lg.getjTextFieldContrasenia().setText("");
            lg.getjTextFieldUsuario().setText("");
            lg.getjTextFieldMensaje().setText("");
        }

        if (e.getComponent().getName().equalsIgnoreCase("login")) {
            if(lg.getjTextFieldUsuario().getText().isBlank()){
                lg.getjTextFieldMensaje().setText("El campo usuario no puede estar vacío");
            }else if(lg.getjTextFieldContrasenia().getText().isBlank()){
                lg.getjTextFieldMensaje().setText("El campo contraseña no puede estar vacío");
            }else{
                ConexionBBDD.setUSER(lg.getjTextFieldUsuario().getText());
                ConexionBBDD.setPASS(lg.getjTextFieldContrasenia().getText());
                //System.out.println(ConexionBBDD.getUSER().toString());
                
                try {
                    Connection con = ConexionBBDD.getInstance().getConnection();
                    
                    System.out.println("Conectado");
                            
                    ControladorConsultas cc =new ControladorConsultas();
                    
                    cc.run();
                    //ConsultaDatos cd = new ConsultaDatos();
                    //cd.setVisible(true);
                    
                    lg.dispose();
                    
                } catch (SQLException ex) {
                   System.out.println("ERROR en la conexión");
                   lg.getjTextFieldMensaje().setText("Usuario o contraseña incorrecto");
                }
                
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
