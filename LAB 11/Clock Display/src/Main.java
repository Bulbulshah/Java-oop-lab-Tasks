import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class ClockDisplay extends Thread {
    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime currentTime = LocalTime.now();
            String timeString = currentTime.format(formatter);
            System.out.println("Current Time: " + timeString);

            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted");
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.start();
    }
}
