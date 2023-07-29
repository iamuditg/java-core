package inheritance;

public class VehicleApp {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022, 4);
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);

        System.out.println("Car Details:");
        car1.displayInfo();
        System.out.println("\nMotorcycle Details:");
        motorcycle1.displayInfo();
    }
}