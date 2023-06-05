package gr.aueb.cf.ch2;

/**
 *
 * Overflow.
 */
public class AddApp {
    public static void main(String[] args) {
        //Δηλωση ακι αρχικοποιηση μεταβλητων
        int num1 = 2_147_483_647;
        int num2 = 2;
        int resault = 0;

        //εντολες
        resault = num1 + num2;

        //Εμφανιση αποτελεσματων

        System.out.println("sum:");
    }
}
