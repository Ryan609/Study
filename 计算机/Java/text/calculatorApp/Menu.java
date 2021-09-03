import java.util.Scanner;

public class Menu {
	//print menu
	public static void print() {
		System.out.println("Welcome to calculator!");
		System.out.println("----------------------");
		System.out.println("Choose an option:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. Exit");
		System.out.println();
	}

	//read user's input
	public static int read() {
		Scanner input = new Scanner(System.in);
		int value = 0;
		boolean getInput = false;

		while(!getInput) {
			try {
				System.out.print("Please input int:");
				value = input.nextInt();
				getInput = true;
			} catch (Exception e) {
				System.out.println("Wrong input");
				input.next();
			}
		}
		return value;

	}
}