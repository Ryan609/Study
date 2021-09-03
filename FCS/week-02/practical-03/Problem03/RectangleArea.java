import java.util.Scanner;

public class RectangleArea extends Rectangle {

	//No-parameter construction
	public RectangleArea() {}
	//Constructor with parameters
	public RectangleArea(int width, int height) {
		super(width,height);
	}

	//Define the read_input method.
	public void read_input() {
		Scanner input = new Scanner(System.in);
		// Read the input width and height
		System.out.print("Please enter width: ");
		int numberW = input.nextInt();
		System.out.print("Please enter height: ");
		int numberH = input.nextInt();

		//Set number limit, greater than 1 and less than 1000
		while(true) {
			if(numberW <= 1 || numberH >=1000) {
				System.out.println("Please re-enter as required(width>=1, height<=1000)");
				System.out.print("Please enter width: ");
				numberW = input.nextInt();
				System.out.print("Please enter height: ");
				numberH = input.nextInt();
			} else {
				break;
			}
		}
		super.setWidth(numberW);
		super.setHeight(numberH);
	}

	//Rewrite the input data methods
	@Override
	public void display() {
		super.display();
		System.out.println();
		System.out.println("Output:");
		System.out.println(super.getWidth() + " " + super.getHeight());
		System.out.println(super.getWidth() * super.getHeight());

	}

}