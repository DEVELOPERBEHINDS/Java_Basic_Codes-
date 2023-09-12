package basic__Programs;
import java.util.*;
public class listin {
   public static void main(String[] args) {
	
	Map <String , String> h1= new HashMap<>();
	Map <String , String> h2= new HashMap<>();
	
	h1.put("Mohan","Poondi");
	h1.put("Ayyappan","Thiruvarur");
	h1.put("Raja","Tirupur");
	
	h2.put("Sathish","Koduvai");
	h2.put("Mohan","Poondi");
	h2.put("Arun","Mannarai");
	
	
	for(Map.Entry m:h1.entrySet())
	  {  
		   System.out.println(m.getKey()+" : "+m.getValue());  
	  }
	
	
  }
}

//{'mohan':'Poondi','Ayyappan':'Thiruvarur','Raja':'Tirupur'}