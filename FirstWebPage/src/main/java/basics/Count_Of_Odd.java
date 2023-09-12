package basics;

public class Count_Of_Odd {
   public static void main(String[] args) {
	
	   int start=15, end=45, c1 = 0,c2=0,c3=0;
	   
	   for(int i=start; i<=end ; i++)
	   {
		   if(i%2 != 0)
			   c1++;
		   if(i%3 == 0)
			  c2++;   
		   if(i%10 == 5 )
			   c3++;
	   }
	   System.out.println(c1);
	   System.out.println(c2);
	   System.out.println(c3);
  }
}
