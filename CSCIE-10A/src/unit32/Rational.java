/**
 * Name.java
 *
 * Problem 10
 *
 * This class is used by RationalTest.java
 * to evalulate rationals. Taken from cscie10a
 * code directory and modified
 *
 * @editor Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
class Rational
{
    // instance variables
    private int numerator;
    private int denominator;

    // define constructors
    public Rational (int n, int d)
    {
       numerator = n;
       denominator = d;
    }

    public Rational (int n)
    {
       numerator = n;
       denominator = 1;
    }

    public Rational (Rational r)
    {
       numerator = r.numerator;
       denominator = r.denominator;
    }

    // Behavior (instance methods)
    public Rational mulRat (Rational multiplier)
    {
        int top = numerator * multiplier.numerator;
	    int bottom = denominator * multiplier.denominator;
	return new Rational (top, bottom);
    }

    public Rational addRat (Rational addend)
    {
       int top = this.numerator * addend.denominator +
                 this.denominator * addend.numerator;
       int bottom = denominator * addend.denominator;
       return new Rational (top, bottom);
    }
    
    public String toString()
    {
       return numerator + " / " + denominator;
    }


    /**
    * lessThanRat
    *
    * When called will cross multiply passed rational 1 vs passed rational 2
    * (i.e rational1.lessThanRat(rational2)  if the value of rational 1 is
    * less than rational 2 it will return true.
    *
    */
    public boolean lessThanRat ( Rational second )
    {
        int a = this.numerator * second.denominator;

        int b = this.denominator * second.numerator;
        

        // intialize boolean for return
        boolean value = false;

        if ( a < b)
        {
            value = true;
        }
        return value;
     }
 }   
