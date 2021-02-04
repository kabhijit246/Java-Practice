import java.util.Scanner;
public class Swap_Reverse{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;

		do
		{
			try
		    {
		    	System.out.print("Enter a string: ");
		        String string = input.nextLine();

			    String first = "";
                int i = 0;   
		        for (i = 0; i < string.length();){
		        	while (string.charAt(i) != ' '){
		        		first = first + string.charAt(i);
				        i++; 
			        }
			        break;
		        }

		        String last = "";
		        int j = 0;
		        for (j = string.length()-1; j >= i; j--){
		    	    while (string.charAt(j) != ' '){
		    	    	last = string.charAt(j) + last;
				        j--; 
			        }
			        break;
		        }

		        System.out.print(last);

		        for (int k = j; k >= i; k--){
		        	System.out.print(string.charAt(k));
		        }

		        System.out.print(first);
		        continueLoop = false;
		    }
		    catch(Exception e)
		    {
			System.out.println("Please enter atleast two word");
		    }
	    }
		while (continueLoop);
	}
}
/* The difference in both the examples is the exception caused when user input a single word.
 So to handle that exception try-catch clause is used. If we can't handle these exception
  then our will stop as soon as exception occurs. So if we want our program not to stop due to these exceptions,
  we must handle it in try-catch block.*/