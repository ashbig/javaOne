/**
 * Sum.java
 *
 * Problem 15
 *
 * This program evalutes two arrays and creates
 * a new array of their sum's at each index. 

 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
import java.util.Arrays;

class Sum
{
    public static void main (String [] args)
    {

        double [] a0 = {4.5, 5.0, 6.6};
        double [] a1 = {1.1, 3.4, 0.5};
        System.out.println("Array 1 is : " + Arrays.toString ( a0 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a1 ) );
        System.out.println("The summed array is: " + Arrays.toString( arraySum (a0, a1) ) );

        double [] a2 = {1.8, 2.9, 9.4, 5.5};
        double [] a3 = {2.4, 5.0};
        System.out.println("Array 1 is : " + Arrays.toString ( a2 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a3 ) );
        System.out.println("The summed array is: " +  Arrays.toString( arraySum (a2, a3) ) );

        // the last digit prints extra values. Not sure why.
        double [] a4 = {4.5, 2.8, 3.4, 0.8};
        double [] a5 = {1.4, 8.9, -1.0, 2.3};
        System.out.println("Array 1 is : " + Arrays.toString ( a4 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a5 ) );
        System.out.println("The summed array is: " + Arrays.toString( arraySum (a4, a5) ) );

        double [] a6 = {2.4, 3.8};
        double [] a7 = {0.2, 9.2, 4.3, 2.8, 1.4};
        System.out.println("Array 1 is : " + Arrays.toString ( a6 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a7 ) );
        System.out.println("The summed array is: " + Arrays.toString( arraySum (a6, a7) ) );
        
        double [] a8 = {1.0, 2.0, 3.0};
        double [] a9 = {4.0, 5.0};
        System.out.println("Array 1 is : " + Arrays.toString ( a8 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a9 ) );
        System.out.println("The summed array is: " + Arrays.toString( arraySum (a8, a9) ) );
        
        double [] a10 = {};
        double [] a11 = {42.0};
        System.out.println("Array 1 is : " + Arrays.toString ( a10 ) );
        System.out.println("Array 2 is : " + Arrays.toString ( a11 ) );
        System.out.println("The summed array is: " + Arrays.toString( arraySum (a10, a11) ) );
       
    }
    /**
    * arraySum
    *
    * This method will take an two arrays as parameters
    * and returns returns an array of their sum's at each index
    *
    * @param1 array to be summed.
    * @param2 array to be summed.
    */
    public static double [] arraySum( double [] arrayA, double [] arrayB )
    {

        // Copy the smaller of the two arrays to a new array
        // of the larger length.
        if ( arrayA.length <= arrayB.length )
        {
            arrayA = Arrays.copyOf ( arrayA, arrayB.length );
        }
        else if ( arrayB.length < arrayA.length )
        {
            arrayB = Arrays.copyOf ( arrayB, arrayA.length );
        }
     
         // adding the values of each array and storing in a new array
         double [] sum = new double [ arrayA.length ];

         for (int i = 0; i < sum.length; i++)
         {
             sum [i] = arrayA[i] + arrayB[i];
         }
         return sum;
    } 
}  
