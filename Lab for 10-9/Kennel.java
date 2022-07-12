import java.util.Scanner;

public class Kennel
{
   public static void main(String[]args)
   {
      String name;
      int age = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the dogs name and age in that order: ");
      name = scan.next();
      age = scan.nextInt();
      
      scan.close();
      
      Dog dog = new Dog(name, age);
      
      System.out.println(dog);
      }
}