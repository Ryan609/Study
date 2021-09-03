public class Triangle extends Shape {

	private double base;
	
	//No-parameter construction
	public Triangle() {}

	//Constructor with parameters
	public Triangle(double width, double height, double radius, double length, double base) {
		super(width,height,radius,length);
		this.base = base;

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	//Define the method to find the area of Triangle
	public double area() {
		double number = 0;
		number =  0.5 * getBase * getRadius;
		return number
	}
}