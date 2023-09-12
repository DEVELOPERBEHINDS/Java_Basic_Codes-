
package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.*;
public class TwoListsAddition {
    public static void main(String[] args) {
	        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 2);
	        List<Integer> list2 = Arrays.asList(5, 40, 30, 2, 1);

	        List<Integer> combinedList = new ArrayList<>(list1);
	        
	        combinedList.addAll(list2);

	        System.out.println("Combined List: " + combinedList);
	        
	        Set<Integer> combinedset = new HashSet<>(combinedList);
	        System.out.println(combinedset);
	        
	        
	    }
	}
