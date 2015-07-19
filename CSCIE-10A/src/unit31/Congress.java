/**
 * Congress.java
 *
 * Problem 9
 *
 * This program passes an two integers to boolean methods
 * to determine if a candidate is eligible for congress.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

import java.util.Scanner;


class Congress
{
    public static void main (String [] args )
    {
        System.out.println ("\nCONGRESS ELIBILITY\n\n");
        Scanner in = new Scanner ( System.in );
        System.out.print ("Enter age of candidate: ");
        int age = in.nextInt();
        System.out.print ("Enter year of U.S Citizenship: ");
        int lengthOfCitizenship = in.nextInt();


        // if else staments that call the necessary methods and pass integers of age and citzenship
        if ( isEligibleForHouse( age, lengthOfCitizenship) && isEligibleForSenate( age, lengthOfCitizenship))
        {
           System.out.println ("\nThe candidate is eligible for election to both the House of Representatives and the Senate.\n");
        }
        else if (isEligibleForHouse(age, lengthOfCitizenship) && !isEligibleForSenate( age, lengthOfCitizenship))
        {
            System.out.println ("\nThe candidate is eligible for election to the House of Representatives but is NOT eligible for election to the Senate.\n");
        }
        else
        {
            System.out.println ("\nThe candidate is NOT eligible for election to either the House of Representatives or the Senate.\n");
        }
    }

    /**
    * eligibleForSenate
    *
    * This method takes two integer paramaters
    * and return true if they meet House requirements.
    *
    * @param1 age represents the candidate age .
    * @param2 lengthOfCitizenship represents the candidates years as a citizen.
    */

    public static boolean isEligibleForHouse ( int age, int lengthOfCitizenship )
    {        
        return ( age > 24 && lengthOfCitizenship > 6);
    }

    /**
    * eligibleForHouse
    *
    * This method takes two integer paramaters
    * and return true if they meet Senate requirements.
    *
    * @param1 age represents the candidate age .
    * @param2 lengthOfCitizenship represents the candidates years as a citizen.
    */

    public static boolean isEligibleForSenate ( int age, int lengthOfCitizenship )
    {        
         return ( age > 34 && lengthOfCitizenship > 9);
    }
}  
