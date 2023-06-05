package testbed;

import java.util.Scanner;

public class FahrenheitApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Celsius = 0;
        int Fahrenheit = 0;


        System.out.println("Please provide temp in Fahrenheit");
        Fahrenheit = in.nextInt();


        Celsius = 5 * (Fahrenheit-32) / 9;

        System.out.printf("%d \u00B0F = %d\u00B0C", Fahrenheit, Celsius);
    }
}
