/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.servidorbasico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class ServidorBasico {

    public static void main(String[] args) {
        ServerSocket servidor;//escucha del servidor
        Socket cliente; // atencion a cliente
        int numCliente=0;// contador clientes
        final int PUERTO=6666;//puerto de escucha (a partir del 1024)
        System.out.println("Soy el servidor, y empiezo a escuchar peticiones por el puerto "+ PUERTO);
        
        try {
            //apertura de socket para escuchar a través de un puerto
            servidor = new ServerSocket(PUERTO);
            do {
                numCliente ++;
                //aceptamos la conexión de un cliente
                cliente=servidor.accept();
                System.out.println("\t llega el cliente " + numCliente);
                //se declaran los gru`pos de comunicacion con el cliente
                //flujo de entrada o lectura
                DataInputStream bufferDatosEntrada = new DataInputStream(cliente.getInputStream());
                //flujo de salida o escritura
                DataOutputStream bufferDatosSalida = new DataOutputStream(cliente.getOutputStream());
                //A partir de aquí se establece el protocolo de comunicacion
                System.out.println("Envio el mensaje para el cliente");
                bufferDatosSalida.writeUTF("usted es mi cliente: "+numCliente);
                
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                cliente.close();
                System.out.println("comunicacion con el cliente cerrada");
                
                
                
            } while (true);
        } catch (IOException ex) {
            Logger.getLogger(ServidorBasico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
