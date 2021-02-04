//to check whether a 5-digit number is palindrome or not.
import java.util.Scanner;
public class Palindrome
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int n, m, digit, rev = 0, count = 0;
		System.out.print( "Enter a 5-digit number: " );
		n = input.nextInt();
        m = n;
		while (n != 0)
		{
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
            count++;
		}
		if (count == 5)
		{
			if (rev == m)
				System.out.print( "Given number is a palindrome number" );
			else
				System.out.print( "Given number is not a palindrome number" );
		}
		else
			System.out.print( "Please enter a 5-digit number" );
	}
}
