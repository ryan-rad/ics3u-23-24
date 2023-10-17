package lesson6;

import java.util.Scanner;
import java.lang.Math;

public class practiceproblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INPUT LENGTH OF POOL: ");
        int length = 20;

        System.out.println("INPUT WIDTH OF POOL: ");
        int width = 8;

        System.out.println("INPUT DEPTH OF THE SHALLOW END: ");
        int shallowHeight = 3;
        
        System.out.println("INPUT DEPTH OF THE DEEP END: ");
        int deepHeight = 8;

        System.out.println("INPUT LENGTH OF TRANSITION: ");
        int transition = 7;

        System.out.println("INPUT LENGTH OF SHALLOW END: ");
        int shallowLength = 5;

        System.out.println("INPUT PRICE PER METRES SQUARED: ");
        int linerCost = 2;

        double transHeight = (double) deepHeight - shallowHeight;
        
        double deepBlockV = (double) deepHeight * shallowLength * width;

        double transLength = (double) Math.sqrt(Math.pow(transition, 2) - Math.pow(transHeight, 2));

        double transBlockBottomV = (double) transLength * transHeight * width;




        in.close();
    }
    
}
