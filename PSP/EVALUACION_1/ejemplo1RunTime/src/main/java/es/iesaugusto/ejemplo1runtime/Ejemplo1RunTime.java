/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.ejemplo1runtime;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt210
 */
public class Ejemplo1RunTime {

    public static void main(String[] args) {
        try {
            Runtime rt =Runtime.getRuntime();
            String [] comando= {"notepad.exe"};
            
            rt.exec(comando);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo1RunTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
