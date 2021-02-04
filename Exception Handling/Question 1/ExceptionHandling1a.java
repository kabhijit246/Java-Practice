public class ExceptionHandling1a
{
	public static void main (String[] args)
	{
		try
		{
			throw new ClassNotFoundException();
		}
		catch(Exception e)
		{
			System.out.println(e + " Exception handled in same method where it is created i.e. main method");
		}
		System.out.println("Exception already handled");
	}
}