package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *  Υπολογίζετε το a^n  με BigInterger.
 */
public class BigIntergerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two its, base and power");
        a = BigInteger.valueOf(in.nextInt());
      n = BigInteger.valueOf(in.nextInt());
//          a = in.nextInt();
//          n = in.nextInt();
        for (int  i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);

//        for (int  i = 1; i <= n; i++) {
//            result = result.multiply(BigInteger.valueOf(a));
        }
        System.out.printf("%d %d = %d", a, n ,result);

    }
}
