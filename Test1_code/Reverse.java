package test1;

import java.util.*;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter an integer: ");
		    int num = input.nextInt();
				
		    int digit, rev=0;
		    while(num > 0)
		    {
		    	digit = num%10;
			    rev = rev*10 + digit;
			    num =num/10;
		     }
		     System.out.println("Reverse of input integer is: "+ rev);
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("Please enter an integer");
	     }
	}
}