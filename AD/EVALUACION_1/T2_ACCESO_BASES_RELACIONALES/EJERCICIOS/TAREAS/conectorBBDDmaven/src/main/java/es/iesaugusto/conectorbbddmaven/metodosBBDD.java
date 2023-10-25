package es.iesaugusto.conectorbbddmaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ramiro
 */
public class metodosBBDD {

    public static void listarProductos(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String muestraProductos = "select * from producto";

        try {

            //se crear el Statement Con la conexion a la BBDD y el String
            ps = con.prepareStatement(muestraProductos);
            //se añade al select el nombre del usuario
            //ps.setString(1, "*");
            //se ejecuta la sentencia y devuelve un resultado
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    public static void listarProveedores(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se prepara la sentencia para la BBDD como un String
        String muestraProductos = "select * from fabricante";

        try {

            //se crear el Statement Con la conexion a la BBDD y el String
            ps = con.prepareStatement(muestraProductos);
            //se añade al select el nombre del usuario
            //ps.setString(1, "*");
            //se ejecuta la sentencia y devuelve un resultado
            rs = ps.executeQuery();

            //Es necesario usar el Next Para pasar a la primera Linea de la busqueda
            //una vez en la primera linea podemos obtener la informacion;
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }
    }

    /* 1. Lista el nombre de todos los productos que hay en la tabla producto. */
    public static void ejercicio1(Connection con) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio1 = "select nombre from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio1);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("mombre: " + rs.getString(1));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }

    }

    /* 2. Lista los nombres y los precios de todos los productos de la tabla producto */
    public static void ejercicio2(Connection con) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio2 = "select nombre, precio from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio2);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("mombre: " + rs.getString(1) + ", precio: " + rs.getDouble(2));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }

    }

    /* 3. Lista todas las columnas de la tabla producto. */
    public static void ejercicio3(Connection con) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio3 = "select * from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio3);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt(1) + ", nombre" + rs.getString(2) + ", precio: " + rs.getDouble(3) + ", fabricante: " + rs.getInt(4));
            }

        } catch (SQLException e) {
            System.err.println("SQLException");

        }

    }

    /* 4.Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD) */
    
    public static void ejercicio4(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se puede traer el dato de los precios solos, sin el EUR o USD y de esa forma convertirlo a dólares en el código, pero me gusta más así
        String muestraEjercicio4 = "SELECT nombre, CONCAT(precio, ' EUR') as precioEuros, CONCAT(precio * 0.9451, ' USD') as precioDolares from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio4);
            rs = ps.executeQuery();
            
            //pruebo a hacerlo de otra manera, más larga (tiene un paso más), pero más fácil de entender.
            while (rs.next()) {
                // al haber concatenado en la consulta, son todos getString
                String nombre = rs.getString(1);
                String precioEuros = rs.getString(2);
                String precioDolares = rs.getString(3);

                System.out.println("Nombre: " + nombre + ", Precio en Euros: " + precioEuros + ", precio en Dólares: " + precioDolares);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }
    /* 5. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD). Utiliza los siguientes alias para las
        columnas: nombre de producto, euros, dólares. */
    
    // es igual que el anterior pero con diferentes alias para las columnas
    public static void ejercicio5(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se puede traer el dato de los precios solos, sin el EUR o USD y de esa forma convertirlo a dólares en el código, pero me gusta más así
        String muestraEjercicio5 = "SELECT nombre as nombre_producto, CONCAT(precio, ' EUR') as euros, CONCAT(precio * 0.9451, ' USD') as dólares from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio5);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);
                String precioEuros = rs.getString(2);
                String precioDolares = rs.getString(3);

                System.out.println("Nombre Producto: " + nombre + ", Euros: " + precioEuros + ", Dólares: " + precioDolares);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }
    
    /* 6. Lista los nombres y los precios de todos los productos de la tabla producto,
        convirtiendo los nombres a mayúscula. */
    public static void ejercicio6(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        // se puede traer el dato de los precios solos, sin el EUR o USD y de esa forma convertirlo a dólares en el código, pero me gusta más así
        String muestraEjercicio6 = "SELECT UPPER(nombre) , precio  from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio6);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);
                Double precioEuros = rs.getDouble(2);
                
                System.out.println("Nombre Producto: " + nombre + ", Precio: " + precioEuros);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }
    
}
