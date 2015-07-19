/**
* Ashkan Bigdeli
* Cscie10a - P.Set #2 - Part 1
* TA: Mishal Rahman
* 10/14/13
*/

class Drawing
{
   public static void main (String [] args)
   {
      top(); // Played with using more methods and perhaps a loop, but this seemed easiest in the end.
      bottom();
      System.out.println();
      middle();
      System.out.println();
      top();
      bottom();;
      System.out.println();
      middle();
      bottom();
      System.out.println();
      top();
      middle();
      bottom();    
   }
   static void top()
   {
      System.out.println ("  _______  ");
      System.out.println (" /       \\");
      System.out.println ("/         \\");
   }
   static void bottom()
   {
     System.out.println ("\\         /");
     System.out.println (" \\_______/");
   }
   static void middle()
   {
      System.out.println ("_\"_\'_\"_\'_\"_");
   }
}

