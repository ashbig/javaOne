/**
 * Powers.java
 *
 * Problem 10
 *
 * EXTRA CREDIT
 *
 * This program takes a user input and passes it to the printPowersof2
 * method to print the powers of two input number of times.
 * 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class Powers
{
    public static void main ( String [] args )
    {
    	Scanner in = new Scanner ( System.in );
        System.out.print ( "Enter how many powers of 2 you would like: ");
        int input = in.nextInt( );
        printPowersof2( input ) ;
    }

/**
 * printPowersof2
 *
 * This method takes the integer and prints the
 * powers of 2 that many times
 * 
* @param1 represents the input number.
 */
    
    static void printPowersof2 ( int input )
    {
        // Variable to itterate the power of 2
        // starting at 1 and continuing to input. 
        int ans = 1;

        for ( int i = 0; i < input; i++ )
        {
            // 2 is the power 
            ans *= 2; 
            System.out.print ( ans + " ");
        }
        System.out.println();
    }  
}
