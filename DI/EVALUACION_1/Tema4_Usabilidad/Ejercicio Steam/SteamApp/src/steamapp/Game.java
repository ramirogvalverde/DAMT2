
package steamapp;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ramiro
 */

public class Game implements Serializable{
    
    String name, description,theme,market, platform, price;
    Date date;
    int pegi;

    public Game() {
    }

    public Game(String name, String description, String theme, String market, String platform, String price, Date date, int pegi) {
        this.name = name;
        this.description = description;
        this.theme = theme;
        this.market = market;
        this.platform = platform;
        this.price = price;
        this.date = date;
        this.pegi = pegi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", hasta aquí es suficiente";
    }
    
    
    
}
