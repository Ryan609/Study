import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem03 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);


		try {
			//Enter the first number
			System.out.print("Please, insert a number: ");
			float numberA = number.nextFloat();
			//Enter the second number
			System.out.print("Please, insert a number: ");
			float numberB = number.nextFloat();
			//Run the getMax method to determine the size of the two numbers
			getMax(numberA, numberB);

		//If the input type is not number type, catch the error and print the text
		} catch (InputMismatchException e){
			System.out.println("Your input is worng");
		}
		
	}


	//Define a method to determine the size of the two numbers entered
	public static void getMax(float numberA, float numberB){

		//If the numberA is greater than the numberA, then print the numberA
		if( numberA > numberB){
			System.out.println("The bigger number is: " + numberA);
		//If the numberA is not greater than the numberA, then print the numberA
		} else {
			System.out.println("The bigger number is: " + numberB);
		}
	}
}