/*Given 2 strings return a new string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.*/

package stringAndStringBuffer;

import java.util.Scanner;

public class ShortLongShort 
{  
	public static void main(String args[])
	{
		String str1,str2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
	 	str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
	 	str2=sc.nextLine();
	 	int n1= str1.length();
	 	int n2= str2.length();
	 	
	 	if(n1>n2)
	 	{
	 		System.out.println(str2+str1+str2);
	 	}
	 	else
	 	{
	 		System.out.println(str1+str2+str1);
	 	}
	}

}
