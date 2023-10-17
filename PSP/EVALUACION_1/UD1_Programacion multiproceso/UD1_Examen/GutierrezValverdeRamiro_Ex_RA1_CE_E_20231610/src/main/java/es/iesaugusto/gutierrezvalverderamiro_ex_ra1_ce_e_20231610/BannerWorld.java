
package es.iesaugusto.gutierrezvalverderamiro_ex_ra1_ce_e_20231610;

/**
 *
 * @author Ramiro
 */
public class BannerWorld {
    
    public static String mensaje= "Nombre: Ramiro\nNombre aplicación: Examen RA1\nFecha actual: 16/10/2023\n";
    
    public static String mensajeGenerator= "Generando fichero con Generator\n";
    
    public static String mensajeCopy= "Ejecutando la copia con el comando copy...\n";
   
    public static String mensajePresentacion(){
        return mensaje;
    }
    public static String mensajeGenerator(){
        return mensajeGenerator;
    }
    public static String mensajeCopy(){
        return mensajeCopy;
    }
}
