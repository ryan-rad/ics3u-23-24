package lesson5.PracQuestions;

public class test  {
    public static void main(String[] args) {
        int number = 4892;

        int digit1 = number/1000;
        System.out.println(digit1);

        int digit2 = (number/100) - (digit1 * 10);
        System.out.println(digit2);

        int digit3 = (number/10) - ((digit1 * 100) + (digit2 * 10));
        System.out.println(digit3);

        int digit4 = (number) - ((digit1 * 1000) + (digit2 * 100) + (digit3 * 10));
        System.out.println(digit4);
    }
}
