/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.iesaugusto.clientebasico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class ClienteBasico {

    public static void main(String[] args) {
        String direccion;
        Socket servidor;
        final int PUERTO = 6666;

        System.out.println("soy el cliente e intento conectarme");

        direccion = "127.0.0.1";
        try {
            //nos conectamos al servidor:direccion y puerto
            servidor = new Socket(direccion, PUERTO);
            System.out.println("conexion realizada con exito");

            DataInputStream bufferDatosEntrada = new DataInputStream(servidor.getInputStream());
            DataOutputStream bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());
            
            String mensaje = bufferDatosEntrada.readUTF();
            System.out.println(mensaje);
            
            bufferDatosEntrada.close();
            bufferDatosSalida.close();
            servidor.close();
            
            System.out.println("soy el cliente y cierro la conexion");

        } catch (IOException ex) {
            Logger.getLogger(ClienteBasico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
