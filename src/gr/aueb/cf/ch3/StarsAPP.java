package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει μη οριζόντια αστεράκια
 * οπου n ένας ακέραιος που δίνει ο χρήστης.
 */
public class StarsAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars){
            System.out.print("*");
            i++;
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
