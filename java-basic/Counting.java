//to count the number of positive integers, negative integers and zeroes.
import java.util.Scanner;
public class Counting
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int n, i, pos = 0, neg = 0, zero = 0;
		for (i = 1; i <= 5; i++)
		{
			System.out.print( "Enter an integer: " );
		    n = input.nextInt();

		    if (n > 0)
		    	pos++;
		    else if (n < 0)
		    	neg++;
		    else if (n == 0)
		    	zero++;
	    }
	    System.out.printf( "number of positive integers is/are %d \n", pos );
	    System.out.printf( "number of negative integers is/are %d \n", neg );
	    System.out.printf( "number of zeroes is/are %d \n", zero );
	}
}