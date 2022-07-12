import java.util.Scanner;

public class CarTest
{
   public static void main(String[] args)
   {
      boolean quit = false;
      String toQuit;
      String model, make;
      int year = 0;
      Scanner scan =  new Scanner(System.in);
      
      Car car = new Car(" "," ", 0);
      
      while(!quit)
      {
         System.out.println("Please enter the cars make, model, and year: ");
         make = scan.next();
         model = scan.next();
         year = scan.nextInt();
         
         car.setMake(make);
         car.setModel(model);
         car.setYear(year);
         scan.nextLine();
         
         System.out.println("Here's the data you provided: " + car);
      }
   }
}