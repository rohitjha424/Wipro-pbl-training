/*3*/

package flow_Control_Statements;

import java.io.*;
public class CommandLine {


	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			if (args.length > 0)
			{
				for (int i = 0; i < args.length; i++)
					System.out.print(args[i] + " ");
			}
			else
				System.out.println("No values");
		}
	}
}
