class ArrayReverser {
    public void printReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        ArrayReverser reverser = new ArrayReverser();
        System.out.print("Array in reverse order: ");
        reverser.printReverse(array);
    }
}
