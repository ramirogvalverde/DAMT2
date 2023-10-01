package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public ControladorProducto(Ventana vista, Producto modelo) {
        this.vista = vista;
        this.modelo = modelo;
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

    public void guardar() {
        LinkedList<Producto> lista = new LinkedList();
        Producto producto1 = new Producto(vista.jTextFieldNombre.getText(), Double.parseDouble(vista.jTextFieldPrecio.getText()));
        //lista.add(producto1);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("productos.dat");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(producto1);

        } catch (FileNotFoundException ex) {
            System.err.println("error en fichero");
        } catch (IOException ex) {
            System.err.println("io exception");
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                System.err.println("problema al cerrar el archivo");
            }
        }

    }

    public void cancelar() {
        vista.jTextFieldNombre.setText("");
        vista.jTextFieldPrecio.setText("");
        vista.jTextFieldNombre.requestFocus();
    }

    public void listar() {
        LinkedList<Producto> lista2 = new LinkedList();
        Producto producto2 = null;
        //lista.add(producto1);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("productos.dat");
            ois = new ObjectInputStream(fis);

            while (true) {
                producto2 = (Producto) ois.readObject();
                lista2.add(producto2);

                for (Producto p : lista2) {

                    System.out.println("Nombre :" + p.getNombre() + ". Precio: " + p.getPrecio());
                }
            }

        } catch (FileNotFoundException ex) {
            System.err.println("error en fichero");
        } catch (IOException ex) {
            System.err.println("io exception");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                System.err.println("problema al cerrar el archivo");
            }
        }

    }

}
