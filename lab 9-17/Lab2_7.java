// 2.7 Write a progra that prompts for and reads interger values for speed and distance traveled, then prints the time required for the trip as a floating point result

import java.util.Scanner;

public class Lab2_7
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int Kilometers;
        double Speed;
        double Travel_Time;
        System.out.println ("Enter the distance travelled.");
        Kilometers = scan.nextInt();
        System.out.println ("Enter the travel speed.");
        Speed = scan.nextDouble();
        Travel_Time = Kilometers / Speed;
        System.out.println ("Time required for trip: " + Travel_Time + " hours");
    }
}