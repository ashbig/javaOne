/**
 * SeasonTest.java
 *
 * Problem 6
 *
 * This program will use the season method to 
 * determine what season a perticular date is in.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */


class SeasonTest
{
   public static void main (String [] args)
   {
       //Running season method for Winter.
       System.out.println(season( 12, 16 ));
       System.out.println(season( 1, 30 ));
       System.out.println(season( 3, 15 ));

       //Running season method for Spring.
       System.out.println(season( 3, 16 ));
       System.out.println(season( 5, 30 ));
       System.out.println(season( 6, 15 ));

       //Running season method for Summer.
       System.out.println(season( 6, 16 ));
       System.out.println(season( 8, 30 ));
       System.out.println(season( 9, 15 ));

       //Running season method for Fall.
       System.out.println(season( 9, 16 ));
       System.out.println(season( 10, 30 ));
       System.out.println(season( 12, 15 ));

       //Running season method for imposible.
       System.out.println(season( 15, 3 ));
       System.out.println(season( 11, 31 ));
       System.out.println(season( 2, 29 ));
       System.out.println(season( 5, 88 ));
   }

    /**
    * season
    *
    * This method accepts two integers. Month first then day.
    * Based upon the date the appropriate season is returned as a String.
    *
    * @param1 month represent the month of the year.
    * @param2 day represents the day of the month
    */
   public static String season( int month, int day)
   {
            System.out.print( month + "/" + day + " is ");

            // Lecture made it seem as if switch statements could be used to check the days of the month,
            // but I had trouble implementing that.



            // Outer if/else to determine season. nested if's check for valid days in the month.
            if ( (month == 1) || (month == 2 ) )
            {
                if ( (month == 1 && day > 31) || ( month == 2 && day > 28 ))
                {
                    return "an impossible date.";
                }
                return "in Winter.";
            }

            else if ( month == 12 && day >= 16 )
            {
                if ( day > 31 )
                {
                    return "an impossible date.";
                }
                return "in Winter.";
            }

            else if ( month == 3 && day <= 15 )
            {
                return "in Winter.";
            }

            else if ( ( month == 4 ) || ( month == 5 ))
            {
                if ( (month == 4 && day > 30 ) || ( month == 5 && day > 31 ) )
                {
                    return "an impossible date.";
                }
                return "in Spring.";
            }

            else if ( month == 3 && day >= 16 )
            {
                if ( day > 31 )
                {
                    return "an impossible date.";
                }
                return "in Spring.";
            }

            else if ( month == 6 && day <= 15 )
            {
                return "in Spring.";
            }

            else if ( ( month == 7 ) || ( month == 8 ))
            {
                if ( day > 31 )
                {
                    return "an impossible date.";
                }
                return "in Summer.";
            }

            else if ( month == 6 && day >= 16 )
            {
                if ( day > 30 )
                {
                    return "an impossible date.";
                }
                return "inSummer.";
            }

            else if ( month == 9 && day <= 15 )
            {
                return "in Summer.";
            }

            else if ( ( month == 10 ) || ( month == 11 ))
            {
                if ( ( month == 10 && day > 31 ) || ( month == 11 && day > 30) )
                {
                    return "an impossible date.";
                }
                return "in Fall.";
            }

            else if ( month == 9 && day >= 16 )
            {
                if ( day > 30 )
                {
                    return "an impossible date.";
                }
                return "in Fall.";
            }

            else if ( month == 12 & day <= 15 )
            {
                return "in Fall.";
            }
            else return "an impossible date.";
   }
}
