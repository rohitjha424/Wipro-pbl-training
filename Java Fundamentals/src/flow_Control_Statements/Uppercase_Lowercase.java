/*Q7*/

package flow_Control_Statements;

import java.io.*;


public class Uppercase_Lowercase {

	public static void main(String args[]) throws IOException
	{
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a character : ");
		char ch = (char)in.read();
		if (ch >= 65 && ch <= 90 )
			System.out.println(Character.toLowerCase(ch));
		if (ch >= 97 && ch <= 122)
			System.out.println(Character.toUpperCase(ch));
	}
}
