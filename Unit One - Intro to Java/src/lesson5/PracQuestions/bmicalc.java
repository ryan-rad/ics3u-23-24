package lesson5.PracQuestions;

import java.util.Scanner;

public class bmicalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR WEIGHT (IN KG): ");
        int weight = in.nextInt();

        System.out.println("ENTER YOUR HEIGHT (IN METRES): ");
        double height = in.nextDouble();

        double bmi = weight / (height * height);

        System.out.print("YOUR BMI IS: ");
        System.out.println(bmi);



        in.close();

        
    }
}