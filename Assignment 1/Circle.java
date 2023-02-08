// This class represents a circle shape
public class Circle {

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate of the circle's center

    // The default constructor with no argument
    public Circle(){
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }
    // Overloaded constructor
    // Parameter r is the radius length
    // Parameter ex is the x coordinate
    // Parameter is the y coordinate
    public Circle(double r, double ex, double why) {
      this.radius = r; // "this" references the current circle's variables
      this.x = ex;
      this.y = why;

    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
     double[] c = {this.x, this.y}; // // "this" references the current object's variables
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
      return radius * radius * Math.PI; // area of a circle is πr^2.
    }

    // A public getter method for computing and returning
    // the circumference of the circle
    public double getCircumference() {
      return 2 * radius * Math.PI; // circumference of a circle is 2πr.
    }

    // A public method that compares the sizes of two circles. If circle is
    // bigger than the circle inside the parameter of the method, method
    // returns true; returns false otherwise.
    public boolean isBiggerThan(Circle circleB) {
      return this.getArea() > circleB.getArea(); //this.getArea() references
      // first circle. For example, if input is circleA. isBiggerThan(circleB),
      // this.getArea() references circleA's area.
    }

    // A public method that takes as input an x coordinate (as a double)
    // and a y coordinate (a double), and returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    public boolean containsPoint(double xCoordinate, double yCoordinate) {
      double d = Math.sqrt(Math.pow((this.x - xCoordinate),2) + Math.pow((this.y - yCoordinate),2)); //distance formula. this references the current circle.
      return (d <= this.radius); //if the radius of the current is bigger than distance, it must contain that point.


    }

    // A public method named setRadius that sets this object's radius
    public void setRadius(double radius) {
      this.radius = radius;
    }
    // A public method named setCenter that sets this object's center.
    public void setCenter(double ex, double why) {
      this.x = ex;
      this.y = why;
    }
    // Overriden method toString which returns
    // "This circle is centered at point <display_coordinate_of_center_here>
    // with radius <display_radius>"
    @Override
    public String toString() {
      return "This circle is centered at point {" + this.x + "," + this.y + "} with radius " + getRadius(); //getCenter() is a double[] method, so it can't be printed as String.
      // So {" + this.x + "," + this.y + "} is used. Output is the same.
    }
    // Overriden method equals. True if area of two circles is equal; false otherwise.
    @Override
    public boolean equals(Object object) {
      if (!(object instanceof Circle)) return false; //if the input object is not circle, returns false.
      Circle temp = (Circle) object; // temporary object
      return getArea() == temp.getArea(); //if both equal, returns true; false otherwise
    }
}
