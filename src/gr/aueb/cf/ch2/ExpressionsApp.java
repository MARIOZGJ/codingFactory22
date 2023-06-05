package gr.aueb.cf.ch2;

/**
 *
 * expressions examples
 */
public class ExpressionsApp {
    public static void main(String[] args) {
         int num1= 12;
         int num2= 5;
         int sum = 0;
         int sub = 0;
         int mul = 0;
         int div = 0;
         int mod = 0;
         int resault1=0;
         int resault2=0;

         resault2= num1++;  //resault2 ->12 , num1->13
         resault2= ++num2;  //num2 ->6, resault2 = 6

        resault2 = num1;
        num1++;

        resault1 = resault1 + 10;
        resault1 +=10;


         sum= num1 + num2;
         sub= num1 - num2;
         mul= num1 * num2;
         div= num1 / num2;
         mod= num1 % num2;
         resault1 = (num1+ num2 * (num2 -(15/num1)));



         System.out.printf("sum= %d, sub=%d, mul=%d, div=%d, mod=%d",
                 sum, sub, mul, div, mod);
    }
}
