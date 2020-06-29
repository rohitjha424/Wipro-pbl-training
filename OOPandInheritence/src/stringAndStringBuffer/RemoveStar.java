/*/Java program that accepts a string (with * in it). 
The program should return a new string in which the following 
characters are removed-*,the characters that are to the left and right of (*)   */

package stringAndStringBuffer;

import java.util.Scanner;
public class RemoveStar 
{
public static void main(String[] args)
{
	String str;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string (with * in it)"); 
	str=sc.nextLine();
	int IndexOfStar = str.indexOf('*');
	
	System.out.print(str.substring(0 , IndexOfStar ));
	sc.close();
}

}