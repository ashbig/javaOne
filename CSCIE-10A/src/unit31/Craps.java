/**
 * Craps.java
 *
 * Problem 7
 *
 * This program plays a simplified version of casino craps
 * using Math.random to determine dice rolls.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class Craps
{
   public static void main (String [] args)
   {       
           // intialize the first roll
           int die1 = (int) (Math.random() * 6) +1;
           int die2 = (int) (Math.random() * 6) +1;
           int roll1 = die1 + die2;
           System.out.printf ( "Computer rolls a %d and a %d, for a total of %d.\n", die1, die2, roll1); 



           while ( roll1 <4 || roll1 > 10 || roll1 == 7)
           {
               // I debated making dice roll a method, but when I brought in a second variable to track
               // roll two I opted against it. Let me know what you think. The method the pset used
               // didnt really make sense to me (explain?) to use directly so I didn't.
               die1 = (int) (Math.random() * 6) +1;
               die2 = (int) (Math.random() * 6) +1;
               roll1 = die1 + die2;
               System.out.printf ( "Computer rolls a %d and a %d, for a total of %d.\n", die1, die2, roll1);   

           }

           int point = roll1;
           System.out.printf ("%d is now the established POINT.\n", point);
           int roll2 = 0;


           // I hated my logic for this loop. I was certain there as a better way, but this
           // is what I got to work. Please explain a more elequent approach if there is one. 
           while ( point != roll2)
           {
               die1 = (int) (Math.random() * 6) +1;
               die2 = (int) (Math.random() * 6) +1;
               roll2 = die1 + die2;
               System.out.printf ( "Computer rolls a %d and a %d, for a total of %d.\n", die1, die2, roll2);
               
               if( roll2 == 7)
               {
                  System.out.println("YOU LOSE");
                  break;
               }
           }
           if( point == roll2)
           {
               System.out.println("YOU WIN!");
           }              
   }
}
// This program caused me more problems than I care to admit. 
// I tried do-whiles, if-elses and this is what I settled on.
// Not a fan myself. 
