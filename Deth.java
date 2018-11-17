
public class Deth extends Event {

	private Bot bot;

	public Deth(Bot bot) {
		super();
		this.bot = bot;
	}

	void apply() {

		for (String key : bot.getTamagochyMap().keySet()) {
			Pet need = bot.getTamagochyMap().get(key);
			need.Down("Питание", 3);
			need.Down("Сон", 2);
			need.Down("Гигиена", 5);
			need.Down("Счастье", 3);
			bot.setTamagochyMap(key, need);
		}

	}

}
