package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση τη θερμοκρασία,
 * Αν η θερμοκρασία ειναι <0, τότε χιονίζει, αλλιώς
 * δεν χιονίζει. Ο  χρήστης δίνει την θερμοκρασία.
 */
public class TempartureApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean  isSnowing = false;
        int temp = 0;
        System.out.println("Please insert current temparture");
        temp = in.nextInt();

        isSnowing = (temp <0);

        System.out.println("Is snowing: " +isSnowing);
    }
}
