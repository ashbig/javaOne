/**
 * ReverseTest.java
 *
 * Problem 7
 *
 * This program takes a string from the user
 * and reverses the input text. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class ReverseTest
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement to be reversed: ");
        String s = scanner.nextLine();
        printReverse(s);
    }

    /**
    * printReverse
    *
    * This method accepts a string argument and prints
    * the string characters from last to first.  
    *
    * @param1 string to be reversed.
    */

    public static void printReverse(String s)
    {
        int last_char = 1;

        //No output if String s is empty.
        if (!s.isEmpty())
        {
            // print starts at string length - 1. int last_char increments
            // to print the next char
            for ( int i = 0; i < s.length(); i++ )
            {
                System.out.print( s.charAt( s.length() - last_char) );
                last_char++;
            }
            System.out.println();
        }
     }
}

