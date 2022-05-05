package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingList {
	public static void main(String[] args) {
		
		Integer[] data = {3,2,11,4,6,7};
		
		List<Integer> dataList = new ArrayList<Integer>();
		
		dataList.addAll(Arrays.asList(data));
		
		//dataList.sort(null);
		
		Collections.sort(dataList);
		
		System.out.println("After Sorting " + dataList);
		
		int size=dataList.size();
		
		System.out.println("Second Largest No is using List: " + dataList.get(size-2));
		
		
		
	}

}
