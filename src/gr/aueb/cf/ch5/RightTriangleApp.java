package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει τρεις τιμές αοι τον χρήστη,
 * τις A,B,C όπου η Α είναι η υποτείνουσα,
 * B,C οι δύο πλευρές.

 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ.\
 * α^2 == β^2 + c^2
 *Έστω  EPSILON = 0.000005 ( εξι μηδενικά ακρίβειας)
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert a,b,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON) {
            System.out.println("Το τρίγωνο είναι ορθωγόνιο");
        } else {
            System.out.println("Το τρίγωνο δεν είναι αορθωγόνιο");
        }
    }
}
