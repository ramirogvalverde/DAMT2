package es.iesaugusto.ramirogutierrezvalverde.ex.ra2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro
 */
public class DispositivoDrones {

    int impactosFragata = 0;
    int numDrones = 0; 
    int tubosLibres = 3;
    boolean finBatalla = false;

    public synchronized void setDron(String nombre) {
        while (numDrones == 2) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(DispositivoDrones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Beep Beep, crrrk, beep, ingeniero " + nombre + " he tomado el control");
        System.out.println("\tSoy el ingeniero " + nombre + " y estoy configurando un nuevo dron asesino");
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(DispositivoDrones.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\tSoy el ingeniero " + nombre + "! y he configurando un nuevo dron!");       
        numDrones++; //aumenta el número de drones
        //terminoBatalla(); no es necesarkio, solo en el otro 
        tubosLibres--;
        System.out.println("Tubos libres " + tubosLibres);
        notifyAll();
    }

    public synchronized void getDron(String nombre) {
        while (numDrones == 0) {// si el número de drones es 0 no pueden disparar, por lo tanto esperan a que el productor lance el notifyAll
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(DispositivoDrones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Beep Beep, crrrk, beep, oficial " + nombre + " he tomado el control");
        System.out.println("\tSoy el oficial " + nombre + "! voy a coger un nuevo dron asesino!");
        try {
            sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(DispositivoDrones.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\tSoy el oficial " + nombre + "! he disparado el dron asesino!");
        numDrones--; // lanzan un dron, por lo tanto hay que restarlo
        tubosLibres++;// queda libre uno de los tubos para poder producir otro dron más
        impactosFragata++; // aumenta el número de impactos
        terminoBatalla(); //compruebo si es el fin de la batalla para que los hilos dejen de ejecutarse en caso de que sea true
        System.out.println("Tubos libres " + tubosLibres);
        notifyAll();
        

    }
    public synchronized void terminoBatalla(){ // Cuando llega a 6 impactos (pongo 5 porque empieza en 0) cambia el booleano a true y termina
        if (impactosFragata == 5 ) {
            finBatalla = true;
        }
    }

}
