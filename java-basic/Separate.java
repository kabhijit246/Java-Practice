//To separate a number by its digit e.g input: 12345; output: 1  2  3  4  5
import java.util.Scanner;
public class Separate
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int n, m = 0, digit, rev = 0, num, dig;
		System.out.print( "Enter 5-digit number: " );
		n = input.nextInt();

		while (n != 0)
		{
            digit = n % 10;
            rev = rev * 10 + digit;
			n = n / 10;
            m++;
		}
		num = rev;
		if ( m == 5 )
		{
			while (num != 0)
			{
				dig = num % 10;
				num = num/10;
                System.out.printf( "%d   ", dig);
			}

		}
		else
			System.out.printf( "Please enter 5-digit number" );
	}
}