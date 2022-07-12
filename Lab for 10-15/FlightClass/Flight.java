// Write a class called Flight that represents an airline flight
// it should contain instance data that represents the airline name, flight name,
// and the flights orgin and destniation cities.
// Define the flight constructor to accept and initialize all instance data
// In clude getter and setter methods for all instance data 
// Include a toString method that returns a one-line description of the flight 
// Create a driver class called FlightTest whos main method instantiates and updates sevreal flight objects.

package FlightClass;

public class Flight{
   String _airline;
   String _flightNumber;
   String _origin;
   String _destination;
   
   //Constructors
   public Flight (String airline, String flightNumber, String origin, String destination)
   {
      _airline = airline;
      _flightNumber = flightNumber;
      _origin = origin;
      _destination = destination;
   }
   
   //getters
   public String getAirline()
   {
      return _airline;
   }
   
   public String getflightNumber()
   {
      return _flightNumber;
   }
   
   public String getOrigin()
   {
      return _origin;
   }
   
   public String getDestination()
   {
      return _destination;
   }
   
   //Setters
   
   public void setAirline(String airline)
   {
      _airline = airline;
   }
   
   public void setFlightNum(String flightNum)
   {
      _flightNumber = flightNum;
   }
   
   public void setOrigin(String origin)
   {
      _origin = origin;
   }
   
   public void setDestin(String destination)
   {
      _destination = destination;
   }
   
   public String toString()
   {
      return "Flight Information. The Airline is: " + getAirline() + "The flight number is: " + getflightNumber() + "The origin and destinations are: " + getOrigin() + getDestination();
   }
}