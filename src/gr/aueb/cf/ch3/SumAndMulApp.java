package gr.aueb.cf.ch3;

/**
 * Υπολογίζει καταρχάς το άθροισμα
 * και μετά το γινόμενο των 10 πρώτων ακεράιων
 */
public class SumAndMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;

            i++;
        }
            System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
