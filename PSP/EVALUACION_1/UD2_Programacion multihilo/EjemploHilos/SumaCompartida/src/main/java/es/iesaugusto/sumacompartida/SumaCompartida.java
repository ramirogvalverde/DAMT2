

package es.iesaugusto.sumacompartida;

/**
 *
 * @author Ramiro
 */
public class SumaCompartida {

    public static void main(String[] args) {
        Contador c= new Contador();
                
        HiloSuma hs1= new HiloSuma(1, c);
        HiloSuma hs2= new HiloSuma(2, c);
        HiloSuma hs3= new HiloSuma(3, c);
        HiloSuma hs4= new HiloSuma(4, c);
        
        hs1.start();
        hs2.start();
        hs3.start();
        hs4.start();
        
        try {
            hs1.join();
            hs2.join();
            hs3.join();
            hs4.join();
            
        } catch (InterruptedException ex) {
            System.err.println("Excepción");
        }
        
        System.out.println("resultado: " + c.getContador());
        
        
    }
}
