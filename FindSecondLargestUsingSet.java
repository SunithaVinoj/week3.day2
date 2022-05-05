package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargestUsingSet {
	public static void main(String[] args) 
	{
	
		int[] data = {3,2,11,4,6,7};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int value:data)
		{
			set.add(value);
		}
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.addAll(set);
		Collections.sort(arrayList);
		System.out.println("After Sorting: " + arrayList );
		
		int size=arrayList.size();
		
		System.out.println("Second Largest no using Set: "+arrayList.get(size-2));
		
		
	} 
	

}
