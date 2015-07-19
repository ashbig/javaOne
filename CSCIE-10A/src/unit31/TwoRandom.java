/**
 * TwoRandoms.java
 *
 * Problem 7
 *
 * This program generates two random numbers and
 * determines their difference to pick a winner.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class TwoRandom
{
   public static void main (String [] args)
   {
               // variables to obtain two random numbers between
               // 1 and 7 and determine their difference.
               int ran1 = (int) (Math.random() * 7) +1;
               int ran2 = (int) (Math.random() * 7) +1;
               System.out.printf("My random number is %d and your random number is %d!\n", ran1, ran2);
               int max = Math.max ( ran1, ran2);
               int min = Math.min (ran1, ran2);
               int delta = max - min;
               
               //if else to determine the winner
               if ( delta == 0 )
               {
                   System.out.println( "A tie!");
               }
               else if ( delta == 1 || delta == 3 || delta == 5)
               {
                   System.out.println( "You lose!");
               }
               else
               {
                   System.out.println ("You win!");
               }                      
   }
}
