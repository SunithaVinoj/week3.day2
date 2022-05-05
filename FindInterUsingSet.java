package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindInterUsingSet {
	

			public static void main(String[] args)
			{
				Integer[] arr1= {3,2,11,4,6,7};
				Integer[] arr2= {1,2,8,4,9,7};
				int i,j;
				Set<Integer> set1 = new LinkedHashSet<Integer>();
				
				Set<Integer> set2 = new LinkedHashSet<Integer>();
				
				set1.addAll(Arrays.asList(arr1));
				set2.addAll(Arrays.asList(arr2));
				
				
				System.out.println("Intersection of an array is");
				
				System.out.println("Set1 " +set1);
				System.out.println("Set2 " +set2);
				
				
				
				for(int value1:set1)
				{
					for(int value2:set2)
					{
						if(value1==value2)
						{
							System.out.println("Intersection using Set is : " +value1);
						}
					}
				}
			}
		}






