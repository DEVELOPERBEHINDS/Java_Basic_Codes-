package string;

public class teststring {
	  
	    public static void main(String[] args) {  
	    StringBuilder str =new StringBuilder( "Welcome Javatpoint");      
	    
	    
	    System.out.println(str.reverse());      
	    
	    String s1="raju";
	    String rev = "";
	    char [] ch = s1.toCharArray();
	   
	    for(int i=ch.length - 1; i>=0; i--)
	    {
	    	rev = rev + ch[i];
	    }
	    System.out.println(rev);
	}  
}
