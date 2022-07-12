// write a program that generates a random interger radius (r) and height (h) for a cylinder in the range 1-20
// inclusive and then computes the volume and surface area of the cyliner. 

import java.util.Random;
public class Cylinder {
   
   public static void main(String[]args){
      int r;
      int h;
      double vol;
      double area;
      
      Random rand = new Random();
      
      r = rand.nextInt(20) + 1;
      h = rand.nextInt(20) + 1;
      
      vol = Math.PI * Math.pow(r, 2) * h;
      area = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
      
      System.out.println("r = " + r);
      System.out.println("h = " + h);
      System.out.println("Volume = " + vol);
      System.out.println("Area = " + area);
     }
}
