package lesson5.PracQuestions;

import java.util.Scanner;

public class speedcalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT DISTANCE IN KILOMETRES (WHOLE NUMBER)");
        int distance = in.nextInt();

        System.out.println("INPUT TIME IN HOURS (WHOLE NUMBER)");
        int time = in.nextInt();

        double speed = distance/time;

        System.out.println("YOUR SPEED IS: ");
        System.out.print(speed);
        System.out.println(" KM/H");
        
        in.close();
    }
}
