package testbed;

public class StarCountingMethod1 {
    public static void main(String[] args) {
        for (int i =1; i <=20; i++) {
            for (int j = 20; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
          }
        }
    }

