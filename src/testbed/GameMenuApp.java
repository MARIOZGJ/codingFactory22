package testbed;

import java.util.Scanner;

public class GameMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");


            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Επιλέξατε Εισαγωγή");
                    break;

                case 2:
                    System.out.println(" Επιλέξατε Διαγραφή");
                    break;

                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;

                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");

                case 5:
                    System.out.println("Επιλέξατε Έξοδο");
                    break;
                default:
                    System.out.println("Άγνωστη Εντολή");
                    break;
            }
        } while (choice != 5);

        System.out.println("Καλή συνέχεια!");
       }
}





