import java.util.Random;

class Computer extends Player {

	//Override the performMove method
	@Override
	public String performMove() {

		//Create an object.
		Random number = new Random();
		//Define the array
		String[] executeArray = {"rock", "paper", "scissors"};
		//Randomly get a number between 0-3
		int num = number.nextInt(3);
		//Randomly select one of the array
		String choice = executeArray[num];

		return choice;


	}
}