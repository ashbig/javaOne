/**
 * Charity.java
 *
 * Problem 5
 *
 * This program designates donors based upon contributions using a
 * static method that has donor contribution passed as a paramater.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class Charity
{
    public static void main ( String [] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.print ( "Enter the amount of contribution: " );
        double donation = in.nextDouble();
      
        if ( donation > 0.00 )
        {
           donor( donation );         
        }
        else if ( donation < 0.00 ) //check for negative donats
        {
           System.out.println ( "We're sorry. We only accept donations." );
        }
        else // check for zero donations
        {
          System.out.println ( "We're sorry. You need to be contribute to be considered." );
        }
    } 

/**
 * donor
 *
 * This method desginates the integer variable donation
 * using nested if-else statements.
 * 
* @param1 represents the donation amount .
 */

    static  void donor ( double donation )
    {
        if ( donation > 999.99)
        {
           System.out.println ("Thank you benefactor!");
        }
        else if ( donation < 1000.00 && donation > 499.99)
        {
           System.out.println( "Thank you patron!");
        }
        else if( donation < 500.00 && donation > 99.99)
        {
           System.out.println ( "Thank you supporter!" );
        }
        else if ( donation < 100.00 && donation > 14.99 )
        {
           System.out.println ( "Thank you friend!");
        }
        else
        {
           System.out.println ( "Cheapskate!");
        }
   }
}  
