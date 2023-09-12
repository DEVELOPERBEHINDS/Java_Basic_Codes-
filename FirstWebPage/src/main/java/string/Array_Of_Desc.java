package string;
import java.util.Arrays;
import java.util.*;

public class Array_Of_Desc {
	public static void main(String[] args) {
		int[] array = {58, 9, 0, 3, 7, -2, 8, 4, 60,1};
		

 
		System.out.println("Original array: " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Array sorted in ascending order: " + Arrays.toString(array));		
		
		List <Integer> list =  new ArrayList<Integer> ();
		System.out.println("Array sorted in descending order: ");
		for(int i=array.length-1; i>=0 ; i--)
		{
			System.out.print(array[i]+" ");
		}
		
	}	
	
	
	}
