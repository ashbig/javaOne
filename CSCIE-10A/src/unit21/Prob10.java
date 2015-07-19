/**
* Ashkan Bigdeli
* Cscie10a - P.Set #2 - Part 1
* TA: Mishal Rahman
* 10/14/13
*/

class Prob10
{
  public static void main (String [] args)
  {
    print4x8();
    print4x8();
  }
  static void print4x()
  {
     System.out.println ("Controlling complexity is the essence of programming!");
     System.out.println ("Controlling complexity is the essence of programming!");
     System.out.println ("Controlling complexity is the essence of programming!");
     System.out.println ("Controlling complexity is the essence of programming!");     
  }
  static void print4x8() 
  {
     print4x(); // creates a method in 8 statements that can be called by main twice to print 64x
     print4x();
     print4x();
     print4x();
     print4x();
     print4x();
     print4x();
     print4x();
  }
}
