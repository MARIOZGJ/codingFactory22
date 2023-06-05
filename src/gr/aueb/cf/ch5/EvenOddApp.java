package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * Απογασίζει αν ένας αριθμός
 * είναι άρτιος ή περιττος.
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isEven = false;


        System.out.println("Please insert an int");
        num = in.nextInt();

        isEven = isEven(num);


        System.out.println("Num: " + num + "is Even: " + isEven);


    }

    /**
     * Evaluates an int if it is even or not,
     * @param n   the number (int) to evaluate.
     * @return  true, if it is even, false otherwise.
     */
    public static boolean isEven (int n) {
        return n % 2 ==0;
//        if ( n % 2 == 0) {
//            return true;
//        }else {
//            return false;
//        }
    }
}
