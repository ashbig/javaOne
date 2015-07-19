/**
 * Name.java
 *
 * Problem 11
 *
 * This class is used by NameTest.java to 
 * output different naming schemes.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class Name
{
    //instance variables
    private String first;
    private char initial;
    private String last;


    /**
    * Name
    *
    * This is a constructor method that takes 3 paramaters
    * to construct a new name.
    *
    * @param1 String fname represents the first name.
    * @param2 char i represents the middle intial.
    * @param3 String lname represents the last name.
    *
    */

    Name (String fname, char i, String lname)
    {
        first = fname;
        initial = i;
        last = lname;
    }

    /**
    * Name
    *
    * Overloads FullName constructor method to take 2 paramaters
    * to construct a new name.
    *
    * @param1 String fname represents the first name.
    * @param2 String lname represents the last name.
    *
    */

    Name (String fname, String lname)
    {
        first = fname;
        last = lname;
    }

    /**
    * getNormalOrder
    *
    * This method returns (string) the "normal" order
    * of a full name. EX: "First MiddleIntial. Last".
    *
    */
    public String getNormalOrder( )
    {   
        //Creating blank string so we can adjust if "." is needed
        String normal = "";

        //Probably not the best way to remove the period???
        //tried using "initial != null" compiler complained
        if (initial > 0 )
        {
            normal = first + " " + initial + ". " + last;
        }
        else
        {
            normal = first + " " + last;
        }
        return normal;

    }

    /**
    * getReverseOrder
    *
    * This method returns (string) the "reverse" order
    * of a full name. EX: "Last, First MiddleIntial."
    *
    */
    public String getReverseOrder( )
    {
        //Creating blank string so we can adjust if "." is needed
        String reverse = "";

        if ( initial > 0 )
        {
            reverse = last + ", " + first + " " + initial + ".";
        }
        else
        {
            reverse = last + ", " + first;
        }   
        return reverse;

    }

    /**
    * getInitials
    *
    * This method returns (string) the "initials" 
    * of a full name. EX: "FIL" 
    *
    */
    public String getInitials( )
    {
        //There should no reason a first letter is not capitlized in a name
        //added toUpper to return as failsafe. 
        char fInitial = first.charAt(0);
        char lInitial = last.charAt(0);

        //more refined way to right code below?
        String initials = fInitial + "" + initial + "" + lInitial;

        
        return initials.toUpperCase ( );
    }
}

