package lesson5;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("PLEASE ENTER A TEMPERATURE IN FAHRENHEIT: ");
        int fahrenheit = in.nextInt();

        double celcius = ((double)fahrenheit - 32) * 5 / 9;

        System.out.print("THE TEMPERATURE IN CELCIUS IS: ");
        System.out.print(celcius);

        in.close();


    }
}
