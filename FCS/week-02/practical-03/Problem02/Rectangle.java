public class Rectangle extends Shape {

	//No-parameter construction
	public Rectangle() {}

	//Constructor with parameters
	public Rectangle(double width, double height, double radius, double length) {
		super(width,height,radius,length);
	}

	//Define the method to find the area of Rectangle
	public double area() {
		double number = 0;
		number = getLength * getWidth;
		return number
	}
}