/**
 * Increase.java
 *
 * Problem 8
 *
 * This takes 10 stock prices and compares the  daily difference
 * to output the largest increase, the days on which they occured
 * and their respective values.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
 
import java.util.Scanner;

class Increase
{
    public static void main ( String [] args )
    {
        final int INPUT_NUMBER = 10;
        Scanner in = new Scanner ( System.in ) ;
        System.out.print ( "Input 10 stock prices to find the largest increase: " );

        // variables that need to be tracked and updated to be output for the user
        // include the largest increase, the high and low days and their day number.
        int increase = 0;
        int low_day = 0;
        int high_day = 0;
        int day1 = 0;
        int day2 = 0;

        
        int stock1 = in.nextInt( );

        // A for loop that will compare the difference between the next
        // integer recieved and update our output variables if needed.
        for ( int i = 1; i < INPUT_NUMBER - 1; i++  )
        {
             int stock2 = in.nextInt();
             int high = Math.max( stock1, stock2);
             int low = Math.min( stock1, stock2);
             int delta = ( high - low );
             
             if ( delta > increase )
             {
                 increase = delta;
                 high_day = high;
                 low_day = low;

                 // Does day1 equal 1 less than the itteration it is on? If so why?
                 // Here it represents the low daily value, when
                 // I would think it equals the high daily value.
                 
                 day1 = i;
                 day2 = i + 1;

             }
             stock1 = stock2;
        }
        
        // Test for no increase in stock value.
        if ( increase < 0)
        {
        	System.out.println( "I'm sorry, but there was no increase in your stock.");
        }
        else
		{
			// Can math not be done in between strings? I tried a day - 1 in the statement
        	// and kept recieving an error. It made for an extra variable.
            // Additionally is it considered bad style to use multiple print lines for the
            // same grammatical statement?
        	System.out.print ("Largest increase of " + increase);
			System.out.print (" from "+ low_day + " to " + high_day);
            System.out.print (" occured between day # " + day1 + " and day # " + day2 + ".\n" );
        } 
     }
}

