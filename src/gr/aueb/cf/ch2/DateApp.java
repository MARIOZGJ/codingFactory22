package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Μετατρέπει το day, month, year (yyy)
 */
public class DateApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day =0;
        int month = 0;
        int year = 0;

        System.out.println("Please provide day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("");
    }

}
