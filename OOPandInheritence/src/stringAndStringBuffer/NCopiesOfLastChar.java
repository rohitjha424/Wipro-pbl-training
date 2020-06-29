/* Given a string and an integer n, print a new string made 
 * of n repetitions of the last n characters of the string. */


package stringAndStringBuffer;
import java.util.Scanner;
public class NCopiesOfLastChar  
{
		public static void main(String[] args) 
		{
			String str,LastChars;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string"); 
			str=sc.nextLine();
			System.out.println("Enter the value of 'n' "); 
			int n=sc.nextInt();
	        
	        LastChars = str.substring(str.length() - n);
	        
	         for(int j =0; j<n ;j++)
	         {
	        	 System.out.print(LastChars); 
	        	 
	         }
	         
	         sc.close();  
	    }    

	}




