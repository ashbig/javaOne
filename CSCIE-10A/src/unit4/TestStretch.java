/**
 * TestStretch.java
 *
 * Problem 8
 *
 * This program takes an array and creates
 * a new array that contains a pair of integers
 * each half the original.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Arrays;

class TestStretch
{
    public static void main (String [] args)
    {
        int [] list = { 18, 7, 4, 24, 11};
        int [] list2 = stretch (list);

        System.out.println("The original array is: " + Arrays.toString( list ) );
        // the above prints [18, 7, 4, 24, 11]

        System.out.println("Which stretches to: " + Arrays.toString( list2 ) );
        // the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]

       
   }

    /**
    * stretch
    *
    * This method will take an array parameter and creates
    * a new array that contains a pair of integers, each half
    * of the original. 
    *
    * @param1 array to be stretched.
    */
    public static int [] stretch ( int [] array )
    {
        int [] result = new int [ array.length * 2];
        
        for (int i = 0; i < array.length; i++)
        {
            // To determine if the integer is even,
            // else it is odd.
            if ( array[i] % 2 == 0 )
            {
                //i *2 is the relationship of the first integer 
                //of the pair to be placed in the new array.
                result[i * 2] = array [i] / 2 ;

                // i * 2 + 1 is the relationship of the second integer
                // of the array to be placed in the new array. 
                result[(i * 2) + 1] = array [i] / 2;
            }
            else
            {
               result[i * 2] = array [i] / 2 + 1;
               result[(i * 2) + 1] = array [i] / 2;
            }

        }
        return result;
    }
 }                
