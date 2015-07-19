/**
 * License.java
 *
 * Problem 8
 *
 * EXTRA CREDIT
 *
 * This program uses type-casting to print out the
 * desired number of license plate numbers with 3 
 * letters and three characters. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class License
{
    public static void main (String [] args)
   {       
       final int licenses = 20;

      for ( int i= 0; i <= 20; i++)
      {
          licensePlates();
      }
   }

     /**
     * licensePlates
     *
     * This method will print out a random generated 3 digit 
     * and 3 character(via type-casting) license plate
     *
     */
     public static void licensePlates()
     {
           int one = (int) (Math.random() * 9) +1;
           int two = (int) (Math.random() * 9) +1;
           int three = (int) (Math.random() * 9) +1;

           // turning random integers into char's using the ascii table
           int char1 = (int) (Math.random() * 26)+ 65;
           int char2 = (int) (Math.random() * 26)+ 65;
           int char3 = (int) (Math.random() * 26)+ 65;
           char A = (char) char1;
           char B = (char) char2;
           char C = (char) char3;

           System.out.printf("%d%d%d-%s%s%s\n", one, two, three, A, B, C);
     }
}
    
