package basics;
import java.util.List;
import java.util.*;
import java.util.Scanner;
public class sop {
    public static void main(String[] args) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>(); 
    	
    	 int start=1 ,end = 50;
        
    	 for(int i=start; i<=end; i++)
    	 {
    		 int sum=0;
    		 for(int j=1; j<i; j++)
    		 {
    			 if(i%j == 0)
    				 sum = sum+j;
    		 }
    		 if(sum == i)
    			 list.add(i);		 
    	 }
    	 
    	 for(Integer i:list)
         System.out.println(i);
  
     }
 }