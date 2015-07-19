/**
 * Bool.java
 *
 * Problem 7
 *
 * This program takes an array of booleans and determines
 * how many consecutive true values occur. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
import java.util.*;

class Bool
{
    public static void main (String [] args)
    {
        boolean [] test1 = { false, true, true, true };

        boolean [] test2 = { true };

        boolean [] test3 = { true, true, true ,true, false };

        fullOfBool( test1 ); 
        fullOfBool( test2 );
        fullOfBool( test3 );
    }

    /** 
    * fullOfBool
    *
    * This method will take a boolean array arguement
    * AND PRINTS the first, last and number of consecutive true
    * occurences. 
    *
    * @param1 array a represents the blooean area to be evaluated. 
    */
    public static void fullOfBool ( boolean [] array )
    {
       
        // finds the first index of true
        int first = 0;
        
        // tracks the index of the first and last true and total
        int i_first = 0;
        int i_last = 0;
        int total = 0;

        for ( int i = 0; i < array.length; i++ )
        {
            if ( first == 0 )
            {
               if ( array [i] == true )
               {
                  first = 1;
                  i_first = i;
                  total ++;
               }
            }
         
            else if ( array [i] == true )
            {
                 total ++;
                 i_last = i;
            }
         }

        // You instructed not to print in the method, but the Pset seemed
        // to ask us to and thats why I did. Otherwise I would have made a class.
        System.out.println( Arrays.toString ( array ) );
        System.out.println( "There are " + total + " consecutive true values." );
        System.out.println( "They are located at index " + i_first + " and " + i_last +".\n");
     }
}
        

