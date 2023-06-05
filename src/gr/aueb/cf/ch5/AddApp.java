package gr.aueb.cf.ch5;

/**
 * Προσθέτει δύο ακεραίους με την
 * χρήση της μεθόδου add.
 *
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);

//        complete name of the add method is AddApp.add (a , b);


        System.out.println(sum);


    }

    public static int add(int a, int b) {
//       int sum =0;
//       sum = a + b;
//       return sum;
//        to return a+ b ειναι η συντόμευση της //* αρχής
        return a +b;
    }
}
