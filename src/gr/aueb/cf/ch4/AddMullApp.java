package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζει
 *  n πρώτους ακεραίους. Το n το
 *  δίνει ο χρήστης.
 */
public class AddMullApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int resault = 1;

        System.out.println("Please insert a num (int)");
        n = in.nextInt();

        for(int i = 1; i <=n; i++) {
            sum = sum + i;
            resault = resault * i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mul = : " +resault);
        System.out.printf("Mul: %,d", resault);
    }
}
