package basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class list {
	public static void main(String[] args)  {
		
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 2, 3, 4));
        listOfLists.add(Arrays.asList(5, 6, 7, 8));
        listOfLists.add(Arrays.asList(9, 10, 11, 12));

        List<Integer> num1 = new  ArrayList();
       
        for (List<Integer> number : listOfLists) 
         {
        	for (int num : number) 
        	 {
        		 if(num %2 == 0) {
        			 num=0;
        			 num1.add(num);
        		 }
        		 else 
        			 num1.add(num);   		 
        	 }        	 
         }
         System.out.println(num1);
    }
}
