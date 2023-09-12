package basic__Programs;

import java.util.Scanner;

public class palin {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the number: ");  
	       int num=sc.nextInt();
	       
	       int d,sum=0;
	       int temp = num;
	       while(num > 0)
	       {
	    	   d = num % 10;
	    	   sum = sum * 10 + d;
	    	   num = num / 10;
	    	   
	       }
	       if(temp == sum)
	       System.out.println("palindrome");
	       else
	    	   System.out.println("not palindrome");
	}
}
