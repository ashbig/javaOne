/**
 * PizzaTest.java
 *
 * Problem 8
 *
 * This program creates a new pizza and caclulates
 * its associated costs. Taken directly from pset. 
 *
 * @user Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class PizzaTest
{
    public static void main (String [] args)
    {
        Pizza myPizza = new Pizza ("Pepperoni", 8, 10.50, 10);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                           " per slice.\n", myPizza.getName(),
                           myPizza.areaPerSlice());

        System.out.printf( "One slice costs $%.2f, which comes" +
                           " to $%.3f per square inch.\n",
                            myPizza.costPerSlice(),
                            myPizza.costPerSquareInch());

        Pizza pineapple = new Pizza ("Pineapple & Pepper", 10, 11.95, 8);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                           " per slice.\n", myPizza.getName(),
                           myPizza.areaPerSlice());

        System.out.printf( "One slice costs $%.2f, which comes" +
                           " to $%.3f per square inch.\n",
                            myPizza.costPerSlice(),
                            myPizza.costPerSquareInch());
    }
}

