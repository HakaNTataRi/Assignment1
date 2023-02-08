public class ShapeTester {

  public static void main(String[] args) {
    Circle circleOne = new Circle();
    Circle circleTwo = new Circle(10.0, -2.5, 5.0);
    Rectangle rectangleOne = new Rectangle();
    Rectangle rectangleTwo = new Rectangle(8.0, 12.2, 1.0, -1.0);
    Sphere sphereOne = new Sphere();
    Sphere sphereTwo = new Sphere(4.0, 8.0, 3.0, 5.5);
  }

    // takes as input two shapes (a Circle first, then a Rectangle) and returns true if the area
    // of the circle is bigger than (or equal to) the area of the rectangle, false otherwise.
  public static boolean islarger(Circle circle, Rectangle rectangle) {
    return circle.getArea() >= rectangle.getArea();
  }

  // A public method longerPerim which takes as input a Circle object followed by a Rectangle
  //  object and returns the length of the perimeter of the longer of the two objects.

  public static double longerPerim(Circle circle, Rectangle rectangle) {
    double perimeterCircle = circle.getCircumference();
    double perimeterRectangle = rectangle.getPerimeter();
    if (perimeterCircle >= perimeterRectangle) {
      return perimeterCircle; //if statement is true, this is returned.
    } else {
      return perimeterRectangle; //else, this is returned.
    }
  }
  // Overloaded longerPerim method. Takes rectangle first, then circle. Also returns perimeter of longer object.

  public static double longerPerim(Rectangle rectangle, Circle circle) {
    double perimeterRectangle = rectangle.getPerimeter();
    double perimeterCircle = circle.getCircumference();
    if (perimeterRectangle >= perimeterCircle) {
      return perimeterRectangle;  //if statement is true, this is returned.
    } else {
      return perimeterCircle; //else, this is returned.
    }
  }

  // A public method largerArea which takes as input a Circle object followed by a
  //Rectangle object and returns the area of the larger of the two objects.
  public static double largerArea(Circle circle, Rectangle rectangle) {
    double areaCircle = circle.getArea();
    double areaRectangle = rectangle.getArea();
    if (areaCircle >= areaRectangle) {
      return areaCircle;//if statement is true, this is returned.
    } else {
      return areaRectangle;//else, this is returned.
    }
  }

   // Overloaded largerArea method. Takes rectangle first, then circle. Also returns area of longer object.
  public static double largerArea(Rectangle rectangle, Circle circle) {
    double areaRectangle = rectangle.getArea();
    double areaCircle = circle.getArea();
    if (areaRectangle >= areaCircle) {
      return areaRectangle;//if statement is true, this is returned.
    } else {
      return areaCircle;//else, this is returned.
    }
  }
  // A public method containsCenter which takes as input two circles,and returns true if the first circle
  // contains the center of the second circle, false otherwise.

  public static boolean containsCenter(Circle circle1, Circle circle2) {
     double[] c2coodinates = new double[2]; //a circle has x and y coordinate that corresponds to the center. So an array size 2 is created.
     for (int i = 0; i < 2; i++) {
       c2coodinates[i] = circle2.getCenter()[i]; // x,y coordinates are initialized inside the array c2coodinates.
     }
     return circle1.containsPoint(c2coodinates[0], c2coodinates[1]); //if containsPoint is true, method also returns true, as it will contain the center.
  }
}
