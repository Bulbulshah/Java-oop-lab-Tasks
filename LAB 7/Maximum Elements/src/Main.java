class MaxElementFinder {
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {15, 32, 7, 89, 24, 63};

        MaxElementFinder finder = new MaxElementFinder();
        int maxValue = finder.findMax(array);

        System.out.println("The maximum element in the array is: " + maxValue);
    }
}
