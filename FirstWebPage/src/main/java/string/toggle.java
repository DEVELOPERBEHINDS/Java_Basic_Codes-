package string;

public class toggle {
  public static void main(String[] args) {
	
	String str = "Raju is still java";
	
	   String words[]=str.split("\\s");  
	    String toggle="";  
	    
	  for(String w:words)
	    {  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	  toggle.trim();  
	    
  }
}
