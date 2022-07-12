//4.1 Write a class called Counter that represents a simple tally counter, which might be used to count people as they enter a room.
//The Counter class should contain a single interger as instance data, representing the count.
//Write a constructor to initialize the count zero. 
//Write a meathon called Click that increments the count and another method called getCount
//that retturns the current count.
//Include a meathon calle reset that resets the counter to zero
//Finally create a driver class called CounterTest that creates two Counter objects and tests their methods

public class  Counter
{
   private int count;
   
   public Counter()
   {
      count = 0;
   }
   
   public int click()
   {
      count = count + 1;
      return count;
   }
   
   public int getCount()
   {
      return count;
   }
   
   public int reset()
   {
      count = 0;
      return count;
   }
}