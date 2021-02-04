//to determine the gross pay for each employees.
import java.util.Scanner;
public class Employees
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner inputs = new Scanner(System.in);
		int i, hours;
		String name;
		double rate;
		for(i=1; i<=3; i++)
		{
			System.out.print("Enter Employee name: ");
			name = input.nextLine();
			System.out.print("Enter number of hours he worked last week: ");
			hours = inputs.nextInt();
			System.out.print("Enter rate per hour: ");
			rate = inputs.nextDouble();

			System.out.println("GrossPay of "+ name +" for the last week is "+ grossPay(hours, rate));
		}
	}
    public static Double grossPay(int hours, double rate)
    {
    	double gross_pay;
        if(hours<=40)
		{
			gross_pay = rate*hours;
			return(gross_pay);
		}
		else
		{
			gross_pay = (rate*40) + (0.5*rate*(hours-40));
			return(gross_pay); 
		}
	}
}