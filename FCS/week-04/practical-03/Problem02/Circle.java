public class Circle extends Shape {

	//No-parameter construction
	public Circle() {}

	//Constructor with parameters
	public Circle(double width, double height, double radius, double length) {
		super(width,height,radius,length);
	}

	//Define the method of finding the area of a circle
	public double area() {
		double number = 0;
		number = Math.PI * getRadius * getRadius;
		return number
	}
}