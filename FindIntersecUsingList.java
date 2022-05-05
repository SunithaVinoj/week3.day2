package week3.day2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class FindIntersecUsingList {
	
		public static void main(String[] args)
		{
			int[] arr1= {3,2,11,4,6,7};
			int[] arr2= {1,2,8,4,9,7};
			int i,j;
			List<Integer> list1 = new ArrayList<Integer>();
			
			List<Integer> list2 = new ArrayList<Integer>();
			
//			list1.addAll(Arrays.asList(arr1));
//			list2.addAll(Arrays.asList(arr2));
			
			for(int value1:arr1)
			{
				list1.add(value1);
			}
			for(int value2:arr2)
			{
				list2.add(value2);
			}
			
			
			
			System.out.println("Intersection of an array is");
			
			for(i=0;i<list1.size();i++)
			{
				for(j=0;j<list2.size();j++)
				{
					
					if(list1.get(i)==list2.get(j))
						
						System.out.println(list1.get(i));
						
				}
			}	
			
		}
	}



