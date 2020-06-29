
/*java program that accepts a string and 
returns a new string without the first and last character of the input string.*/


package stringAndStringBuffer;

import java.util.Scanner;

public class FirstAndLast 
{


public static void main(String[] args)
{
	String str;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string"); 
	str=sc.nextLine();
	String strNew = str.substring(1, str.length()-1);
	System.out.println(strNew);

}

}