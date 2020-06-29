/*Given a string, return a new string 
 * made of 'n' copies of the first 2 chars of the original string 
 * where 'n' is the length of the string.*/
package stringAndStringBuffer;
import java.util.Scanner;
public class NcopiesOfFirstTwoString {
	public static void main(String[] args) {
		String str,firstTwoChars;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string"); 
		str=sc.nextLine();
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
        
        if (count> 2) 
        {
            firstTwoChars = str.substring(0, 2);
        } 
        else
        {
            firstTwoChars = str;
        }
         for(int j =0; j<count ;j++)
         {
        	 System.out.print(firstTwoChars); 
        	 
         }
         
         sc.close();  
    }    

}

