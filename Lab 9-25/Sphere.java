// Write a program that reads the radius of a sphere and prints it's volume and surface area.
// then prints out the output to four decmil places

import java.util.Scanner;
public class Sphere
{ 
   public static void main (String[] args) 
   {
   	double radius, volume, surfaceArea;
    Scanner scan  = new Scanner(System.in);  
    radius = scan.nextDouble();
    volume = 4*3.14*Math.pow(radius,3)/3;
    surfaceArea = 4*3.14*Math.pow(radius,2);
    System.out.println("Volume: "+Math.round(volume*10000d)/10000d);
    System.out.println("Surface area: "+Math.round(surfaceArea*10000d)/10000d);
   }
}