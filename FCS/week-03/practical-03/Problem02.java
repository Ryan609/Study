import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem02{
	public static void main(String[] args) {	
		Scanner number = new Scanner(System.in);
		boolean prime;

		try {
			//Enter a number and run the method prime
			System.out.print("please, insert a number: ");
			int num = number.nextInt();
			prime = prime(num);

			if (prime == false) {
				System.out.println("Your number is not prime. ");
			} else {
				System.out.println("Your number is prime. ");
			}

		//If the input type is not int type, catch the error and print the text
		} catch (InputMismatchException e){
			System.out.println("Your input is worng");
		}

	}


	//Define the method to determine whether a number is a prime number
	public static boolean prime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number -1; i++) {
			if (number % i ==0) {
				return false;
			}
		}
		return true;
	}

	
}

