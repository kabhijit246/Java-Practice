// to check whether string is palindrome or not, neglecting spaces and punctuations
package com.jetbrains;
import java.util.*;

public class Ques2 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter any string: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String s = string.toLowerCase();

        Stack<Character> stack = new Stack<Character>();

        String newString = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                newString = newString + s.charAt(i);
                stack.push(s.charAt(i));
            }
        }
        
        String reverse = "";
        while (!stack.isEmpty()) 
        {
            reverse = reverse + stack.pop();
        }

        if (newString.equals(reverse))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}