package gr.aueb.cf.ch7;

/**
 * Splits  a Sting.
 */
public class SplitApp {

    public static void main(String[] args) {
        String s = "Athens       Uni of Econ and Business";

        //if s.split(" +"); no matter the number of spaces it will show it with single space between words.
        //if s.split(" ?"); it will show  it letter by  letter
        String[] tokens = s.split(" +");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
