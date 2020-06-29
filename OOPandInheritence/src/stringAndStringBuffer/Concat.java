package stringAndStringBuffer;
/*java program that will concatenate 2 strings and return the result. 
 * The result should be in lowercase.*/
import java.util.*;

class Concat
{
	public static void main(String args[])
	{
		String str1,str2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
	 	str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
	 	str2=sc.nextLine();
	 	result=str1+str2;
  		System.out.println("Concatenated String is " +result.toLowerCase());
  		
	}
}
