/*java program that will return the first half of the string, 
 * if the length of the string is even. It should return null for odd length string.*/

package stringAndStringBuffer;
import java.util.Scanner;
public class HalfString {
public static void main(String[] args)
{
	String str;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string"); 
	str=sc.nextLine();
    int count = 0;    
        
    //Counts each character except space    
    for(int i = 0; i < str.length(); i++) {    
        if(str.charAt(i) != ' ')    
            count++;    
    }    
    
	if(count%2==0)
	{
     
   System.out.println(str.substring(0, str.length()/2));
	}
  
	else
	{ 
		System.out.println("null");
	}
	
}

	
}

