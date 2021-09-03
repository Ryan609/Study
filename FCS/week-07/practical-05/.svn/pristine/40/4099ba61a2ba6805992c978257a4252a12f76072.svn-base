import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Create a scanner object to receive input
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter a number: ");
		int n = input.nextInt();
		//Print user input
		System.out.println("Input: " + n);
		//Call method and judge
		System.out.println("Output: " + nextHappyNum(n));
	}

	//Create nexthappynum method to find next happy number
	private static int nextHappyNum(int num) {
		num += 1;
		//Use a while loop until the next happy number is found
		while(true) {
			//Use if statement and call ishapoy method to determine whether it is a happy number
			if (isHappy(num) == true) {
				return num;
			} else {
				num += 1;
			}
		}
	}

	//Create ishappy method to find happy number
	private static boolean isHappy(int num) {
		//If the number is less than 4, only 1 is the happy number
		if (num <= 4) {
			return num == 1;
		}
		//Assign num to sum and initialize tmp
		int sum = num, tmp = 0;
		//Use while loop to judge
		while (sum > 0) {
			////Find the low digits
			tmp += (sum % 10) * (sum % 10);
			//Remove the low digits from the sum
			sum /= 10;
		}
		//Call recursion and return value
		return isHappy(tmp);
	}
}