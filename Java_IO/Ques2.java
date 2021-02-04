package com.jetbrains;

import java.util.*;
import java.io.*;

public class Ques2
{

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a four-digit telephone number: ");
        String phoneNumber = input.next();

        FileOutputStream output = null;
        PrintStream printStream;
        char[] word = new char [4];

        char[][] numberLetters = {
                {'0','0','0'},{'1','1','1'},{'A','B','C'},
                {'D','E','F'},{'G','H','I'},{'J','K','L'},
                {'M','N','O'},{'P','R','S'},
                {'T','U','V'},{'W','X','Y'}};

        try
        {
            output = new FileOutputStream ( "PhoneNumber.txt") ;

            if(phoneNumber.length() == 4)
            {
                char[] chars = phoneNumber.toCharArray ();
                int [] digit = new int [chars.length];

                for (int i = 0; i < chars.length; i++)
                {
                    digit[i] = Integer.parseInt(String.valueOf(chars[i]));
                }

                printStream = new PrintStream(output);

                for (int i = 0; i < 3; i++)
                {
                    word[0] = numberLetters[digit[0]][i];

                    for ( int j = 0; j < 3; j++)
                    {
                        word[1] = numberLetters[digit[1]][j];

                        for (int k = 0; k < 3; k++)
                        {
                            word[2] = numberLetters[digit[2]][k];

                            for (int l = 0; l < 3; l++)
                            {
                                word[3] = numberLetters[digit[3]][l];
                                printStream.println(word)
;
                            }
                        }
                    }
                }
                System.out.println("File written, go and check");
            }
            else
            {
                throw new OutofBoundException("Please enter 4-digit number.");
            }
        }
        catch(IOException ioException)
        {
            System.err.println("Error opening file.");
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }

        try
        {
            if(output != null)
                output.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error closing file.");
        }
    }
}

class OutofBoundException extends Exception
{
    OutofBoundException(String s)
    {
        super(s);
    }
}