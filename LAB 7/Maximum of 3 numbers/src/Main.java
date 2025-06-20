import java.util.Scanner;

class MaximumFinder {
    public int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        MaximumFinder finder = new MaximumFinder();
        int max = finder.findMaximum(num1, num2, num3);

        System.out.println("The largest number is: " + max);

        scanner.close();
    }
}
