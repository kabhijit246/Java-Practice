import javax.swing.JOptionPane;

public class UseScoreException
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter a test score");
		double score = Double.parseDouble(input);
		
		try
        {
        	if(score < 0 || score > 100)
        		throw new ScoreException("The score must be >= 0 and <= 100!");
        	else
        	{
        		JOptionPane.showMessageDialog(null, "That is a valid score.");
        	    
		        boolean continueLoop = true;
		        
		          while(continueLoop)
		          {
		        	try
			        {
			        	String ask = JOptionPane.showInputDialog("Do you want to enter another score?");

		                if(ask.equals("Yes") || ask.equals("Y"))
		                {
		                	String input3 = JOptionPane.showInputDialog("Enter another test score");
		                    Double anotherScore = Double.parseDouble(input3);

		                    if(anotherScore < 0 || anotherScore > 100)
		            	        throw new ScoreException("The score must be >= 0 and <= 100!");
        	                else
        	    	            JOptionPane.showMessageDialog(null, "That is a valid score.");
		                }

		                else if(ask.equals("No") || ask.equals("no") || ask.equals("N"))
		                	break;

		                else
		                	JOptionPane.showMessageDialog(null, "Give answer in Yes/No");
		        	    
		        	    continueLoop = false;       
		        	}
  
			        catch(NumberFormatException error)
			        {
				        JOptionPane.showMessageDialog(null, "You must enter a number for the score!");
			        }
			        catch(Exception error)
	                {
	    	            JOptionPane.showMessageDialog(null, error.getMessage());
	                }

		        }
		       
        	}
	    }
	    catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "You must enter a number for the score!");
		}
	    catch(Exception e)
	    {
	    	JOptionPane.showMessageDialog(null, e.getMessage());
	    }
	}
}

class ScoreException extends Exception
{
	ScoreException(String s)
	{
		super(s);
	}
}