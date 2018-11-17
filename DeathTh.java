import java.util.Map;

public class DeathTh implements Runnable {
	private Bot Bot;
	

	public DeathTh(Bot bot) {
		super();
		Bot = bot;
	}

	public void run() {
		while (true) {
			try {
				Event death = new Deth(Bot);
				Bot.setEvents(death); // put self
				Thread.sleep(5000); // 1000 - 1 сек
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
