package gr.aueb.cf.ch2;

/**
 * Εμφανισει τυπων δεδομενων
 * ακεεραιων, το μεγευθος, και τα
 * MIN-MAX values
 */
public class IntTypesApp {
    public static void main (String[] args){
        System.out.printf("Type: %d , Size: %s,  Min:%d , max: %d",
                Integer.TYPE,Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %d , Size: %s,  Min:%d , max: %d",
                Byte.TYPE,Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %d , Size: %s,  Min:%d , max: %d",
               Short.TYPE,Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %d , Size: %s,  Min:%d , max: %d",
               Long.TYPE,Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);

        
    }


}
