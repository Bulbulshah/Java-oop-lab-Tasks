class ArraySumCalculator {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        ArraySumCalculator calculator = new ArraySumCalculator();
        int total = calculator.calculateSum(array);

        System.out.println("Sum of array elements: " + total);
    }
}
