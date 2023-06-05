package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if-the-else if.
 * Gets a user's choice based on a menu
 * and returns  a feedback/confirmation.
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. One-Player game");
            System.out.println("2. Two-Player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            System.out.println("Please provide a choice");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Start One-Player game");
                    break;

                case 2:
                    System.out.println(" Start Two-Player game");
                    break;

                case 3:
                    System.out.println("Start Team game");
                    break;

                case 4:
                    System.out.println("Quit game");

                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);

             System.out.println("Goodbye!");
        }
    }
















