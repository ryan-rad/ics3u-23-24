package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car Toyota = new Car("Toyota", "Camry", 2018, 132.7);
        Car BMW = new Car("BMW", "i8", 2021, 4323.3);

        Toyota.drive(287.1);
        BMW.printCarInfo();
    }
}