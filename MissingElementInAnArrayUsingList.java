package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayUsingList {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,7,6,8};
		int i;
		
		List<Integer> arrlist = new ArrayList<Integer>();
		
		arrlist.addAll(Arrays.asList(arr));
		
		Collections.sort(arrlist);
		
		System.out.println("After Sorting an Array is : " +arrlist);
		
		for(i=arrlist.get(0);i<=arrlist.size();i++)
		{
			if(i!=arrlist.get(i-1))
			{
				System.out.println("Missing element in an Array Using List is " + i); 
				break;
				
			}
		}
		
	} 
	
}
