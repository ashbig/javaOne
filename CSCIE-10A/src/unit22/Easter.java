/**
 * Easter.java
 *
 * Problem 7
 *
 * This program will tell you what day easter is when the user
 * inputs a year.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class Easter
{
    public static void main ( String [] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.print( "For what year would you like to know the date of easter? " );
        int year = in.nextInt();
        computeEaster ( year );
    }    
 

/**
 * computeEaster
 *
 * This method will caclulate what the date of easter is
 * when passed the year paramater by main.
 *
 * @param1 y represents the user input for year .
 */

    static  void computeEaster ( int y )
    {
       int a = y % 19;
       int b = y / 100;
       int c = y % 100;
       int d = b / 4;
       int e = b % 4;
       int g = (8 * b + 13) / 25;
       int h = ( 19 * a + b - d - g + 15) % 30;
       int j = c / 4;
       int k = c % 4;
       int m = ( (a + 11 * h) / 319);
       int r =  (2 * e + 2 * j - k - h + m + 32) % 7;
       int n = (h - m + r + 90) / 25; // end result for month
       int p = (h - m + r + n + 19) % 32; //end result for day


       // The following if statments will print the month name for the M/D/Y date format.
       // Easter typically falls in April, but March and May are included as safeguards. 
       // Did not like the if/else logic here, used only ifs. Are sequential ifs frowned upon ?
       if ( n == 4 )
       {
           System.out.println( "April " + p + ", " + y );
       }
       if ( n == 3 )
       {
           System.out.println( "March " + p + ", " + y );
       }
       if ( n == 5)
       {
           System.out.println( "May " + p + ", " + y );
       }
   }
}
