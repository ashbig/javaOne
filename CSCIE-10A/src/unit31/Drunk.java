/**
 * Drunk.java
 *
 * Problem 8
 *
 * This program simulates a drunk students walk by calling on the 
 * drunkWalk method the desired number of walks.
 *
 * @author Ashkan Bigdeli
 * @email ashbigdeli@gmail.com
 */
 
class Drunk
{
    public static void main ( String [] args )
    {
        final int walks = 5;
        double average = 0;
                   
        // I preffered printing in the method (easier), but used the conditions
        // in main to take advantage of the different return values.
        for ( int i = 0; i < walks; i++)
        { 
            int steps = drunkWalk();
            System.out.println("Here we go again...time for a walk!");

            if ( steps < 0 )
            {
                System.out.printf("Took %d steps, and\n", Math.abs(steps));
                System.out.println("Landed in JAIL\n");
            }
            else
            {
                System.out.printf("Took %d steps, and\n", steps);
                System.out.println("Landed in HOME\n");
            }
            average += Math.abs (steps);
        }
        System.out.printf("Average # of steps equals %.1f\n", average/walks);
    }
 
    /**
     * drunkWalk
     *
     * This method will perform a while loop and give a 50-50 chance of 
     * walking towards home or walking towards jail ( corner +/- 1 ).
     *
     */
    public static int drunkWalk ()
    {
        int corner = 5;
        int steps = 0;
        while( corner != 0 )
        {
            if( Math.random() >= 0.5 )
            {
                 corner++;
                 steps++;
                 if ( corner == 10 )
                 {
                    return -steps;
                 }
            }
            else
            {
                corner--;
                steps++;
            }
         }
        return steps;
       
    }
}
