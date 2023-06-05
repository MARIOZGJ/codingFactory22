package testbed;

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Please provide number of rows to print...");
        int n = in.nextInt();


        System.out.println("Προσφέρτε τον αριθμό των αστερίων που θέλετε");

        do {
            System.out.println("\nΠαρακαλώ επιλέξτε μία απο τις παρακάτω επιλογές");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");


            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Εμφανίσατε n αστεράκια οριζόντια");
                    for (int i = 1; i <= n; i++) {
                        System.out.print("*");


                    }

                    break;

                case 2:
                    System.out.println(" Εμφανίσατε n αστεράκια κάθετα");
                    for (int i = 1; i <= n; i++) {
                        System.out.println("*");
                    }
                    break;

                case 3:
                    System.out.println("Εμφανίσατε n αστεράκια σε n γραμμές");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            System.out.print("*");
                        }
                        System.out.println();


                    }
                    break;

                case 4:
                    System.out.println("Εμφανίσατε n αστερακια σε 1-n γραμμές");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                    }
                    break;

                case 5:
                    System.out.println("Εμφανίσατε n αστερακια σε n-1 γραμμές");

                    for (int i = 1; i <= n; i++) {
                        for (int j = n; j > i; j--) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                    break;


                case 6:
                    System.out.println("Επιλέξατε έξοδος προγράμματος");
                    break;


                default:
                    System.out.println("Άγνωστη Εντολή");
                    break;
            }
        } while (choice != 6);

        System.out.println("Καλή συνέχεια!");

      }

    }




