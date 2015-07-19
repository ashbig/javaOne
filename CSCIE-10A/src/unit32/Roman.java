/**
 * Roman.java
 *
 * Problem 9
 *
 * EXTRA CREDIT
 *
 * This program takes a string of roman numerals from the user
 * and converts them to integers. 
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;

class Roman
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roman numerals: ");
        String input = scanner.nextLine();
        String roman = input.toUpperCase();
        
        System.out.println("Arabic form: " + converter (roman));


    }

    public static int converter( String roman )
    {
         int answer = 0;
        
        //No output if String input is empty.
        if (!roman.isEmpty())
        {
            for ( int i = 0; i < roman.length(); i++)
            {
                switch (roman.charAt(i))
                {
                case 'M': answer += 1000;
                break;
                case 'D': answer += 500;
                break;
                case 'C': answer += 100;
                break;
                case 'L': answer += 50;
                break;
                case 'X': answer += 10;
                break;
                case 'V': answer += 5;
                break;
                case 'I': answer += 1;
                }
            }

            // I could not get the switch statement to handle a string ( wanted an int)
            // ex: switch(roman) so I could use statement like case "M"
            



            //to account for cases like "IV" subtract twice the amount of the left numeral
            //because switch statement above will intially evaluate "IV" to 6.             
            if ( roman.contains ("IX") || roman.contains ("IV") )
            {
                answer -= 2;
            }
            if ( roman.contains ("CM") || roman.contains ("CD"))
            {
                answer -= 200;
            }       
            if ( roman.contains ("XC")|| roman.contains("XL"))
            {
                answer -= 20;
            }

         }
        return answer;
     }
}



