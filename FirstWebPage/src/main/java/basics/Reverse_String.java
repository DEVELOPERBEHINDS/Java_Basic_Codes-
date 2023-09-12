package basics;
import java.util.*;
public class Reverse_String {
  public static void main(String[] args) {

	  String s1 = "Hello"; 
	  String reversedStr = "";
	  System.out.println("Original string: " + s1);
	  for (int i = 0; i < s1.length(); i++)  
	    { 
		    reversedStr =  s1.charAt(i) + reversedStr; 
		}
	  System.out.println("Reversed string: "+ reversedStr);
		 
       
		    
		    int [] arr= {20,30,40,60};
		    int sum=0;
		    
		    for(int i=0; i<arr.length; i++)
		    {
		    	sum = sum + arr[i];
		    }
		    System.out.println(sum);
		    
		    String txt = "Please locate where 'locate' occurs!";
		    System.out.println(txt.indexOf("locate"));    
		    
		    
		    
		    
		    
		    
		    
   } 
}
