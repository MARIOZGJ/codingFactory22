package gr.aueb.cf.ch7;

import java.security.SecureRandom;

/**
 * Concatenates two or more Strings.
 */
public class ConcatApp {
    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullName;
        String titledFullName;

        fullName = firstname + lastname;
        titledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
