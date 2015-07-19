/**
 * RationalTest.java
 *
 * Problem 10
 *
 * This program uses the Rational class
 * to create and compare new rationals.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
class RationalTest
{
    public static void main (String [] args)
    {
        //creates new rationals from Rational.java
        Rational a = new Rational ( 8, 16);
        Rational b = new Rational ( 2, 3);
        
        //run method print result
        System.out.printf("It is " + a.lessThanRat(b) + " to say %d/%d is less than %d/%d.\n", 8,16,2,3);

        //To show false case
        Rational c = new Rational ( 2, 3);
        Rational d = new Rational ( 8, 16);

        System.out.printf("It is " + c.lessThanRat(d) + " to say %d/%d is less than %d/%d.\n", 2,3,8,16);
    }
}
