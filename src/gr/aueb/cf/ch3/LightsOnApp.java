package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα ενος
 * αυτοκινήτου με βάση τρεις μεταβλητες:
 * Αν βρέχει ΚΑΙ ταυτοχρονα ισχύει ενα τουλαχιστον απο τα επόμενα:
 * ειναι σκοτάδι Ή τρέχουμε
 * (speed > 100). Τις τιμές αυτές τις λαμβάνουμε απο τον χρήστη (strin)
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean  isRaining = false;
        boolean  isDark = false;
        boolean   isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED =100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true / false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && ( isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
