package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσεκει το τετράγωνο και το τρίγωνο
 * ενός ακερα'ιου που δίνει ο χρήστης
 */
public class MathPowersApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum =0;

        System.out.println("Please insert a num (int)");
        inputNum= in.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d",
        inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum,3));
    }
}
