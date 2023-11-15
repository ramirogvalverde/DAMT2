package es.iesaugusto.gutierrez_ramiro_ud02;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Gutierrez_Ramiro_ud02 {

    private static ConexionBBDD conBD = new ConexionBBDD();
    private static Connection con = conBD.conectar();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("Elige una opcion del 1 al 7");
            System.out.println("\n1. Consulta clientes");
            System.out.println("2. Consulta comerciales");
            System.out.println("3. Consulta pedidos ordenados por fecha");
            System.out.println("4. Consulta clientes, sus pedidos y comercial asociado");
            System.out.println("5. Insertar pedido");
            System.out.println("6. Confirma cambios");
            System.out.println("7. Salir");

            Scanner lectura = new Scanner(System.in);
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:;
                    MetodosConexion.listarClientes(con);
                    break;
                case 2:;
                    MetodosConexion.listarComerciales(con);
                    break;
                case 3:;
                    MetodosConexion.listarPedidos(con);
                    break;
                case 4:;
                    MetodosConexion.listarClientePedidoComercial(con);
                    break;
                case 5:;
                    MetodosConexion.insertaPedido(con);
                    break;
                case 6:;
                    MetodosConexion.confirmaCambios(con);
                    break;
                case 7:;

                    break;
                default:
                    System.err.println("error");
                    ;
            }

        } while (opcion != 7);

    }
}
