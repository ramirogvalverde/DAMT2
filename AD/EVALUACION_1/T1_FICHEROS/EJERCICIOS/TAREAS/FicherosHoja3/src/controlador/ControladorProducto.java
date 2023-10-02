package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

        try {
            String nombre = (vista.jTextFieldNombre.getText());
            double precio = Double.parseDouble(vista.jTextFieldPrecio.getText());

            modelo.setNombre(nombre);
            modelo.setPrecio(precio);

            Metodos.insertarProducto("productos.dat", nombre, precio);

        } catch (NumberFormatException ex) {
            System.err.println("error en el formato del número");
        }

        cancelar();

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
