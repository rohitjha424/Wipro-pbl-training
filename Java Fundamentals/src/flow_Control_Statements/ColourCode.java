/*Q8*/

package flow_Control_Statements;

import java.io.*;

public class ColourCode {

	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter color code [R/B/G/O/Y/W] : ");
		char ch = (char)in.read();
		switch(ch)
		{
			case 'R':
				System.out.println("Red");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Code");
				break;
		}
	}
}
