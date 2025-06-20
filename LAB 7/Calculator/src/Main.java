import java.util.Scanner;

class PowerCalculator {
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        PowerCalculator calculator = new PowerCalculator();
        double result = calculator.calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
