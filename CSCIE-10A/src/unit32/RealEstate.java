/**
 * RealEstate.java
 *
 * Problem 9
 *
 * This program takes a string from the user
 * and removes all vowels except for an intial vowel.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class RealEstate
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Real Estate ad: ");
        String ad = scanner.nextLine();
        typeCopy(ad);
    }


    /**
    * typeCopy
    *
    * This method accepts a string argument and prints
    * and removes all vowels except the intial vowel in a word.
    *
    * @param1 string to be manipulated.
    */

    public static void typeCopy(String ad)
    {

        //No output if String ad is empty.
        if (!ad.isEmpty())
        {
            for ( int i = 0; i < ad.length(); i++)
            {
     
                switch(ad.charAt(i))
                {
                case ' ':
                System.out.print(ad.charAt(i));

                   // checking if the previous character is a space followed
                   // by a vowel. if so print it to keep intial vowel intact.
                    switch( ad.charAt(i + 1))
                    {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.print(ad.charAt(i + 1));
                    break;
                    }
                break;
                

                //cases to remove vowels
                case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.print("");
                break;

                //if case is not a space, space followed by a vowel
                //or a vowel it will be printed 
                default:
                System.out.print(ad.charAt(i));
               }
            }
        }
        System.out.println();
     }
}
