package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Maya", 1500.76, 526374);
        BankAccount account2 = new BankAccount ("Ryan", 1755.83, 134235);




        account1.deposit(1000.50);
    }
}
