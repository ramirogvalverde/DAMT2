/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 *
 * @author msola
 */
public class Operaciones {
    public static void save (String filename,int num1,int num2 ,int resultado){
        
        File sumas =null;
        FileWriter fw = null;
        try {
            sumas = new File(filename);
            fw= new FileWriter(sumas,true);
            fw.write(num1+" + "+num2 + " = "+ String.valueOf(resultado)+"\n");
            fw.close();
        } catch (Exception e) {
            System.err.println("Ocurrio un problema en la creación del archivo");
        }
        
        
        //Desarrollar el método para guardar en el fichero el resultado
    }
}
