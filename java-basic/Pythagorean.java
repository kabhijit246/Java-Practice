//to display pythagorean triples for right angled triangle in a table.
import java.util.Scanner;
public class Pythagorean
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int p, b, h, c=0;
		System.out.printf("%5s %5s %7s \n", "Perpendicular", "Base", "Height");
		for (b=1; b<=500; b++)
		{
			for(p=1; p<b; p++)
			{
				h = (int)Math.sqrt(p*p + b*b);
				if (h*h == (p*p + b*b))
				{
					System.out.printf("%6d %10d %7d \n", p, b, h);
				}

				if (h > 500)
					break;
			}
		}
	}
}