package com.jetbrains;

import java.io.FileNotFoundException;
import java.util.*;

public class Ques1a {

    public static void main(String[] args) {
        Ques1a obj = new Ques1a();
        obj.inputValue();
    }

    private void inputValue() {
        Formatter file = null;
        try
        {
            file = new Formatter("numbers.txt");
            int value = getValue();
            while ( value != -1 )
            {
            if ( value >= 0 && value < 11 )
                file.format( "%d\n", value );
                value = getValue();
            }
            file.close();
        }
        catch( SecurityException securityException ) {
            System.err.println( "Error opening file." );
        }
        catch( FileNotFoundException fileNotFoundException ) {
            System.err.println( "Output file cannot be found." );
        }
        catch( IllegalFormatException illegalFormatException ) {
            System.err.println( "Error with the output's format." );
        }
        catch( FormatterClosedException formatterClosedException ) {
            System.err.println( "File has been closed." );
        }
        finally {
            if (file != null)
                file.close();
        }
    }

    private int getValue() {
        int result = -1;
        Scanner scanner = new Scanner( System.in );
        System.out.print("Enter an integers between (0-10), -1 to quit: " );
        try
        {
            result = scanner.nextInt();
        }
        catch ( NoSuchElementException noSuchElementException ) {
            System.err.println("Error with input.");
            System.exit(1);
        }
        return result;
    }
}
