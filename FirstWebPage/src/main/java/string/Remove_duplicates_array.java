package string;
import java.util.*;

public class Remove_duplicates_array {
	    public static void main(String args[]) {

	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

	        System.out.println("ArrayList with orginal: "+ list);

	        // Create a new ArrayList to store unique elements
	        ArrayList<Integer> newList = new ArrayList<>();

	        for (Integer element : list) 
	        {
	            // If this element is not present in newList  
	        	// then add it
	            if (!newList.contains(element))
	                    newList.add(element);
	        }
	        System.out.println("ArrayList without duplicates : "+ newList);
	        

	                int[] arr = { 5, 2, 8, 1, 9, 3, 5, 8, 2 };

	                // Traverse the array and check for duplicates
	                for (int i = 0; i < arr.length - 1; i++) {
	                    for (int j = i + 1; j < arr.length; j++) {
	                        if (arr[i] == arr[j]) {
	                            System.out.println("ArrayList with Duplicates : " + arr[i]);
	                            break; // Break the inner loop once a duplicate is found
	                        }
	                    }
	                }
	                        int[] arr1 = { 5, 2, 8, 1, 9, 3, 5, 8, 2 };

	                        List<Integer> duplicatesList = new ArrayList<>();

	                        // Traverse the array and check for duplicates
	                        for (int i = 0; i < arr1.length - 1; i++) {
	                            for (int j = i + 1; j < arr.length; j++) {
	                                if (arr1[i] == arr1[j] && !duplicatesList.contains(arr[i])) {
	                                    duplicatesList.add(arr1[i]);
	                                    break; // =Break the inner loop once a duplicate is found
	                                }
	                            }
	                        }
	                        System.out.println("Duplicate elements: " + duplicatesList);
	                    }
	            }	        
