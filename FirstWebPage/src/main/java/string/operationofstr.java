package string;
import java.util.*;
public class operationofstr{
  public static void main(String[] ayyappan) {
	  
	String s = "mohan ^& 67 90 #@kumar";
	char [] ch = s.toCharArray();
	int count = 0;

	for(int i=0; i<ch.length; i++) 	{	
		count++;
	}
    System.out.println(count);  
	
    
   
   StringTokenizer ninja = new StringTokenizer("Coding Ninjas is Best");
   while (ninja.hasMoreTokens()) {
       System.out.println(ninja.nextToken());
   }
   
   
   
   int a[] =  {10,20,35,68,89,90};
   
   System.err.println("Even positions are: "); 
   for(int i=1; i<a.length; i=i+2)
   {  
     System.out.print(a[i]+" ");   
   }
   
   System.err.println("\nodd positions are: ");
   for(int i=0; i<a.length; i=i+2)
   {
	   System.out.print(a[i]+" ");
   }

   
   
   int b[] =  {10,20,35,0,68,89};
	
	 int max = b[0]; 
	 int min = b[0];
	 for(int i=0; i<b.length; i++) 
	 {
		 if(b[i]>max)
			 max = b[i];
		 if(b[i]<min)
			 min = b[i];
	 }
	  System.out.println("\nlargest element in the array: "+max);
	  System.out.println("\nsmallest element in the array: "+min);
	 
    
	  int [] arrpresent = {-10,20,30,0,68};
	  String [] strpresent = {"raju", "mohan", "ayyappan","arun", "logu"};
	  int count1 = 0;
	  
		for(int i=0; i<strpresent.length; i++) 	{	
			count1++;
		}
	    System.out.println("counted elements : "+count1);  

     
	  
	  
  }
}
