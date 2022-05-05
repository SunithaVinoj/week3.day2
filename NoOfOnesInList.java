package week3.day2;

//import java.awt.List;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

 

public class NoOfOnesInList {
	
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		int count=0;
		
		
		list.add(1);		
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(6);
		
		int size = list.size();
		
		for(int i=0;i<size;i++) {
			int j = list.get(i);	
			
			if(j==1)
			{
					count =count +1;
				//	System.out.println("No of 1 is: "+ count);
			}

		}
		
		if (count >0)  
		System.out.println("No of 1 is: "+ count);
		
		else
				System.out.println("No match");

	}  
	
	
	

}
