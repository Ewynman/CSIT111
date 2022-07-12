//Write a class called Sphere that contains instance data that represents the sphere's diameter. 
//Define Sphere constructor to accept and initialize the diameter, and include getter and setter methods for the diameter
//Include methods that calculate and return the volume and surface area of the sphere.
//Include a toString method that returns a one line description of the sphere
//Create a driver class called MultiShpere, whos main method instantiates and updates several Sphere objects

public class Sphere {

double diameter;


Sphere(double d) {
diameter = d;
}

double getDiameter() {
return diameter;
}

double getVolume() {
double radius = diameter / 2.0;
double volume = 4/3* Math.PI * radius * radius * radius;
return volume;
}

double getSurface() {
double radius = diameter / 2.0;
double surface = 4.0 * Math.PI * radius * radius;
return surface;
}
}
