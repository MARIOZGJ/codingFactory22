package gr.aueb.cf.ch5;
import java.util.Scanner;
/**
 * Υλοποιει εναν απλό calculator που παρέχει τις υπηρεσίες
 *  add, sub ,mod, div, mul ( +, -, % ,:, *).
 *  Εμφανίζει τένα Μενού προς τον χρήστη με επιλογές,
 *  λαμβάνει την τιμή της ειλογής και στη συνέχεια
 *  δύο ακόμα τιμές τωμ num1, num2.
 *  Και τελικά εμγανίζει το αποτέλεσμα.
 */
public class CalculatorApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            // validation
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }
             result = onChoiceGetResult(choice);
            System.out.println("Result: " + result);
        } while (true);
    }
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο");
        System.out.println("6. Έξοδος");
    }
    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }
    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }
    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }
    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }
    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert th first number");
        int num2 = getNextInt("Please insert the second number");
        int result = 0;

        switch (choice) {
            case 1:
//                return add(num1, num2);

                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }
        return result;
    }
}




