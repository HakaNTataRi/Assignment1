public class Sphere extends Circle {

   protected double z; // z coordinate of sphere. It is required as sphere is a 3D object.
    // The default constructor with no argument
   public Sphere() {
     x = 0.0;
     y = 0.0;
     z = 0.0;
     radius = 1.0;
   }

   public Sphere(double x, double y, double z, double radius) {
     this.x = x; //this references the current sphere's variables
     this.y = y;
     this.z = z;
     this.radius = radius;
   }

   @Override //Overriding method getCenter() to add coordinate z.
   public double[] getCenter() {
     double[] c = {this.x, this.y, this.z}; //this references the current sphere's variables
     return c;
   }

   public void setCenter(double x, double y, double z) {
     super.setCenter(x,y); //refers to parent class (circle) objects. Same thing as using this.x and this.y.
  //   this.x = x;
  //   this.y = y;
     this.z = z; //  references the current sphere's variables
   }

   @Override //overriding method getArea() to change the computation.
   public double getArea() {
     return 4 * super.getArea(); //super.getArea() refers to parent class.
     // Area of circle is πr^2, and area of sphere is 4πr^2. So 4 * super.getArea() is equivalent to area of sphere.
   }

   public double getVolume() { //method for computating and returning the volume of the sphere.
     return super.getArea() * (4.0/3.0) * radius;
     // Area of circle is πr^2, volume of sphere is (4/3)πr^3.
     // super.getArea() * (4.0/3.0) * radius is equivalent to volume of sphere.
   }
}
