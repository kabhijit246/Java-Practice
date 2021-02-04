//Comparing two numbers and finding the larger one.
import java.util.Scanner; 

public class Larger
{
	public static void main( String[] args )
	{
		// create Scanner to obtain input from command line
                Scanner input = new Scanner( System.in );

                int n; 
                int m; 

                System.out.print( "Enter first integer: " ); 
                n = input.nextInt(); 

                System.out.print( "Enter second integer: " ); 
                m = input.nextInt(); 

                if (n > m)
                        System.out.printf( "%d is larger" , n);
                else if ( n < m)
                        System.out.printf( "%d is larger" , m);
                else
                        System.out.printf( "These numbers are equal");
        }
}
