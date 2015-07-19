/**
 * MindTheGap.java
 *
 * Problem 9
 *
 * This program will determine the minimum gap
 * between elements of an array.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Arrays;

class MindTheGap
{
    public static void main (String [] args)
    {
        int [] list = { 1, 3, 6, 7, 12};

        System.out.println( Arrays.toString( list ) );

        // prints the minimum gap of array list
        System.out.println( "The minimum gap is: " + minGap( list ) );

        int [] list2 = { 3, 5, 11, 4, 8};
        System.out.println( Arrays.toString( list2 ) );
        System.out.println( "The minimum gap is: " + minGap( list2 ) );

        int [] list3 = { 1, 2};
        System.out.println( Arrays.toString( list3 ) );
        System.out.println( "The minimum gap is: " + minGap( list3 ) );

        int [] list4 = { 3, 3, 3, 3, 3, 3, 3, 3,};
        System.out.println( Arrays.toString( list4 ) );
        System.out.println("The minimum gap is: "  + minGap( list4 ) );
       
   }

    /**
    * minGap
    *
    * This method will take an array parameter and creates
    * a new array of the value of their differences.
    * Array will be sorted and the lowest value returned. 
    * Example of min value determination: index 2 - index 1 
    *
    * @param1 array to be analyzed.
    */
    public static int minGap ( int [] array )
    {
        // Check to determine array is larger than 2 elements
        if ( array.length <= 2)
        {
            System.out.println( "We can only evaluate arrays that have more than two elements." );
	        return 0;
        }

        int [] gap_values = new int [ array.length -1 ];

        // Using arrray - 1 to keep boundry as the last index will not be evaluated.
        // Loop will calcuate all differences and store in a new array.
        for (int i = 0; i < array.length - 1; i++)
        {
            gap_values [i] = ( array [i +1] ) - array [i];
        }
    
        // Array will be sorted so smallest value is first.
        // Set integer gap to the smallest value (index [0]).
        Arrays.sort(gap_values);
        int gap = gap_values[0];

        return gap;
    }
 }                
