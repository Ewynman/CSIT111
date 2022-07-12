//Write a cass called Bulb that represents a light bulb that can be turned on and off.
// Create a driver class called Lights whose main method instanriates and turns on some Bulb objects

public class Bulb
{
   private boolean isLit;
   public Bulb (boolean light)
   {
      isLit = light;
   }
   
   public void turnOn()
   {
      isLit = true;
   }
   
   public void turnOff()
   {
      isLit = false;
   }
   
    public String getLight () {
        if(isLit) { 
            return "On"; 
        } else { 
            return "Off";
        }
    }
}