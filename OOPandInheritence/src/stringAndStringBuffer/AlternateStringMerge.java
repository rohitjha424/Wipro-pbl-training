// Java code to alternatively merge two strings: 
/* print a new string which is made of the following combination-first character of a, 
 * the first character of b, second character of a, second character of b and so on.*/
package stringAndStringBuffer;

import java.util.Scanner;

public class AlternateStringMerge {
	
	
	

		// Function for alternatively merging two strings 
		public static String merge(String s1, String s2) 
		{ 
			// To store the final string 
			StringBuilder result = new StringBuilder(); 

			// For every index in the strings 
			for (int i = 0; i < s1.length() || i < s2.length(); i++) { 

				// First choose the ith character of the 
				// first string if it exists 
				if (i < s1.length()) 
					result.append(s1.charAt(i)); 

				// Then choose the ith character of the 
				// second string if it exists 
				if (i < s2.length()) 
					result.append(s2.charAt(i)); 
			} 

			return result.toString(); 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			String str1,str2,result;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 1st string");
		 	str1=sc.nextLine();
			System.out.println("Enter the 2nd string");
		 	str2=sc.nextLine();
			System.out.println(merge(str1, str2)); 
		} 
	} 



