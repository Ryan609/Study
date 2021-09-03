public class Mult extends ArithmeticalOp {

	//Basic constructor
	Mult() {
		super("multiplication"); // call ArithmeticalOp(String) constructor
	}
	
	//Implementing abstract method from parent class
	public float compute() {
		return this.a * this.b;
	}
}