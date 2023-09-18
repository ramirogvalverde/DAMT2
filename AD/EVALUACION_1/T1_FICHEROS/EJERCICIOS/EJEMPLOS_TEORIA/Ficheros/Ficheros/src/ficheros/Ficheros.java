package ficheros;


public class Ficheros {

    
    public static void main(String[] args) {

        System.out.println("El sistema operativo es: " + System.getProperty("os.name") + ", versión: " + System.getProperty("os.version"));
        System.out.println("El directorio del usuario es: " + System.getProperty("user.home"));
        System.out.println("El nombre del usuario: " + System.getProperty("user.name"));
        System.out.println("El directorio de trabajo es: " + System.getProperty("user.dir"));
        System.out.println("La versión de java es la: " + System.getProperty("java.version"));
    }

}


