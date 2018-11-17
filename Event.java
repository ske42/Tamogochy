public class Event {
	public String What;
	public String Who;
	private String When;
	public int HowMuch;
	private Bot Bot;

	public boolean isEmpty() {
		return What == null || Who == null;
	}

	Event() {
		What = null;
		Who = null;
		HowMuch = 0;
	}

	public Event(String what, String who, String when, int howMuch, Bot bot) {
		super();
		What = what;
		Who = who;
		When = when;
		Bot = bot;
		HowMuch = howMuch;
	}

	Event(String what, String who, Bot bot) {
		this.What = what;
		this.Who = who;
		// When = when;
		Bot = bot;
		HowMuch = getConst(what);

	}

	void aply()  {
// empty event 
		Bot.getTamagochyMap().get(Who).Up(What, HowMuch);
		Bot.removeEvent();
		
	}

	public void printEvent() {
		System.out.println(What);
		System.out.println(Who);
		System.out.println(HowMuch);
	}

	int getConst(String what) {
		switch (what) {
		case "Питание": {
			return 20;
		}
		case "Сон": {

			return 100;
		}
		case "Туалет": {
			return 50;
		}
		case "Счастье": {
			return 10;
		}
		case "Гигиена": {
			return 15;
		}
		default:
			break;
		}
		return 0;
	}
}
