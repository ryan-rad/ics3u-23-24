package lesson5.PracQuestions;

import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT RADIUS OF A CIRCLE (WHOLE NUMBER): ");
        int Radius = in.nextInt();

        double area = 3.14 * Math.pow(Radius, 2);
        double circumference = 2 * 3.14 * Radius;

        System.out.print("THE AREA OF THE CIRCLE IS: ");
        System.out.println(area);

        System.out.print("THE CIRCUMFERENCE OF THE CIRCLE IS: ");
        System.out.println(circumference);

        in.close();

        
    }
}
