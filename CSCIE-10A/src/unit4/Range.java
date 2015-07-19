/**
 * Range.java
 *
 * Problem 6
 *
 * This program determines how many elements
 * of an array fall within a certain range. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.*;

class Range
{
    public static void main (String [] args)
    {
        //test case 1
    	int [] test1 = { 14, 1, 7, 22, 17, 36, 7, -43, 5 };
	    int min = 4;
	    int max = 17;
        
	    System.out.print("The given array is: " + Arrays.toString(test1));
	    System.out.println("\nThere are " + countInRange( test1, min, max ) + " elements that fall between " 
			  + min + " and " + max + "." );

	   //test case 2
    	int [] test2 = { 1, 1, 2, 2, 8, 8, 14, 14, 15, 15 };
	    min = 2;
	    max = 14;

	    System.out.print("The given array is: " + Arrays.toString(test2));
        System.out.println("\nThere are " + countInRange( test2, min, max ) + " elements that fall between " 
			              + min + " and " + max + "." );

 
    }

    /**
    * countInRange
    *
    * This method returns the count of how many elements from the array
    * fall between the given minimum and maxium range. 
    * Duplicates are also counted.  
    *
    * @param1 array to be analyzed
    * @param2 integer a minimum of range
    * @param3 integer b maximum of range
    */

    public static int countInRange ( int [] array, int a, int b )
    {
	    int count = 0;

	    for ( int i = 0; i < array.length; i++ )
	    {
           // determine if between max and min. incremenet if so
	       if ( (array[i] >= a ) && ( array[i] <= b ) )
	       {
		      count ++;
	       }
        }
	    return count;
    }
}

