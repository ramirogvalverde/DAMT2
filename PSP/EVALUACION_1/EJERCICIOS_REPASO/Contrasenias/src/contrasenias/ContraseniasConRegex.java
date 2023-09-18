package contrasenias;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContraseniasConRegex {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
            System.out.println("Introduce un password correcto");

            String cadena = lectura.next();

            if(isMatchingRegex(cadena)==true){
                System.out.println("password correcto");
            
            }else{
                System.out.println("password incorrecto");
            }

    }
    private static final Pattern[] inputRegexes = new Pattern[4];

    static {
        inputRegexes[0] = Pattern.compile(".*[A-Z].*");
        inputRegexes[1] = Pattern.compile(".*[a-z].*");
        inputRegexes[2] = Pattern.compile(".*[0-9].*");
        inputRegexes[3] = Pattern.compile(".*[-_/].*");
    }
    
    private static boolean isMatchingRegex(String input) {
    boolean inputMatches = true;
    for (Pattern inputRegex : inputRegexes) {
        if (!inputRegex.matcher(input).matches()) {
            inputMatches = false;
        }
    }
    return inputMatches;
}

}
