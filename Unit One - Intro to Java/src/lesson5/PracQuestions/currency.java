package lesson5.PracQuestions;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT AMOUNT OF US DOLLARS: ");
        int USD = in.nextInt();

        System.out.println(USD);

        double CAD = USD * 1.25;
        System.out.print("$");
        System.out.println(CAD);

        in.close();

    }
    
}
