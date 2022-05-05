package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupUsingList {

		public static void main(String[] args) {

			String str = "We learn java basics as part of java sessions in java week1";
			
			String[] strSplit = str.split(" ");
			List<String> lst=new ArrayList<String>();
			
	        lst.addAll(Arrays.asList(strSplit));
	        

			for(int i=0;i<lst.size();i++)
			{
			for(int j= i+1; j<lst.size();j++)
			{
			 
			if (lst.get(i).equals(lst.get(j)))
			{
				lst.set(j,"");
			}
			}

			System.out.println(lst.get(i));

			}


			}


	}



