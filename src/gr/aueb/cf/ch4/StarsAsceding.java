package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει σε αυξουσα σειρα
 * 1, 2, 3,...,10 αστερακια
 * σε κάθε γραμμή
 */
public class StarsAsceding {
    public static void main(String[] args) {

        for ( int i =1; i <=10; i++) {

            for ( int j =1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
