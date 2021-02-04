public class ExceptionHandling1c
{
	public static void main (String[] args)
	{
		try
		{
			method1();
		}
		catch(Exception e)
		{
			System.out.println(e + " Exception handled in another method i.e. main method but created in method1");
		}

		System.out.println("Exceptions already handled");
	}

	public static void method1()
	{
		throw new ClassNotFoundException(); //this will show compilation error because the exception created is not declared to be thrown
	}
}