package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;

/**
 *
 * @author Ramiro
 *
 */
public class ControladorProducto implements ActionListener {

    private final Producto modelo;
    private final Ventana vista;
    private final ListadoProductos listado;

    public ControladorProducto(Ventana vista, Producto modelo, ListadoProductos listado) {
        this.vista = vista;
        this.modelo = modelo;
        this.listado = listado;
        this.vista.jButtonGuardar.addActionListener(this);
        this.vista.JButtonCancelar.addActionListener(this);
        this.vista.jButtonListado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {
            guardar();
        } else if (e.getActionCommand().equalsIgnoreCase("cancelar")) {
            cancelar();
        } else {
            listar();
        }
    }

    public void iniciar() {
        vista.setTitle("Almacen de productos");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

    }

    public void iniciarListado() {
        listado.setTitle("Listado de productos");
        listado.setLocationRelativeTo(null);
        listado.setVisible(true);
        listado.setDefaultCloseOperation(1);
    }

    public void guardar() {
        String nombre = (vista.jTextFieldNombre.getText());
        String precio = (vista.jTextFieldPrecio.getText());

        if (nombre.isBlank()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede quedar vacío", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (nombre.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede incluir números", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (precio.contains(",")) {
            JOptionPane.showMessageDialog(null, "El precio debe tener un formato adecuado", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (String.valueOf(precio).isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes introducir un precio", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (String.valueOf(precio).matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(null, "El precio debe tener un formato adecuado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                
                modelo.setNombre(nombre);
                modelo.setPrecio(Double.parseDouble(precio));

                Metodos.insertarProducto("productos.dat", nombre, Double.parseDouble(precio));

            } catch (NumberFormatException ex) {
                System.err.println("error en el formato del número");
            }

            cancelar();
        }
    }

    public void cancelar() {
        vista.jTextFieldNombre.setText("");
        vista.jTextFieldPrecio.setText("");
        vista.jTextFieldNombre.requestFocus();
    }

    public void listar() {

        ArrayList<Producto> lista3 = new ArrayList();
        lista3 = Metodos.listarProductos("productos.dat");
        DefaultTableModel modelo = (DefaultTableModel) listado.jTableListaProductos.getModel();
        iniciarListado();

        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        for (Producto i : lista3) {
            String[] row = new String[2];
            row[0] = i.getNombre();
            row[1] = String.valueOf(i.getPrecio());
            modelo.addRow(row);
        }

    }

}
