//4.1 Finally create a driver class called CounterTest that creates two Counter objects and tests their methods

public class CounterTest
{
   public static void main(String[] args)
   {
      Counter count1, count2;
      int sum;
      count1 = new Counter();
      count2 = new Counter();
      
      count1.click();
      count2.click();
      
      System.out.println("The current count is: " + count1 + " and " + count2);
      
      sum = count1.getCount() + count2.getCount();
      
      System.out.println("The sum of both is: " + sum);
      
      count1.reset();
      count2.reset();
      
      System.out.println("The current count is: " + count1.getCount() + " and " + count2.getCount());
   }
}