import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class ChatBot {
    //public static Map<String, Integer> state = new HashMap<String, Integer>();//check it

	 private Needs Needs =  new Needs(); 
	
	
    public static void main(String[] args) {
        Zevs myrun = new Zevs();
        Thread th = new Thread(myrun);
        Scanner in = new Scanner(System.in);
        System.out.println("Я родился! Пожалуйста, дай мне имя!");
        String tamagochiName = in.next();
        System.out.println("Мне нравится! А как тебя зовут?");
        String myName = in.next();
        System.out.println(Texts.info);
        // put all in Needs class constructor
        th.start();
        
        while (true) {
            String key = "";
            
            while (Zevs.activity) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            
            try {
                Death.changeState(state);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            }
        }






}




