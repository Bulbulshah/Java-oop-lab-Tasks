import java.util.Scanner;

class AbsoluteDifferenceCalculator {
    public int calculateDifference(int a, int b) {
        return Math.abs(a - b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        AbsoluteDifferenceCalculator calculator = new AbsoluteDifferenceCalculator();
        int difference = calculator.calculateDifference(num1, num2);

        System.out.println("The absolute difference is: " + difference);

        scanner.close();
    }
}
