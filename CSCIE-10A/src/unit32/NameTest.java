/**
 * NameTest.java
 *
 * Problem 11
 *
 * This program creates various forumlations of
 * a person's name using the Name class.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class NameTest
{
    public static void main (String [] args)
    {
        //Creating a new name and running method examples of each output
        // from Name.java
        Name teacher  = new Name ("Henry", 'H', "Leitner");
        System.out.println ( teacher.getNormalOrder( ) );
        System.out.println ( teacher.getReverseOrder( ) );
        System.out.println ( teacher.getInitials( ) );

        Name tf  = new Name ("Mishal", "Rahman");
        System.out.println ( tf.getNormalOrder( ) );
        System.out.println ( tf.getReverseOrder( ) );
        System.out.println ( tf.getInitials( ) );
    }
}

