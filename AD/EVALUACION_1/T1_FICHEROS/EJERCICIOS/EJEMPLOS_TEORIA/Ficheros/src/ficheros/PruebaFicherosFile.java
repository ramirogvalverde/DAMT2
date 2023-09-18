package ficheros;

import java.io.File;
import java.io.IOException;

public class PruebaFicherosFile {

    public static void main(String[] args) {

        //ejemplo fichero
        System.out.println("BUSCO UN ARCHIVO QUE NO EXISTE");
        File archivo1 = new File("archivo1.txt");
        if (archivo1.exists()) {
            System.out.println("el archivo existe");
        } else {
            System.out.println("el archivo no existe");
        }
        System.out.println("Nombre: " + archivo1.getName());
        System.out.println("Longitud: " + archivo1.length());
        System.out.println("Ruta Absoulta: " + archivo1.getAbsolutePath());

        //ejemplo carpeta
        System.out.println("BUSCO UNA CARPETA QUE NO EXISTE");
        File carpeta = new File("carpetita");
        if (carpeta.exists()) {
            System.out.println("La carpeta existe");
        } else {
            System.out.println("La carpeta no existe");
        }
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta Absoulta: " + carpeta.getAbsolutePath());

        //ejemplo crear archivo
        System.out.println("CREO UN ARCHIVO");
        File archivo2 = new File("archivo2.txt");
        try {
            if (archivo2.createNewFile()) {
                System.out.println("Archivo creado;");
            } else {
                System.out.println("El archivo ya existe");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //ejemplo crear directorio
        System.out.println("CREO UN DIRECTORIO");
        File directorio1 = new File("directorio1");
        if (directorio1.mkdir()) {
            System.out.println("Directorio creado;");
        } else {
            System.out.println("El directorio ya existe");
        }

        //ejemplo borrar archivo
        System.out.println("BORRO UN ARCHIVO");
        File archivoBorrar = new File("archivoParaEliminar.txt");
        if (directorio1.mkdir()) {
            System.out.println("Archivo eliminado;");
        } else {
            System.out.println("No se pudo eliminar el archivo");
        }

        //ejemplo listar contenido de un directorio
        System.out.println("LISTO CONTENIDO DE UN DIRECTORIO");
        File directorio2 = new File(".");
        String[] archivos = directorio2.list();
        if (archivos != null) {
            for (String a : archivos) {
                System.out.println(a);
            }
        } else {
            System.out.println("No hay archivos en la carpeta");
        }

        //ejemplo listar archivos de un directorio y tamaño
        System.out.println("LISTO ARCHIVOS Y TAMAÑO DE UN DIRECTORIO");

        String rutaCarpeta = ".";
        listarArchivos(rutaCarpeta);
        
        

    

}
    public static void listarArchivos(String rutaCarpeta){
        
        File carpeta = new File(rutaCarpeta);
        if (carpeta.isDirectory()) {
            File[] archivos=carpeta.listFiles();
            for (File f : archivos) {
                if (f.isFile()) {
                    System.out.println(f.getName() + " - " + f.length() + "bytes");
                }
                
            }
        } else {
            System.err.println("La ruta proporcionada es una carpeta");
        }
    }

}