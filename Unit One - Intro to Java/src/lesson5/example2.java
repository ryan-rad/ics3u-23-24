package lesson5;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("PLEASE ENTER A NUMBER: ");
        int x = in.nextInt();
        
        System.out.println(x);

        System.out.println("PLEASE ENTER A DECIMAL NUMBER: ");
        double y = in.nextDouble();
        System.out.println(y);

        in.close();

    }
    
}
