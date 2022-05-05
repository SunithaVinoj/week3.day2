package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArrayUsingList {
	
	public static void main(String[] args) {
		
	
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int i,j;
	
	List<Integer> arrayList = new ArrayList<Integer>();
	
	for(int value:arr)
	{
		arrayList.add(value);
	}

	for(i=0;i<arrayList.size();i++)
	{
		for(j=i+1;j<arrayList.size();j++)
		{
			if(arrayList.get(i)==arrayList.get(j))
			{
				System.out.println("Duplicates in an Array is : "+ arrayList.get(j));
				
			}
		}
			
	}
	
	
}

}