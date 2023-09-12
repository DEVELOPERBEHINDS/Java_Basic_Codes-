package string;


class MyString {
	    private char[] value;

	    public MyString(String str) {
	        value = str.toCharArray();
	    }

	    public int compareTo(MyString anotherString) {
	        int length1 = value.length;
	        int length2 = anotherString.value.length;
	        int limit = Math.min(length1, length2);
	        char[] v1 = value;
	        char[] v2 = anotherString.value;

	        int i = 0;
	        while (i < limit) {
	            char ch1 = v1[i];
	            char ch2 = v2[i];
	            if (ch1 != ch2) {
	                return ch1 - ch2;
	            }
	            i++;
	        }
	        return length1 - length2;
	    }
	}

	public class CompareToExample {
	    public static void main(String args[]) {
	        MyString s1 = new MyString("hello");
	        MyString s2 = new MyString("hello");
	        MyString s3 = new MyString("meklo");
	        MyString s4 = new MyString("hemlo");
	        MyString s5 = new MyString("flag");

	        System.out.println(s1.compareTo(s2)); // 0 because both are equal
	        System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"
	        System.out.println(s1.compareTo(s4)); // -1 because "l" is 1 times lower than "m"
	        System.out.println(s1.compareTo(s5)); // 2 because "h" is 2 times greater than "f"
	    }
	}


