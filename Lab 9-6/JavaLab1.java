//Java Lap 1 
//2.2 Write a program that reads three intergers and prints their adverage 

import java.util.Scanner;
 
public class JavaLab1 
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
   
      System.out.print("Input first number: ");
      int num1 = in.nextInt();
   
      System.out.print("Input second number: ");
      int num2 = in.nextInt();
   
      System.out.print("Input third number: ");
      int num3 = in.nextInt();
   
      System.out.println("Average of five numbers is: " + 
      (num1 + num2 + num3) / 3);
   }
}