package gr.aueb.cf.ch1;

/**
 * Προσθέτοι 2 ακεραίαους και εμφανίζει το αποτέλεσμα στο
 * stdout
 */
public class AddΑpp {
    public static void main(String[] args) {
        //δηλωσει και αρχεικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int resault = 0;

        //εντολές

        resault = num1 + num2;

        //Εκτύπωσει αποτελεσματων
        System.out.println("Το αποτέλεσμα των  "  + num1 +", "+ num2 + "ειναι " + resault);
        System.out.printf("Το αποτελεσμα του  1d , 2d , ειναι 3d ",num1, num2, resault);
    }

}
