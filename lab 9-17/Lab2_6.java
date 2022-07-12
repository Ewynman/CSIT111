// 2.6 write a program that converts miles to kilometers. Reat the miles value from the user as a floating point value.

import java.util.Scanner;
public class Lab2_6
{ 
 //Print miles to kilometers
   public static void main (String[] args) 
   {
   	double miles, kilometers;
 
 // create Scanner object
    Scanner scan  = new Scanner(System.in);  
 // Miles is taken from the user
    miles = scan.nextDouble();
 // To convert miles into kilometers we use,
 // kilometers = miles * 1.60935
 // One mile is equal 1.60935 kilometers.
 
    kilometers = miles * 1.60935;

    // Prints kilometers   
   	System.out.println(kilometers);
   }
}