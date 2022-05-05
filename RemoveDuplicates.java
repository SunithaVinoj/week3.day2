package week3.day2;

public class RemoveDuplicates 
{
public static void main(String[] args) {

String str = "We learn java basics as part of java sessions in java week1";
String[] strSplit = str.split(" ");


for(int i=0;i<strSplit.length;i++)
{
for(int j= i+1; j<strSplit.length;j++)
{
 
if (strSplit[i].equals(strSplit[j]))
{
	strSplit[j] = "";
}

}


System.out.println(strSplit[i]);

}


}
}