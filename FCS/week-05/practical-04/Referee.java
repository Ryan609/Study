import java.util.Scanner;
import java.util.InputMismatchException;

class Referee {

	//Create Human Object
	Player a = new Human();
	//Create Computer Object
	Player b = new Computer();


	public void menu() {
		//Use the while loop and return to the main interface again after completion
		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("Welcome to the game of rock, paper, scissors!");
			System.out.println("1. Start the game.");
			System.out.println("2. Exeit");
			System.out.println("---------------------------------------------");	

			//Use scanner to enter data by keyboard
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			//The choice to complete the operation with the switch statement
			switch (line) {
				case "1":
					//Get user input
					String humanChoice = a.performMove();
					//Get computers's random selection of 
					String computerChoice = b.performMove();
					//Run the game program
					this.gameProgram(humanChoice, computerChoice);
					break;
				case "2":
					//Print the text and exit the program
					System.out.println("Thank you for using!!");
					System.exit(0); //JVM exit
			}
		}
	}

	//Method of creating game program
	public void gameProgram(String humanChoice, String computerChoice) {
		//Print out user choice
		System.out.println("Your choice: " + humanChoice);
		//Print out Computer choice
		System.out.println("Computer choice: " + computerChoice);

		//Use if statements to determine who is the winner
		if (humanChoice.equals("rock") && computerChoice.equals("scissors")) {
			System.out.println("You win!!");
		} else if (humanChoice.equals("rock") && computerChoice.equals("paper")) {
			System.out.println("Computer win!!");
		} else if (humanChoice.equals("scissors") && computerChoice.equals("rock")) {
			System.out.println("Computer win!!");
		} else if (humanChoice.equals("scissors") && computerChoice.equals("paper")) {
			System.out.println("You win!!");
		} else if (humanChoice.equals("paper") && computerChoice.equals("rock")) {
			System.out.println("You win!!");
		} else if (humanChoice.equals("paper") && computerChoice.equals("scissors")) {
			System.out.println("Computer win!!");
		} else if (humanChoice.equals("rock") && computerChoice.equals("rock")) {
			System.out.println("DogFall");
		} else if (humanChoice.equals("scissors") && computerChoice.equals("scissors")) {
			System.out.println("DogFall");
		} else if (humanChoice.equals("paper") && computerChoice.equals("paper")) {
			System.out.println("DogFall");
		} else {
			System.out.println("Wrong input, please try again!!");
		}

		System.out.println();	
	}


}