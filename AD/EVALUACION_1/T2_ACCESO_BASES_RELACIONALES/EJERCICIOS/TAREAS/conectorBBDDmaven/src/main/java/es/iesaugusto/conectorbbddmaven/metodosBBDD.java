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

    /* 7. Lista los nombres y los precios de todos los productos de la tabla producto,
        convirtiendo los nombres a minúscula. */
    public static void ejercicio7(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio7 = "SELECT LOWER(nombre) , precio  from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio7);
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

    /* 8. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos primeros caracteres del nombre
        del fabricante. */
    public static void ejercicio8(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio8 = "select nombre, upper(substring(nombre,1,2)) from fabricante";

        try {
            ps = con.prepareStatement(muestraEjercicio8);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);
                String iniciales = rs.getString(2);

                System.out.println("Nombre fabricante: " + nombre + ", iniciales: " + iniciales);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 9. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio */
    public static void ejercicio9(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio9 = "select nombre, round(precio, 0) from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio9);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);
                Double precioEuros = rs.getDouble(2);

                System.out.println("Nombre: " + nombre + ", Precio: " + precioEuros);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 10. Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del precio para mostrarlo sin ninguna
    cifra decimal. */

    public static void ejercicio10(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio10 = "select nombre, format(precio, 0) from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio10);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);
                String precioEuros = rs.getString(2);

                System.out.println("Nombre: " + nombre + ", Precio sin decimales: " + precioEuros);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 11. Lista el identificador de los fabricantes que tienen productos en la
        tabla producto. */

    public static void ejercicio11(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio11 = "SELECT fabricante.id from fabricante inner join producto where fabricante.id=id_fabricante";

        try {
            ps = con.prepareStatement(muestraEjercicio11);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String id = rs.getString(1);

                System.out.println("Identificador: " + id);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 12. Lista el identificador de los fabricantes que tienen productos en la
        tabla producto, eliminando los identificadores que aparecen repetidos */
    public static void ejercicio12(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio12 = "SELECT Distinct fabricante.id from fabricante inner join producto where fabricante.id=id_fabricante";

        try {
            ps = con.prepareStatement(muestraEjercicio12);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String id = rs.getString(1);

                System.out.println("Identificador: " + id);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 13. Lista los nombres de los fabricantes ordenados de forma ascendente. */
    public static void ejercicio13(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio13 = "select nombre from fabricante order by nombre asc";

        try {
            ps = con.prepareStatement(muestraEjercicio13);
            rs = ps.executeQuery();

            while (rs.next()) {
                // al haber concatenado en la consulta son todos getString
                String nombre = rs.getString(1);

                System.out.println("Nombre: " + nombre);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 14. Lista los nombres de los fabricantes ordenados de forma descendente. */
    public static void ejercicio14(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio14 = "select nombre from fabricante order by nombre desc";

        try {
            ps = con.prepareStatement(muestraEjercicio14);
            rs = ps.executeQuery();

            while (rs.next()) {

                String nombre = rs.getString(1);

                System.out.println("Nombre: " + nombre);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 15. Lista los nombres de los productos ordenados en primer lugar por el
        nombre de forma ascendente y en segundo lugar por el precio de forma descendente.. */
    public static void ejercicio15(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio15 = "select nombre from producto order by nombre asc, precio desc";

        try {
            ps = con.prepareStatement(muestraEjercicio15);
            rs = ps.executeQuery();

            while (rs.next()) {

                String nombre = rs.getString(1);

                System.out.println("Nombre: " + nombre);
            }
        } catch (SQLException e) {
            System.err.println("SQLException");
        }
    }

    /* 16. Inserta tres nuevos productos a tu elección. Muestra la nueva tabla por
        pantalla. */
    
    public static void ejercicio16(Connection con) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        // comienzo impidiendo que la ejecucion se autoguarde
        try {
            con.setAutoCommit(false);

        } catch (SQLException e) {
            System.err.println("SQLException");
        }
       
        // insercion de un solo producto tal como enseña en los apuntes
        String insercion16 = "insert into producto(nombre,precio,id_fabricante)"
                + "values (?,?,?)";
        
        try {
            ps = con.prepareStatement(insercion16);

            ps.setString(1, "Disco duro SATA3 5TB");
            ps.setDouble(2, 120.99);
            ps.setInt(3, 7);

            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("SQLException");
        }

        // muestro los datos
        String muestraEjercicio16 = "select * from producto;";

        try {
            ps = con.prepareStatement(muestraEjercicio16);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt(1) + ", nombre" + rs.getString(2) + ", precio: " + rs.getDouble(3) + ", fabricante: " + rs.getInt(4));
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

}
