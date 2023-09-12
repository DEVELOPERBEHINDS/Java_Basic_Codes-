package SLA;

import java.util.ArrayList;
import java.util.Scanner;

	public class modifiedlist {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string of numbers separated by spaces:");
	        String input = scanner.nextLine();
	        
	        // Split the input string into an array of strings
	        String[] inputArray = input.split(" ");
	        
	        // Create an ArrayList to store the numbers
	        ArrayList<Integer> numberList = new ArrayList<>();
	        
	        // Convert and add each element of the array to the ArrayList
	        for (String numStr : inputArray) {
	            try {
	                int num = Integer.parseInt(numStr);
	                numberList.add(num);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input: " + numStr + " is not a valid number.");
	            }
	        }
	        
	        // Print the ArrayList
	        System.out.println("List of numbers:");
	        for (Integer num : numberList) {
	            System.out.println(num);
	        }
	        
	        scanner.close();
	    }
	}
