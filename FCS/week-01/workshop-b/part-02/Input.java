import java.util.Scanner;

class Input{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		int number = input.nextInt();
		System.out.println("You have entered the number " + number);
    
        Scanner input1 = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = input1.nextLine();
		System.out.println("Your name is " + name);

	}
}