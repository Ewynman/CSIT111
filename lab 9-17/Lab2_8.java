// 2.8 Write a program that reads values repesenting a time duration in hours, minuites, and seconds and prints the equilvant total number of seconds

import java.util.Scanner;
public class Lab2_8
{ 
 //prints time in seconds
   public static void main (String[] args) 
   {
   	int hours, minutes, seconds;
    int totalSeconds;
 // create Scanner object
    Scanner scan  = new Scanner(System.in);  
 // Take number of hours
   System.out.println("Hours ");
    hours = scan.nextInt();
 // Take number of minutes
   System.out.println("Minuites ");
    minutes = scan.nextInt(); 
 // Take number of seconds
   System.out.println("Seconds ");
    seconds = scan.nextInt();
 // totalSeconds
    totalSeconds = 3600*hours + 60*minutes + 1*seconds;

    // Prints totalSeconds 
   	System.out.println(totalSeconds);
   }
}