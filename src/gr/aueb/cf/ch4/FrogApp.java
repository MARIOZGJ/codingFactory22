package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ;Eνας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * O  frog βρίσκεται στη θέση χ και θέλει να φτάσει στην
 * θέσει y (ή σε θεση >=y). Ο frog jumps a fixed distance, D.
 *
 * Το πρόγραμμα αυτό βρίσκει τον ελάχιστο αριθμό jumps  που πρέπει να κάνει ο
 * frog  ώστε να φτάσει (ή να ξεπεράσει ) τον στόχο του.
 *
 * Για παράδειγμα:
 * χ=10
 * y= 85
 * D = 30
 *
 * τότε ο small frog  θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump, πάει στην θέση 10 + 30 = 40
 * Στο 2ο jump πάει 40 +30 = 70
 * Και στο 3ο jump, παει 70 + 30 = 100
 */
@SuppressWarnings("LanguageDetectionInspection")
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int d = 0;
        int i = 0;
        int count = 0;

        System.out.println("Please input x,y and d for our little frog...");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

        if (x>=y) {
            System.out.println("Hey! X cannot be greater or equal from Y!");
            System.exit(1);
        }

        for (;;) {
            count++;
            i += d;

            if (i>=y) {
                System.out.printf("Our little frog needs %d jumps! %n", count);
                break;

            }
        }
    }
}
