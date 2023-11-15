package es.iesaugusto.gutierrez_ramiro_ud02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ramiro
 */
public class MetodosConexion {

    public static void listarClientes(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraClientes = "select * from cliente";

        try {

            ps = con.prepareStatement(muestraClientes);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    public static void listarComerciales(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraComerciales = "select * from comercial";

        try {

            ps = con.prepareStatement(muestraComerciales);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getDouble(5));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    public static void listarPedidos(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraPedidos = "select * from pedido order by fecha desc";

        try {

            ps = con.prepareStatement(muestraPedidos);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getDouble(2) + " " + rs.getDate(3) + " " + rs.getInt(4) + " " + rs.getInt(5));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    public static void listarClientePedidoComercial(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraClientePedido = "select cliente.nombre, pedido.id, comercial.nombre from cliente inner join pedido on cliente.id= pedido.id_cliente inner join comercial on pedido.id_comercial = comercial.id";

        try {

            ps = con.prepareStatement(muestraClientePedido);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    public static void insertaPedido(Connection con) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        // comienzo impidiendo que la ejecucion se autoguarde
        try {
            con.setAutoCommit(false);

        } catch (SQLException e) {
            System.err.println("SQLException");
        }

        // insercion de un solo producto 
        String insercion = "INSERT INTO pedido VALUES(17, 150, '2023-11-15', 4, 1)";

        try {
            ps = con.prepareStatement(insercion);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("SQLException");
        }

        // muestro los datos
        String muestraPedidos = "select * from pedido order by fecha desc";

        try {

            ps = con.prepareStatement(muestraPedidos);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getDouble(2) + " " + rs.getDate(3) + " " + rs.getInt(4) + " " + rs.getInt(5));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }

        // hago rollback para que los datos se borren. Inconveniente: el ID autoincremental sigue aumentando
        try {
            con.rollback();

        } catch (SQLException e) {
            System.err.println("SQLException");
        }

    }

    public static void confirmaCambios(Connection con) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        // activo el autocomit
        try {
            con.setAutoCommit(true);

        } catch (SQLException e) {
            System.err.println("SQLException");
        }

        String insercion16 = "INSERT INTO pedido VALUES(17, 150, '2023-11-15', 4, 1)";

        try {
            ps = con.prepareStatement(insercion16);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("SQLException");
        }

    }

}
