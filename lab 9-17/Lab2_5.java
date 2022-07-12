// Programing Lab 2.5 Create a version of the TempConverter application to convert from Fahrenheite to Celsius. Read the Fahrenheite temperature from the user

import java.util.Scanner;
public class Lab2_5
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}
