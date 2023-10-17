package lesson5.PracQuestions;

import java.util.Scanner;
import java.lang.Math;

public class righttriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT VALUE FOR SIDE 1 (WHOLE NUMBER)");
        int side1 = in.nextInt();

        System.out.println("INPUT VALUE FOR SIDE 2 (WHOLE NUMBER)");
        int side2 = in.nextInt();

        int hypotenuse = (int) Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.print("THE LENGTH OF THE HYPOTENUSE IS: ");
        System.out.println(hypotenuse);

        in.close();
    }
    
}
