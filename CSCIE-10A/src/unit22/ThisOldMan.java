/**
 * ThisOldMan.java
 *
 * Problem 6
 *
 * This program passes an integer and string parameter to
 * the verse method to complete the  This Old Man nursey ryhme.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class ThisOldMan
{
    public static void main (String [] args )
    {
        verse ( 1, "on my drum;" );
        chorus();
        verse ( 2, "on my shoe;" );
        chorus();
        verse ( 3, "on my tree;" );
        chorus();
        verse ( 4, "on my door;" );
        chorus();
        verse ( 5, "on my hive;" );
        chorus();
        verse ( 6, "on my sticks;" );
        chorus();
        verse ( 7, "on my heaven;" );
        chorus();
        verse ( 8, "on my gate;" );
        chorus();
        verse ( 9, "on my spine;" );
        chorus();
        verse ( 10, "on my hen;" );
        chorus();      
    }

/**
 * verse
 *
 * This method prints an integer and string parameter.
 *
 * @param1 n represents the verse number.
 * @param2 s represents the verse lyric.
 */

    static void verse ( int n, String s )
    {
    	System.out.println("This old man, he played " + n +".\nHe played nick-nack " + s);
    }

/**
 * chorus
 *
 * This method simplifies printing the chorus
 */

    static void chorus ()
    {
        System.out.println ( "With a nick-nack paddy-whack, give the dog a bone,\nThis old man came running home.\n");
    } 
}

