class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Slight delay to observe mixing
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted");
            }
        }
    }
}

class CharacterPrinter extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Character: " + ch);
            try {
                Thread.sleep(500); // Slight delay to observe mixing
            } catch (InterruptedException e) {
                System.out.println("Character thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter numThread = new NumberPrinter();
        CharacterPrinter charThread = new CharacterPrinter();

        numThread.start();
        charThread.start();
    }
}
