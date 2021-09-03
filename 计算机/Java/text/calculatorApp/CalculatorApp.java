//Main excutable file
public class CalculatorApp {
	public static void main(String[] args) {

		//keep running calculator until user choose to exit
		boolean keepRunning = true;

		//Array of all operations
		ArithmeticalOp[] operations = {new Sum(), new Sub(), new Mult(), new Div()};

		while(keepRunning) {
			//print calculator's menu
			Menu.print();

			//choose an option
			int option = Menu.read();
			//1 - operations[0]
			//2 - operations[1]

			if (option > 0 && option < 5) {
				ArithmeticalOp op = operations[option - 1]; // choose correct operation
				op.info();

				//Read values
				int a = Menu.read();
				int b = Menu.read();
				op.setA(a);
				op.setB(b);

				//Computer
				float res = op.compute();
				System.out.println("Results is " + res);
				System.out.println();
			} else {
				System.out.println("Good bye!");
				//IF user decide to exit
				keepRunning = false;
			}
		}
	}

}