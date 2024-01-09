/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cafeconpalito.psp_troyano_cliente;

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
public class PSP_Troyano_Cliente {

    public static void main(String[] args) {
        System.out.println("Mensaje Inicio Cliente");
        
        Socket servidor = null;
        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
        
        //Inicializo las conexionas a nulo dentro del TRY para que se cierren solas al salir
        try {

            //Parametros para conectar al server
            final String SERVER_IP = "localhost"; // "127.0.0.1"
            final int PUERTO = 6666;

            //Constuimos el Socket con el server
            servidor = new Socket(SERVER_IP, PUERTO);

            //Inicilizo las conexiones con el server con los parametros de este
            bufferDatosEntrada = new DataInputStream(servidor.getInputStream());
            bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());
            
            //
            // TODO LO QUE QUIERAS HACER CON EL SERVIDOR
            //
            
                    
            
        } catch (IOException ex) {
            Logger.getLogger(PSP_Troyano_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            
            try {
                
                //Cerrando los flujos
                if (bufferDatosEntrada != null) {
                    bufferDatosEntrada.close();
                }
                if (bufferDatosSalida != null) {
                    bufferDatosSalida.close();
                }
                //Cerrando Server
                if (servidor != null) {
                    servidor.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(PSP_Troyano_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
}
