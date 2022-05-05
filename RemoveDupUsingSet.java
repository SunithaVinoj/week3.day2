package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupUsingSet {

		public static void main(String[] args) {

			String string = "We learn java basics as part of java sessions in java week1";
			
			String[] strSplit = string.split(" ");
			
			Set<String> str=new LinkedHashSet<String>();
			
			str.addAll(Arrays.asList(strSplit));
			
			System.out.println(str);
	        
//			for(String finStr:str)  
//			{
//				str.add(finStr);
//			}
	//
//			System.out.println(str);

			}


			}




