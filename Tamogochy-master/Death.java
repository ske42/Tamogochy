import java.util.Map;

public class Death implements Runnable {

    public void run() {
        while (true) {
            try {
                Event death = new Event("Death", "10", 5);
                Bot.setEvents(death);
                Thread.sleep(5000); //1000 - 1 сек
            } catch (InterruptedException ex) {
            }
        }
    }
}
