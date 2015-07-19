/**
* Ashkan Bigdeli
* Cscie10a - P.Set #2 - Part 1
* TA: Mishal Rahman
* 10/14/13
*/

class Prob11
{
   public static void main (String [] args)
   {
      drawfigure();
   }
   static void drawfigure()
   {
       final int N=5;
       for ( int line = 1; line <= N; line++)
       {
          for (int i= 1; i <= 20 - 4 * line; i++) // 20 - (- 4 x line) forumala to print "/" 16 times, decremeanting by 4 for each itteration of the loop (5)
          {
            System.out.print("/");
          }
          for (int i= 1; i <= ((line - 1) * 8); i++)// using line-1 to print 8 stars, increasing by 8 for each itteration starting from line 2 
          {
            System.out.print("*");
          } 
          for (int i= 1; i <= 20 -4 * line; i++) // same math as in line 19, only using the "\"
          {
            System.out.print("\\");
          }
          System.out.println();
       }
   }
}
