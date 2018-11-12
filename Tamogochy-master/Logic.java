import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Logic {
	public static void main(String[] args) {
		Bot bot = new Bot();
		Death killer = new Death();
		Thread th = new Thread(killer);
		th.start();
		while (true) {
			String input = readInput();
			String userID = getUserId();
			if (Arrays.asList(Texts.needs).contains(input) && bot.getTamagochyMap().containsKey(userID)) {
				Event event = new Event(input, userID);
				bot.setEvents(event);
			}
			String reply = bot.reply(input, userID);
			Event currentAction = new Event();
			if (bot.getEvents().size() != 0) {
				currentAction = bot.getEvents().get(0);
			}
			if (!(currentAction.isEmpty()) && (currentAction.What.equals("Death"))) {//switch
				for (String key : bot.getTamagochyMap().keySet()) {
					Pet need = bot.getTamagochyMap().get(key);
					need.Down("Питание", 3);
					need.Down("Сон", 2);
					need.Down("Гигиена", 5);
					need.Down("Счастье", 3);
					bot.setTamagochyMap(key, need);
				}
				bot.removeEvent();
			}
			if (!(currentAction.isEmpty()) && !(currentAction.What.equals("Death"))) {
				currentAction.HowMuch = bot.minus(input);
				bot.getTamagochyMap().get(currentAction.Who).Up(currentAction.What, currentAction.HowMuch);
				bot.removeEvent();
				System.out.println("удовлетворяю свои низменные потребности: " + currentAction.Who);
			}
			System.out.println("ID: " + userID + " || " + reply);
		}
	}

	public static String readInput() {
		Scanner input = new Scanner(System.in);
		String command = input.next();
		return command;
	}

	public static String getUserId() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
		return String.valueOf(randomNum);
	}

}
