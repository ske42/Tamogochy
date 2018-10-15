import java.util.Scanner;

public class Zevs implements Runnable {
    public static boolean activity = false;
    public static boolean game = false;
    
  
    
 public void run() {
        Scanner listner = new Scanner(System.in);
        	while (true) {
	            while (game) 
	            {
	                try
	                {
	                    Thread.sleep(1000);
	                }
	                catch (InterruptedException e)
	                {
	                }
	            }
	            
            String keyWord = listner.next();

            if (keyWord.equals("проверка"))
            {
                System.out.println(ChatBot.state);
                activity = false;
            }
            
            if (keyWord.equals("покормить")) {
                ChatBot.state.put("Питание", Life.food(ChatBot.state.get("Питание")));  //TODO: INCAPSULL METHOD?? Life.up("food")
                ChatBot.state.put("Общение", ChatBot.state.get("Общение") +5);//up(String key)::void
                activity = false;
            }
            
            if (keyWord.equals("туалет")) {
                ChatBot.state.put("Естественная нужда", Life.toilet(ChatBot.state.get("Естественная нужда")));
                ChatBot.state.put("Общение", ChatBot.state.get("Общение") +5);
                activity = false;
            }
            
            if (keyWord.equals("спать")) {
                ChatBot.state.put("Сон", Life.sleeping(ChatBot.state.get("Сон")));
                System.out.println(ChatBot.state.get("Сон"));
                activity = false;
            }
            
            if (keyWord.equals("вымыть")) {
                ChatBot.state.put("Гигиена", Life.bath(ChatBot.state.get("Гигиена")));
                ChatBot.state.put("Общение", ChatBot.state.get("Общение") +5);
                activity = false;
            }
            
            if (keyWord.equals("справка")) {
                System.out.println(Texts.info);

            }
        
	        if (keyWord.equals("команды")) {
	            for (String el: Texts.commands) {
	                System.out.println(el);
	            }
	        }
	        
	        if (keyWord.equals("выход")) {
	            System.exit(0);
	        }
        
	        if (keyWord.equals("города")) {
                GameCityes mythread = new GameCityes();
                Thread th = new Thread(mythread);
                th.start();
            }
           
            }
        	
            }
 
    }



