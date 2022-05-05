package week3.day2;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;


public class DuplicateInList {
	
	//import java.awt.List;
		public static void main(String[] args) 
		{
			List<String> list=new ArrayList<String>();
			
			//A,B,C,D,E,A,G,F,C
			list.add("A");		
			list.add("B");
			list.add("C");
			list.add("D");
			list.add("E");
			list.add("A");
			list.add("G");
			list.add("F");
			list.add("C");
			
			int size = list.size();
			
			
			
			for(int i=0;i<size;i++) {
				
				String j = list.get(i);	
				
				for(int k=i+1;k<size;k++)
				{
					String l=list.get(k);
					
				if(j.contains(l))
				{
				
						System.out.println("Duplicate: "+ l);
				}

			}
			
		}  
		
		
		

	}


}
