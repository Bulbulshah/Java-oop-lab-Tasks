class EvenNumberPrinter {
    public void printEvenNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {
        int[] array = {3, 8, 12, 5, 9, 20, 17, 6, 14, 1};

        EvenNumberPrinter printer = new EvenNumberPrinter();
        System.out.print("Even numbers in the array: ");
        printer.printEvenNumbers(array);
    }
}
