/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.conectorbbddmaven;

import java.sql.Connection;

/**
 *
 * @author damt210
 */
public class ConectorBBDDmaven {

    private static ConexionBBDD conBD = new ConexionBBDD();
    private static Connection con = conBD.conectar();

    public static void main(String[] args) {
        
        //pruebas previas...
        //System.out.println("Listado de productos:\n");
        //metodosBBDD.listarProductos(con);
        //System.out.println("\nListado de proveedores\n");
        //metodosBBDD.listarProveedores(con);
        
        System.out.println("\nEjercicio1\n");
        metodosBBDD.ejercicio1(con);
        System.out.println("\nEjercicio2\n");
        metodosBBDD.ejercicio2(con);
        System.out.println("\nEjercicio3\n");
        metodosBBDD.ejercicio3(con);
        System.out.println("\nEjercicio4\n");
        metodosBBDD.ejercicio4(con);
        System.out.println("\nEjercicio5\n");
        metodosBBDD.ejercicio5(con);
        System.out.println("\nEjercicio6\n");
        metodosBBDD.ejercicio6(con);
        System.out.println("\nEjercicio7\n");
        metodosBBDD.ejercicio7(con);
        System.out.println("\nEjercicio8\n");
        metodosBBDD.ejercicio8(con);
        System.out.println("\nEjercicio9\n");
        metodosBBDD.ejercicio9(con);
        System.out.println("\nEjercicio10\n");
        metodosBBDD.ejercicio10(con);
        System.out.println("\nEjercicio11\n");
        metodosBBDD.ejercicio11(con);
        System.out.println("\nEjercicio12\n");
        metodosBBDD.ejercicio12(con);
        System.out.println("\nEjercicio13\n");
        metodosBBDD.ejercicio13(con);
        System.out.println("\nEjercicio14\n");
        metodosBBDD.ejercicio14(con);
        System.out.println("\nEjercicio15\n");
        metodosBBDD.ejercicio15(con);
        System.out.println("\nEjercicio16\n");
        metodosBBDD.ejercicio16(con);
         System.out.println("\nEjercicio17\n");
        metodosBBDD.ejercicio17(con);
        System.out.println("\nEjercicio18\n");
        metodosBBDD.ejercicio18(con);
        System.out.println("\nEjercicio19\n");
        metodosBBDD.ejercicio19(con);
        System.out.println("\nEjercicio20\n");
        metodosBBDD.ejercicio20(con);
    }
        
        
        
    
}
