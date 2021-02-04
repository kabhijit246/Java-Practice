package coreJavaTest;
import java.util.*;

public class Ques2 
{
	public static void main (String[] args)  
    {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		try
		{
			System.out.print("Number of test cases: ");
			int cases = input1.nextInt();
			if(cases < 1 || cases > 100)
            	throw new Exception();
			
			for(int i = 0; i < cases; i++)
			{
				System.out.print("Enter a string: ");
	            String s = input2.nextLine(); 
	            
	            System.out.println(longest(s)); 
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    } 
	
	public static int longest(String s)  
    {
		int sLength = s.length();
		int len = 0; 
		try
		{
			if(sLength < 2 || sLength > 100000)
				throw new Exception();
			
			int i = sLength/2; 
            while(i < sLength) 
            {
            	if(s.charAt(i) == s.charAt(len)) 
        	    {
            		len++;
        		    i++; 
                }
        	    else
        	    {
        	    	if(len == 0)
        	    		i++;
        		    else
        			    len--;
        	    }
            }
        }
		catch(Exception e) 
		{
			System.out.println("Enter string of atleast 2 characters and atmost of 100000 characters");
		}
		return len;
    }
}
