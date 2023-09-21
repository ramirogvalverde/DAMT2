
package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ramiro
 */
public class Stream {

    
    public static void main(String[] args) {
        boolean aprobado =true;
        String nombre= "PRG";
        int conv = 1;
        double nota =7.8;
        
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejemplo.dat"));
            dos.writeBoolean(aprobado);
            dos.writeUTF(nombre);
            dos.writeInt(conv);
            dos.writeDouble(nota);
            dos.close();
            
            DataInputStream dis= new DataInputStream(new FileInputStream("ejemplo.dat"));
            System.out.println("valor leido de aprobado: " + dis.readBoolean());
            System.out.println("valor leido de nombre: " + dis.readUTF());
            System.out.println("valor leido de convocatoria: " + dis.readInt());
            System.out.println("valor leido de nota: " + dis.readDouble());
            dis.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ioe){
            
        }
    }
    
}
