//Write a class called Box that contains instance data that represents the height, width, and the depth of the box. 
//Also, include a boolean variable called full as instance data that represents whether the box is full or not.
//Define the Box constructor to accept and initialize the height, width, and the depth of the box. 
//Each newly created Box is empty ( the constructor should initialize full to false). 
//Include getter and setter methods for all instance data. Include a toString method that returns a 
//one-line description of the box. Create a driver class called BoxTest, whose main method instantiates and updates several Box objects. 

public class Box {

double height, width, depth;
boolean full;
private double fullbox = 125.0;

public Box(double height_double, double width_double, double depth_double) //Constructor
{
    height = height_double;
    width = width_double;
    depth = depth_double;
    full = false;
}
public boolean Full()
{
    return(true);
}
public double getHeight() //Getters
{
    return(height);
}
public double getWidth()
{
    return(width);
}
public double getDepth()
{
    return(depth);
}
public boolean getFull()
{
    if(((height)*(width)*(depth)) == (fullbox))
    {
      return(true);
    }
    else
    {
      return(false);
    }
}
public void setHeight(double height2) //Setters
{
    height = height2;
}
public void setWidth(double width2)
{
    width = width2;
}
public void setDepth(double depth2)
{
    depth = depth2;
}
public void setFull(boolean full2)
{
    full = full2;
}
public String toString()
{
    return("Height: " + height + "| Width: " + width + "| Depth: " + depth + " | Full? " + Full());
}

}