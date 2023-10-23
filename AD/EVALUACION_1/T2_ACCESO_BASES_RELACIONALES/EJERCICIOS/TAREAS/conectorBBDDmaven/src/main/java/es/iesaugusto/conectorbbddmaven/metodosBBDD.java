
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
    
    public static void listarProductos(Connection con){
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
               System.out.println(rs.getString(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3)+ " "+ rs.getString(4)); 
            }
            

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER Login Usuario");

        }
    }
    
    public static void listarProveedores(Connection con){
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
               System.out.println(rs.getString(1)+ " "+ rs.getString(2)); 
            }
            

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER Login Usuario");

        }
    }
    
    /* 1. Lista el nombre de todos los productos que hay en la tabla producto. */
    
    public static void ejercicio1(Connection con){
        
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
            //System.err.println("ERROR AL LEER Login Usuario");

        }
        
    }
    /* 2. Lista los nombres y los precios de todos los productos de la tabla producto */
    
    public static void ejercicio2(Connection con){
        
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
            //System.err.println("ERROR AL LEER Login Usuario");

        }
        
    }
    
    /* 3. Lista todas las columnas de la tabla producto. */
    
    
    public static void ejercicio3(Connection con){
        
        PreparedStatement ps = null;
        ResultSet rs = null;

        String muestraEjercicio3 = "select * from producto";

        try {
            ps = con.prepareStatement(muestraEjercicio3);
            rs = ps.executeQuery();
            
            while (rs.next()) {
               System.out.println("Id: " + rs.getInt(1)+ ", nombre"+ rs.getString(2)+ ", precio: "+ rs.getDouble(3)+ ", fabricante: "+ rs.getInt(4)); 
            }
            

        } catch (SQLException e) {
            //System.err.println("ERROR AL LEER Login Usuario");

        }
        
    }
    
    /* 4.Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD) */
    
}
