package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει απο το stain to
 * start-value, end-value, step και
 * εκτυπώνει το πλήθος των επαναλήψεων
 */
public class ForFlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please provide start, end and step values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for ( int i = startValue; i <= endValue; i++) {
            iterations++;
            System.out.print(i + "");
        }
        System.out.println("Interations: " + iterations);
    }
}
