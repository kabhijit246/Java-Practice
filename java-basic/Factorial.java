//to find factorial of number 1-20 and printing in tabular form.
import java.util.Scanner;
public class Factorial
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		long factorial = 1;
		System.out.printf("%3s%25s \n", "Number", "Factorial");
		for (i = 1; i <= 20; i++)
		{
			factorial *= i;
			System.out.printf("%3d%25d \n", i, factorial );
		}
	}
}