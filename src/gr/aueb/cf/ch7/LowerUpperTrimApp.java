package gr.aueb.cf.ch7;


import java.util.Locale;

/**
 * Transforms Strings.
 */
public class LowerUpperTrimApp {
    public static void main(String[] args) {
        String s = "Athens University";
        String lowerCase;
        String upperCase;
        String  trimmed;
        String s2 = "";

        lowerCase = s.toLowerCase();
        upperCase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println("*".repeat(10));

        if ( s2.isEmpty()) {
            System.out.println(s2.length());
        }

        if (s2.isBlank()){
            System.out.println("IS blank");
        }








    }
}
