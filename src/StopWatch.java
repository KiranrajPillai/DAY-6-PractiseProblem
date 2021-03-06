import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {

        int delay = 100;
        int period = 100;
        timer = new Timer();
        interval =100;
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, delay, period);
    }

    private static final int setInterval(){
        if( interval== 1) timer.cancel();
        return --interval;
    }
}