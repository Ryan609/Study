import java.util.Scanner;

public class Part3{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
            
			//print text on the screen.
			System.out.println("Welcome dear user!");
			System.out.println("Would you like to:");
			System.out.println("a) sum again");
			System.out.println("b) exit");
			System.out.print("Option: ");
			//get input by the user.
			String choice = input.nextLine();

        //Use the while loop to determine the user's choice.
        while (choice.equals("a")) {
        	//Print out the text and get the number entered by the user.
        	System.out.print("Please, insert the first number: ");
			int numberA = input.nextInt();
			System.out.print("Please, insert the second number: ");
			int numberB = input.nextInt();
			//Calculate the sum of two numbers and print it out.
			System.out.println("----");
			System.out.printf("Thank you for your enquiry, the sum between (%d) and (%d) is (%d)", numberA, numberB, numberA + numberB);
			System.out.println();
            
			//Print the text again so that the user can reuse it until the user wants to exit.
			System.out.println("Welcome dear user!");
			System.out.println("Would you like to:");
			System.out.println("a) sum again");
			System.out.println("b) exit");
			System.out.print("Option: ");
			input.nextLine();
			choice = input.nextLine();
        }

			System.out.println("Thank you! Have a good day.");
    }
}    