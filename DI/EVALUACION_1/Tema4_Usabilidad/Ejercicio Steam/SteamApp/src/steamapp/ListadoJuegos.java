package steamapp;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ramiro
 */
public class ListadoJuegos {

   public static ArrayList<Game> lista = new ArrayList<>();

    public static void anadirJuego(String name, String theme, Date date, String price, String market, int pegi, String description, String platform) {

        Game juego = new Game();
        juego.setName(name);
        juego.setTheme(theme);
        juego.setDate(date);
        juego.setPrice(price);
        juego.setMarket(market);
        juego.setPegi(pegi);
        juego.setDescription(description);
        juego.setPlatform(platform);
        
        lista.add(juego);
        
        System.out.println( juego.toString());
    }
    
    

}
