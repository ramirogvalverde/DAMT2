package es.iesaugusto.gutierrezvalverderamiro_ex_ra1_ce_e_20231610;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Ramiro
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(BannerWorld.mensajePresentacion());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.err.println("error pausa 1 segundo");
        }
        System.out.println(BannerWorld.mensajeGenerator);

        String[] comando = {"CMD", "/c", "java", "-jar", "Generator.jar", args[0]};

        try {
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process p = pb.start();
            File archivo = new File(args[0]);
            if (archivo.exists()) {
                archivo.delete();
            }

            try {
                InputStream is = p.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                
                String linea = br.readLine();
                
                
                while (linea != null) {
                    System.out.println(linea);
                    
                    linea = br.readLine();
                }
                

            } catch (IOException e) {
                System.err.println("IO Exception");

            }

        } catch (IOException ex) {
            System.err.println("IO Exception2");
        }
        
        System.out.println(BannerWorld.mensajeCopy);

        String[] comando2 = {"CMD", "/c", "copy", args[0], args[1]};
        
       ProcessBuilder pb2 = new ProcessBuilder(comando2);
        try { 
            Process p2 = pb2.start();
            p2.waitFor();
            System.out.println("procediendo a abrir el fichero copiado...");
            Thread.sleep(2000);
            
            
        } catch (IOException ex) {
            System.err.println("Error en la copia");
        } catch (InterruptedException ex) {
            System.err.println("error en el wait");
        }
        
        String[] comando3 = {"notepad.exe", args[1]};
        
         ProcessBuilder pb3 = new ProcessBuilder(comando3);
        try { 
            Process p3 = pb3.start();
            
            
        } catch (IOException ex) {
            System.err.println("Error en la copia");
        }
        
        
        
    }

}
