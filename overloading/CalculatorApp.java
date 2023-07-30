package overloading;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        double sum2 = calculator.add(3.14, 2.71);
        int sum3 = calculator.add(1, 2, 3);
        double sum4 = calculator.add(1.5, 2.5, 3.5);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Sum 4: " + sum4);
    }
}
