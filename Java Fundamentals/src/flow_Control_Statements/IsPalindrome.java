/*Q17*/

package flow_Control_Statements;

import java.io.*;

public class IsPalindrome {


	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Digit: ");
		int n = Integer.parseInt(in.readLine());
		int n1 = n;
		String str = "";
		int digit;
		while (n != 0)
		{
			digit = n % 10;
			str += Integer.toString(digit);
			n = n / 10;
		}
		int n2 = Integer.parseInt(str);
		if (n1 == n2)
			System.out.println(n1 + "is a palindrome");
		else
			System.out.println(n1 + " is not a palindrome");
	}
}	
