package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddApp2 {
    public static void main(String[] args) {
        BigInteger Bignum1 = new BigInteger("665431894656");
        BigInteger Bignum2 = new BigInteger("94616456264");
        BigInteger resault = new BigInteger("0");

        resault = Bignum1.add(Bignum2);

        System.out.printf("%, d", resault);
    }
}