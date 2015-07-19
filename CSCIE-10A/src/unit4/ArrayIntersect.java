/**
 * ArrayIntersect.java
 *
 * Problem 12
 *
 * EXTRA CREDIT
 *
 * This program evalutes two arrays to determine
 * if any common values exist between them.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
import java.util.Arrays;

class ArrayIntersect
{
    public static void main (String [] args)
    {
        //test case of 1 matching element
        int [] list = { 18, 7, 4, 24, 11 };
        int [] list2 = { 18, 8, 9, 22, 13 };

        System.out.println("The first array is: " + Arrays.toString( list ) );
        System.out.println("The second array is: " + Arrays.toString( list2 ) );
        System.out.println("It is " + intersect( list, list2 ) + " that these arrays contain common elements.");

        // test case of different length arrays & different matching indexes
        int [] list3 = { 18, 7, 4 };
        int [] list4 = { 8, 8, 22, 18 };

        System.out.println("\nThe first array is: " + Arrays.toString( list3 ) );
        System.out.println("The second array is: " + Arrays.toString( list4 ) );
        System.out.println("It is " + intersect( list3, list4 ) + " that these arrays contain common elements.");

        // test case of no matching elements
        int [] list5 = { 18, 7, 4 };
        int [] list6 = { 1, 8, 10, 22, 13 };

        System.out.println("\nThe first array is: " + Arrays.toString( list ) );
        System.out.println("The second array is: " + Arrays.toString( list6 ) );
        System.out.println("It is " + intersect( list5, list6 ) + " that these arrays contain common elements.");

       
       
   }
    /**
    * intersect
    *
    * This method will take an two arrays as parameters
    * and returns true if any common values exist.
    *
    * @param1 array to be analyzed.
    * @param2 array to be analyzed.
    */
    public static boolean intersect ( int [] arrayA, int [] arrayB )
    {
           // Only 1 array needs to set loop1 to determine commonalites.
           // Length of either array should be irrelevant when looking for commonalites.
           for (int i = 0; i < arrayA.length; i++)
           {
               // Compare the i element of array A to every element in array B
               // will return true if a common element exsists. 
               for (int j = 0; j < arrayB.length; j++)
               {
                  if ( arrayA[i] == arrayB[j] )
                  {
                    return true;
                  }
               }
              
           }
           // this return will only occur if there are no common elements
           return false;
    } 
}        
