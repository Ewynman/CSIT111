//********************************************************************
//  RollingDice.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of a user-defined class.
//********************************************************************

public class RollingDice
{
    //-----------------------------------------------------------------
    //  Creates two Die objects and rolls them several times.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Die die1, die2;   // Compare to int x, y;
        int sum;

        die1 = new Die(); // Compare to x = 0;
        die2 = new Die(); //            y = 0;
        
        System.out.println("Before rolling:");
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println();

        System.out.println("Start rolling......");
        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println();

        System.out.println("Roll die1, set die2 to 4");
        die1.roll();
        die2.setFaceValue(0);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        System.out.println("Get sum of two dies:");
        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);
        System.out.println();

        System.out.println("Roll both and get new sum:");
        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
    }
}
