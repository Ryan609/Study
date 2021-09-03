import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Print the text below
		System.out.println("Welcome to Matrix Determinant Calculator.");
		System.out.println("Would you like to Calculator the determinant of a new matrix.");
		System.out.print("1.Yes, 2. No: ");

		//Get user input
		int choice = input.nextInt();

		//If the number entered is equal to 1, then continue to run
		if (choice == 1){
			System.out.println("What is the dimension of the matrix?");
			System.out.println("Maximum support 3*3");
			//Get the number entered
			int number = input.nextInt();
			System.out.println("Great! Let's calculate this determinant then.");
			System.out.println("pleas insert all the values for your matrix.");

			//Judge the size of the matrix according to the input number
			double array [][] = new double [number][number];
			//Enter the number and store it in the array
			for (int i = 0; i < number; i++){
				for(int j = 0; j < number; j++){
					System.out.print("New matrix["+(i+1)+"]["+(j+1)+"]");
					array[i][j] = input.nextInt();
				}
			}

			//Convert the array to the form of a matrix
			System.out.println("The determinant of your matrix is: ");
			for (int i = 0; i < number; i++){
				System.out.print("|");
				for (int j = 0; j < number; j++){
					System.out.print("  " + array[i][j]);
				}
				System.out.print("|");
				System.out.println();
			}

			//If the matrix is 2*2, use the following formula to calculate and print out the result
			if (number == 2){
				double det = array[0][0]*array[1][1] - array[0][1]*array[1][0];
				System.out.println("Determinant: " + det);
			//The previous hint only supports 2*2 and 3*3, so if it is not 2*2, use the following formula to calculate
			} else {
				double det = array[0][0]*array[1][1]*array[2][2] + array[0][1]*array[1][2]*array[2][0] + array[0][2]*array[1][0]*array[2][1]-
					array[0][2]*array[1][1]*array[2][0]- array[0][0]*array[1][2]*array[2][1] - array[0][1]*array[1][0]*array[2][2];
				System.out.println("Determinant: " + det);
			}
			
		//If the initial number entered is not 1, then print the following number
		} else {
			System.out.println("Good bye");
		}






	}

}