/*Q2*/

package flow_Control_Statements;
import java.io.*;
public class OddEven {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to check odd or even : ");
		int a = Integer.parseInt(in.readLine());
		if (a % 2 == 0)
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
	}
}


