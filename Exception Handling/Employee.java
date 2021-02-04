package com.jetbrains;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
    
        try
        {
        	getEmployeeName(name);
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        finally
        {
        	System.out.println("Thank you for visiting!");
        }      
    }

    public static void getEmployeeName(String name) throws MissingEmployeeNameException
    {
    	ArrayList<String> employeesList = new ArrayList<String>();
        employeesList.add("Abhijit");
        employeesList.add("Mark");
        employeesList.add("Peter");
        employeesList.add("Jack");
        employeesList.add("Patrick");

    	if(!employeesList.contains(name))
        	throw new MissingEmployeeNameException("Your name is missing in the employeeList");
        else
        	System.out.println("Your name is available in the employeesList");
    }
}

class MissingEmployeeNameException extends Exception
{
	MissingEmployeeNameException(String str)
	{
		super(str);
	} 
}