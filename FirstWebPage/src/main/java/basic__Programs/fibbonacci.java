package basic__Programs;

public class fibbonacci {
  public static void main(String[] args) {
	
	int a=0,b=1, n=10;
	int c=0;
	
	System.out.println(a+" "+b); 
	for(int i=0; i<=n; i++)
	{ 
		c=a+b;
	   System.out.println(" "+c);
		a=b;
		b=c;
	}
  }
}
