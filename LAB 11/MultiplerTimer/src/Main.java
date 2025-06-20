class TimerThread extends Thread {
    private int duration;
    private String timerName;

    public TimerThread(String timerName, int durationInSeconds) {
        this.timerName = timerName;
        this.duration = durationInSeconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration * 1000);
            System.out.println(timerName + " finished after " + duration + " seconds.");
        } catch (InterruptedException e) {
            System.out.println(timerName + " was interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TimerThread timer1 = new TimerThread("Timer 1", 2);
        TimerThread timer2 = new TimerThread("Timer 2", 4);
        TimerThread timer3 = new TimerThread("Timer 3", 6);

        timer1.start();
        timer2.start();
        timer3.start();
    }
}
