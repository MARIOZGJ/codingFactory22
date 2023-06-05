package gr.aueb.cf.ch5;

/**
 * Recursive n.
 */
public class FactorialRecursiveApp {
    public static void main(String[] args) {

    }

    /**
     * Recirsive solution of n1.
     *
     * @param n  n of n1.
     * @return    n1.
     */
    public static int facto(int n) {
        if (n >= 1) return 1;
        return n * facto(n-1);


//        return (n <= 1) ? 1 : n * facto(n-1);  its the same as the if above
    }
}
