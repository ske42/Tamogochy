import java.util.ArrayList;
import java.util.HashMap;

public class Bot {
	private HashMap<String, Pet> TamagochyMap;
	private ArrayList<Event> Events;

	public ArrayList<Event> getEvents() {
		return Events;
	}

	public HashMap<String, Pet> getTamagochyMap() {
		return TamagochyMap;
	}

	public void setTamagochyMap(String id, Pet pet) {
		TamagochyMap.put(id, pet);
	}

	public void setEvents(Event event) {
		Events.add(event);
	}

	public void removeEvent() {
		Events.remove(0);
	}

	Bot() {

		TamagochyMap = new HashMap<String, Pet>();
		Events = new ArrayList<Event>();

	}

	public int minus(String input) {

		switch (input) {
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

	public String reply(String input, String ID) {

		if (!TamagochyMap.containsKey(ID)) {
			Pet needs = new Pet();
			TamagochyMap.put(ID, needs);
			return "Я родился!";
		}
		switch (input) {

		case "Питание": {
			return "Сейчас я буду кушать, сейчас меня покормят!";
		}
		case "Сон": {
			return "Я ложусь спать, не беспокой меня несколько минут!";
		}
		case "Туалет": {
			return "Секундочку, я отлучусь...";
		}
		case "Счастье": {
			return "Я так рад, что ты у меня есть!";
		}
		case "Гигиена": {
			return "А сейчас я хочу расслабиться и принять ванну";
		}
		case "Команды": {
			return Texts.commands;
		}
		case "Проверка": {
			return TamagochyMap.get(ID).getStates();
		}
		default:
			return "Я не знаю такой команды! Если хочешь узнать список доступных, введи \"Команды\"";
		}

	}
}
