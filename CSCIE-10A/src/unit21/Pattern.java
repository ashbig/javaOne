/**
* Ashkan Bigdeli
* Cscie10a - P.Set #2 - Part 1
* TA: Mishal Rahman
* 10/14/13
*/

class Pattern
{
   public static final int HEIGHT = 5; // will determine how many lines are printed

   public static void main (String[] args)
   {
      for (int line = 1; line <= HEIGHT; line++)
      {
        for (int i = 0; i <= line -1; i++) // This loop will print out 1 fewer spaces than the line number it's on.
        {
          System.out.print (" ");
        }
        for (int i = 0; i <= HEIGHT -1 * line; i++)// The formula HEIGHT - (-1 x line) will cause the loop print one less star for every printed line
        {
           System.out.print ("*");
        }
      System.out.println();
      }
    }
}
