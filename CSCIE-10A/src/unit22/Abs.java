/**
 * Abs.java
 *
 * Problem 11
 *
 * This program passes an two integers to the abs method
 * and returns the largest absolute value of the integers. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class Abs
{
    public static void main (String [] args )
    {
        //prints the return value of method      
        System.out.println ("The first example absolute value is: " + largerAbsValue ( 11, 2*3 - 5 ));
        System.out.println ("The second example absolute values is: " + largerAbsValue ( 4, -5 ));
    }

/**
 * abs
 *
 * This method calculates  and returns
 * the largest absolute value. 
 *
 * @param1 a represents the first integer.
 * @param2 b represents the second integer.
 */

    static int largerAbsValue ( int a, int b )
    {
         // Variable to store highest of two absolutes
         // and if statements to turn negatives positive.
         int largest_value = 0;
         
         if ( a < 0 )
         {
            a = a * -1;
         }
         if ( b < 0 );
         {
            b = b * -1;
         }
         if ( a >= b )
         {
            largest_value = a;
         }
         else
         {
            largest_value = b;  
         }
         return largest_value;
    }
    
}

