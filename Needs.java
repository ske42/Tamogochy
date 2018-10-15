import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Needs {
    private HashMap<String, Integer> States = new HashMap<String, Integer>();
    
    public int getValue(String key){
    return	States.get(key);
    	}
    
    public void setValue(String key, int value){
    	
    	try {
			States.put(key,value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    public Needs(){
        States.put("Питание", 100);
        States.put("Общение", 100);
        States.put("Досуг", 100);
        States.put("Естественная нужда", 100);
        States.put("Гигиена", 100);
        States.put("Сон", 100);
    }
    
    public void Up(String key, int value)
    {
    	try
    	{
    		int ex_value = this.getValue(key);
    		int upedValue = (ex_value + value);
	    		
    		    if(upedValue>100)
	    		{
	    		   upedValue = 100;	
	    		}
    		    
	        this.setValue(key,upedValue);
		} 
    	catch (Exception e) 
    	{
			System.out.println(e.getMessage());
	    }
   }
    	
    public void Down(String key, int value){
    	    	try {
    	    		int ex_value = this.getValue(key);
    	        	this.setValue(key,ex_value-value);
    			} catch (Exception e) {
    				System.out.println(e.getMessage());
    			}
    	
    }


}

