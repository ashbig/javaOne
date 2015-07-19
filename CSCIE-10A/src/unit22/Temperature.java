/**
 * Temperature.java
 *
 * Problem 12
 *
 * This program takes the farenheit temperature as input
 * and passes the paramter to a mtehod which tells the user
 * which sport(s) are best for that temperature.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class Temperature
{
    public static void main ( String [] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.print ( "OK, mate, what's the Fahrenheit temperature outside? "  );
        int temp = in.nextInt();
      
        if ( temp > -21 && temp < 111  )
        {
           System.out.println ( "Looks good for...");
           sports( temp );
        }
        else //check for appropriate input 
        {
           System.out.println ( "I'm sorry, sports can't be played at that temperature." );
        }
    } 

/**
 * sports
 *
 * This method takes the temperature as a paramater
 * and uses testing if statements to determine
 * the best sport for that temperature.
 *   
 * @param1 int temp represents the user input temperature .
 */


    // Some conditions overlapped, and some appropriate in a
    // specific range,so sequential if statements were used.
    static  void sports ( int temp )
    {
        if ( temp >= 75)
        {
           System.out.println ("Swimming");
        }
        if ( temp > 60 && temp <= 85 )
        {
           System.out.println( "Tennis");
        }
        if ( temp > 32 && temp <= 70 )
        {
           System.out.println ( "Soccer");
        }
        if( temp > 10 && temp <=32 )
        {
           System.out.println ( "Skiing" );
        }
        if (temp <= 10 )
        {
           System.out.println ( "Checkers");
        }  
    }
}  
