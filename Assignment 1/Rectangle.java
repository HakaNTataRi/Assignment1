// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle

		// A basic constructor that creates a rectangle with
		// side lengths 1 whose bottom left corner is at (0.0,0.0)
		public Rectangle() {
			x = 0.0;
			y = 0.0;
			L = 1.0;
			H = 1.0;

		}

		// A constructor that takes all four inputs,
		// named Ell, Eich, Ex, and Why for L, H, x, and y, respectively.

		public Rectangle(double Ell, double Eich, double Ex, double Why) {
			this.L = Ell;
			this.H = Eich;
			this.x = Ex;
			this.y = Why;
		}

		// A public method called getLength which returns the length.
    public double getLength() {
			return L;
		}
		// A public method called getHeight which returns the height.

		public double getHeight() {
			return H;
		}

		// A public method called setLength which takes as input a double
		// called Ell and uses it to set the length of the rectangle.

		public void setLength(double Ell) {
			this.L = Ell;
		}

		// A public method called setHeight which takes as input a double
		// called Eich and uses it to set the height of the rectangle.
		public void setHeight(double Eich) {
			this.H = Eich;
		}

		// A public method called getPerimeter which computes and returns
		// the perimeter of the rectangle.
		public double getPerimeter() {
			double perimeter = ((2 * this.H) + (2 * this.L)); //this references the current rectangle's variables.
			return perimeter;
		}

		// A public method called getArea which computes and returns the
		// area of the rectangle.
		public double getArea() {
			double area = this.L * this.H; //this references the current rectangle.
			return area;
		}

		// Override the method equals which is inherited from class Object. Returns
    // true if area of two rectangles is equal; false otherwise.
		@Override
		public boolean equals(Object object) {
			if (!(object instanceof Rectangle)) return false; //If input is not rectangle object, returns false.
			Rectangle temp = (Rectangle) object; //temporary object.
			return getArea() == temp.getArea(); //if equal to the temp object, return true; false otherwise.
		}
}
