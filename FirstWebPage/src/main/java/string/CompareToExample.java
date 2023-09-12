package string;

	public class CompareToExample {
	    public static void main(String args[]) {
	        String s1 = new String("hello ");
	        String s2 = new String("hello ");
	        String s3 = new String("meklo");
	        String s4 = new String("hemlo");
	        String s5 = new String("flag");

	        System.out.println(s1.compareTo(s2)); // 0 because both are equal
	        System.out.println(s1.equalsIgnoreCase(s2)); 
	        
	        System.out.println(s1.replaceAll( " ", "java"));
	        System.out.println(s1.compareTo(s5)); 
	        
	        
	    }
	}


