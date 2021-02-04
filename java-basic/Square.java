//to print hollow square with asterisks of side given by users between 1 to 20.
import java.util.Scanner;
public class Square
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int side, i, j;
		System.out.print( "Enter side of a square: " );
		side = input.nextInt();

		if (side > 1 && side <= 20)
		{
			for ( i = 1; i <= side; i++)
			{
				System.out.print( "* ");
			}
			System.out.println(" ");
			for (i = 1; i <= side - 2; i++)
			{
                System.out.print("*");
                for (j = 1; j <= side * 2 - 3; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for(i = 1; i <= side; i++){
                System.out.print("* ");
            }
		}
		else if (side == 1)
		     System.out.print("*"); 
		else
			System.out.print( "Side of the square must be in between 1 and 20" );
	}
}
