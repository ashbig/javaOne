/**
 * ReapeatedDigits.java
 *
 * Problem 11
 *
 * This program takes integers from the user and
 * determines if how many integers occur between 0-9.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
import java.util.*;

class RepeatedDigits
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print ( "Please Enter an integer(s): " );
        
        // I tried several ways to solve this as an integer
        // but user input as a String saves having to worry about negative values.
        String input = scanner.nextLine();

        // this array is only used to make the program more aesthetically pleasing
        int [] digit = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Digit:      " + Arrays.toString( digit ) ); 

        System.out.println("Occurences: " +  Arrays.toString(occurences (input) ));
       
   }

    /**
    * occurences
    *
    * This method will take a string arguement
    * and evaluate character(as integers) to evaluate.
    * Returns number of occurences 0-9 as an array. 
    *
    * @param1 String a represents the user input
    */
    public static int [] occurences ( String a )
    {
        int [] occurences = new int [10];
        
        for (int i = 0; i < a.length(); i++)
        {
           // Switch will increment appropriate whenever appropriate integer
           // is identified. 
           switch (a.charAt(i))
           {
               case '0': occurences [0]++;
               break;
               case '1': occurences [1]++;
               break;
               case '2': occurences [2]++;
               break;
               case '3': occurences [3]++;
               break;
               case '4': occurences [4]++;
               break;
               case '5': occurences [5]++;
               break;
               case '6': occurences [6]++;
               break;
               case '7': occurences [7]++;
               break;
               case '8': occurences [8]++;
               break;
               case '9': occurences [9]++;
               break;
           }
        }
        return occurences;
     }
}   
           







   
