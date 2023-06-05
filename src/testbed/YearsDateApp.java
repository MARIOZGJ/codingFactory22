package testbed;


import java.util.Scanner;

public class YearsDateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;


        System.out.println("Please provide a year(int");
        year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else if (year % 400 == 0) {
                isLeapYear = true;
            }
        }
    }
}
