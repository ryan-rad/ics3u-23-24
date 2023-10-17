package lesson5.PracQuestions;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT PRICE OF ITEM (WHOLE NUMBER)");
        int originalPrice = in.nextInt();

        double discountedPrice = originalPrice * 0.2;
        System.out.print("THE PRICE AFTER A 20% DISCOUNT IS: $");
        System.out.println(discountedPrice);
        

        double afterTax = discountedPrice/0.13;
        System.out.print("THE TOTAL PRICE AFTER 13% TAX IS: $");
        System.out.println(afterTax);


        in.close();       
    }
}
