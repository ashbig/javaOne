/**
 * MagicSquare.java
 *
 * Problem 10
 * EXTRA CREDIT
 *
 * This program takes 9 integers from the user and determines if
 * the digits can form a magic square.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;


class MagicSquare
{
    public static void main (String [] args )
    {
        // Is there any way to shorten any of the following code down?
        System.out.println ("Enter 9 digits to see if they form a magic square! Press enter after each digit!");
        Scanner in = new Scanner ( System.in );
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int four = in.nextInt();
        int five = in.nextInt();
        int six = in.nextInt();
        int seven = in.nextInt();
        int eight = in.nextInt();
        int nine = in.nextInt();

        //logging the sum of rows, columns and diagonal
        int rowsum1 = one + two + three;
        int rowsum2 = four + five + six;
        int rowsum3 = seven + eight + nine;
        int colsum1 = one + four + seven;
        int colsum2 = two + five + eight;
        int colsum3 = three + six + nine;
        int diagsum1 = one + five + nine;
        int diagsum2 = three + five + seven;

        // I tried to think of a more elequent way, but this is the code I landed on. If there is a better way do explain.
        if ( ( rowsum1 == rowsum2 ) && ( rowsum1 == rowsum3 ) && ( rowsum2 == rowsum3 ) && ( rowsum1==colsum1 ) && ( rowsum1==colsum2 ) && ( rowsum1==colsum3 ) && ( rowsum1== diagsum1 ) && ( rowsum1 == diagsum2 ) )
        {
            System.out.println( "You made a magic square!");
        }
        else
        {
           System.out.println( "Focus! That's not a magic square!");
        }
    }
}  
