package gr.aueb.cf.ch4;

/**
 * Εκτυπώενι
 * 10,9,8,7...,1 αστερακια σε κάθε γραμμη
 * ξεκινώντας απο την 1η γραμμη.
 */
public class Stars10Desceding {
    public static void main(String[] args) {

        for ( int i =1; i <=10; i++) {

            for ( int j =10; j>= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
