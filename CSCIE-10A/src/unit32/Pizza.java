/**
 * Pizza.java
 *
 * Problem 9
 *
 * This class is used by the program PizzaTest.java
 * to construct new pizza's and associated costs.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */

class Pizza
{

    //instance variables
     private String myPizza;
     private int inches;
     private int slices;
     private double cost;
     

    /**
    * costPerSlice
    *
    * This method caclulates and returns (double) the cost per slice.
    *
    */
    public double costPerSlice()
    {
        cost = cost / slices;
        return cost;
    }

    /**
    * getName
    *
    * This method returns (string) the name of the pizza.
    *
    */
    public String getName()
    {
        return myPizza;
    }

    /**
    * areaPerSlice
    *
    * This caclulates and returns (double) the area of each slice.
    *
    */
    public double areaPerSlice()
    {

        double radius = inches / 2;

        // I believe area per slice was miscalculated in our pset.
        // pset seemed to divide by magic number 2, not slices.
        double area = Math.PI * Math.pow(radius,2) / slices;
        return area;
    }

    /**
    * costPerSquareInch
    *
    * This caclulates and returns (double) the cost per square inch 
    * of each slice.
    *
    */
    public double costPerSquareInch()
    {
        double costperinch = costPerSlice() * areaPerSlice();
        return costperinch;
    }

    /**
    * Pizza
    *
    * This is a constructor method that takes 4 paramaters
    * to construct a new pizza.
    *
    * @param1 String name represents the pizza name.
    * @param2 int i represents the inches of the pizza.
    * @param3 double c represents the cost of the pizza.
    * @param4 int s represents the number of slices.
    */
    Pizza (String name, int i, double c, int s)
    {
        myPizza = name;
        inches = i;
        cost = c;
        slices = s;
    }
}
