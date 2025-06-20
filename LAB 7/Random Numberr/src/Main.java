import java.util.Random;

class RandomNumberGenerator {
    public void generateNumbers(int count, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(max - min + 1) + min;
            System.out.println("Random Number " + (i + 1) + ": " + number);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        generator.generateNumbers(5, 1, 100);
    }
}
