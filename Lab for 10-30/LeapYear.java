//Write a program that reads an integer value from the user representing a year.
//The purpose of the program is to determine if the year is a leap year ( and therefore has 29 days in February) 
//in the Gregorian calendar. A year is a leap if it is divisible by 4, 
//unless it is also divisible by 100 but not 400. For exmple, the year 2003 is not a leap year, 
//but 2004 is. The year 1900 is not leap year because it is divisible by 100, but then year 2000 
//is a leap year because even though it is divisible by 100, it is also divisible by 400. 
//Produce an error message for any input value less than 1582 (the year the Gregorian calendar was adopted).

import java.util.Scanner;

public class LeapYear{

   public static void main(String[] args) {

       int year;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Please enter a year\n\n");

       year = scanner.nextInt();

       while (year < 1582) {

           System.out.print("\nPlease enter a different year above 1582\n");

           year = scanner.nextInt();

       }

       if (year % 4 == 0) {

           if(year % 100 ==0 && year % 400 != 0){

                   System.out.println(year + " is not a leap year\n\n");

           }else {

               System.out.println(year + " is a leap year\n");

           }

       } else {

           System.out.println(year + " is not a leap year\n\n");

       }

   }

}