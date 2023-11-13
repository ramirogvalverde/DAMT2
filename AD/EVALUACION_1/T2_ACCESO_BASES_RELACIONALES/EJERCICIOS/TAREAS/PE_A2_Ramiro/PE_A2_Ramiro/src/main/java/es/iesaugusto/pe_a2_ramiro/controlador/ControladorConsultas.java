package es.iesaugusto.pe_a2_ramiro.controlador;

import es.iesaugusto.pe_a2_ramiro.vista.ConsultaDatos;
import es.iesaugusto.pe_a2_ramiro.modelo.ConsultasBBDD;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Ramiro
 */
public class ControladorConsultas implements MouseListener {

    private ConsultaDatos vista = new ConsultaDatos();

    public void run() {
        vista.setVisible(true);

        vista.jButtonJuegos.addMouseListener(this);
        vista.jButtonJugadores.addMouseListener(this);
        vista.jButtonAmbos.addMouseListener(this);
        vista.jButtonSalir.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().getName().equalsIgnoreCase("juegos")) {
            //System.out.println("hola, estoy en la tabla");
            JTableHeader tableHeader = vista.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_juego");
            tableColumnModel.getColumn(1).setHeaderValue("nombre");
            tableColumnModel.getColumn(2).setHeaderValue("tipo");
            tableHeader.repaint();
            DefaultTableModel modelo = (DefaultTableModel) vista.jTable1.getModel();
            modelo.setRowCount(0);
            
            ArrayList<String[]> al = ConsultasBBDD.juego();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        } else if (e.getComponent().getName().equalsIgnoreCase("jugadores")) {

            JTableHeader tableHeader = vista.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_jugador");
            tableColumnModel.getColumn(1).setHeaderValue("alias");
            tableColumnModel.getColumn(2).setHeaderValue("nombre");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) vista.jTable1.getModel();
            modelo.setRowCount(0);

            ArrayList<String[]> al = ConsultasBBDD.jugador();
            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        }else if (e.getComponent().getName().equalsIgnoreCase("ambos")) {
            JTableHeader tableHeader = vista.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("Nombre Jugador");
            tableColumnModel.getColumn(1).setHeaderValue("Nombre Juego");
            tableColumnModel.getColumn(2).setHeaderValue("Ultima Sesion");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) vista.jTable1.getModel();
            modelo.setRowCount(0);
            
             ArrayList<String[]> al = ConsultasBBDD.jugadorSesionJuego();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        } else if (e.getComponent().getName().equalsIgnoreCase("salir")) {

            System.exit(0);
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
