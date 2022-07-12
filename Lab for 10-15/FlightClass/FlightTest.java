package FlightClass;

public class FlightTest {
   public static void main(String[] args)
   {
      Flight flight1, flight2, flight3;
      
      flight1 = new Flight("United Airlines", "UA110", "London to ", "New York");
      flight2 = new Flight("Delta Airlines", "DA1650", "Paris  to ", "New York");
      flight3 = new Flight("Emirates Airlines", "EA110", "London to ", "Melbourne");
      
      System.out.println(flight1);
      System.out.println(flight2);
      System.out.println(flight3);
   }
}