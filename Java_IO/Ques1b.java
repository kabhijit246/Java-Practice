package com.jetbrains;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ques1b {

    public static void main(String[] args) {
        Survey obj = new Survey();
        obj.displayData();
    }
}

class Survey {

    public void displayData() {
        int frequency[] = new int[ 11 ];
        Formatter writer = null;
        Scanner file = null;

        try{
            writer = new Formatter("output.txt");
            file = new Scanner(new File("numbers.txt"));

            writer.format( "%1s%15s\n", "Rating", "Frequency" );
            while ( file.hasNext() )
                ++frequency[ file.nextInt() ];

            for ( int rating = 0; rating < frequency.length; rating++ )
                writer.format( "%3d%14d\n", rating, frequency[ rating ] );

        }
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error: Files not found." );
        }
        catch ( FormatterClosedException formatterClosedException )
        {
            System.err.println( "Error: Output file is closed." );
        }
        catch ( SecurityException securityException )
        {
            System.err.println( "Error: opening file for writing." );
        }
        catch ( IllegalFormatException illegalFormatException )
        {
            System.err.println( "Error: writing data to file." );
        }
        catch ( NoSuchElementException noSuchElementException )
        {
            System.err.println( "Error: reading from file." );
        }
        catch ( IllegalStateException illegalStateException )
        {
            System.err.println( "Error: Input file is closed." );
        }
        finally
        {
            if ( writer != null )
                writer.close();

            if ( file != null )
                file.close();
        }
    }
}
