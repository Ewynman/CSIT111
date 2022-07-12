//Write a class called Dog that contains instance data that repreesents the dogs name and age.
//Define the Dog constructor to accept and initialize instance data.
//include getter and setter methods for the age of the dog in person years.
// include a toString method that returns a one line description of the dog.
//Create a driver class called Kennel whos main method instantiates and updates several Dog objects 

public class Dog
{
   private int Age;
   private String Name;
   
   public Dog(String name, int age)
   {
      Name = name;
      Age = age;
   }
   
   public String getName()
   {
      return Name;
   }
   
   public int getAge()
   {
      return Age;
   }

   public int personYears()
   {
      return getAge() * 7;
   }
   
   public String toString()
   {
      return "Tyhe name of the dog is " + getName() + "\nThe dog's age in human years is " + personYears();
   }
}