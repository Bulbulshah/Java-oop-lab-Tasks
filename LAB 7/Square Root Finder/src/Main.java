import java.util.Scanner;

class SquareRootCalculator {
    public double findSquareRoot(double number) {
        return Math.sqrt(number);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        SquareRootCalculator calculator = new SquareRootCalculator();
        double result = calculator.findSquareRoot(number);

        System.out.println("Square root of " + number + " is: " + result);

        scanner.close();
    }
}
