package test1;

import java.io.*;
import java.util.*;

public class Ques3 
{
	ArrayList<Character> ch = new ArrayList<Character>();
	public static void main(String[] args)
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try
		{
			Ques3 unique = new Ques3();
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;
			while((c = in.read()) != -1)
			{
				unique.addUnique((char)c);
			}
			
			for(char i : unique.ch)
			{
				out.write(i);
                System.out.println(i);
            }
            in.close();
            out.close();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
    void addUnique(char c)
	{
    	int index = this.ch.indexOf(c);
		if(index == -1)
			this.ch.add(c);
		else
		    this.ch.remove(index);  
	}
}
