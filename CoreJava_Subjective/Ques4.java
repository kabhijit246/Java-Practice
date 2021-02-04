package coreJavaTest;
import java.util.*;

public class Ques4 
{
	 public static void main(String args[]) 
	 { 
	        Scanner input1 = new Scanner(System.in);
	        Scanner input2 = new Scanner(System.in);
	        try 
	        {
	        	System.out.print("Number of test cases are: ");
	            int cases = input1.nextInt();
	            if(cases < 1 || cases > 30)
	            	throw new Exception();
	           
	            for(int i = 0; i < cases; i++)
	            {
	            	System.out.print("Number of rows: ");
	                int rows = input1.nextInt();
	                System.out.print("Number of columns: ");
	                int columns = input2.nextInt();
	                
	                if(rows > 1000 || columns > 1000)
		   				 throw new Exception();
	                
	                System.out.println(numberOfPaths(rows, columns));
	            }
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	 }
	 
	 public static long numberOfPaths(int rows, int columns) 
	 {
		 if (rows == 1 || columns == 1)
			 return 1;
		
		 return numberOfPaths(rows , columns-1) + numberOfPaths(rows-1, columns); 
     }
}
