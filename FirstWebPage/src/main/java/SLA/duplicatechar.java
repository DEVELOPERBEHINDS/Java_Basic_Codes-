package SLA;

import java.util.HashMap;
import java.util.Map;

public class duplicatechar {
	  public static void main(String[] args) {
		        String input = "programming";
		        
		        // Create a HashMap to store character counts
		        Map<Character, Integer> charCountMap = new HashMap<>();
		        
		        // Count occurrences of each character in the input string
		        for (char c : input.toCharArray()) {
		            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		        }
		        
		        // Print characters with count greater than 1
		        System.out.println("Duplicate characters in the string:");
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey());
		            }
		        }
		    }
		}
