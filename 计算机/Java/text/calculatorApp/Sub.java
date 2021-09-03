public class Sub extends ArithmeticalOp {

	//Basic constructor
	Sub() {
		super("subtraction"); // call ArithmeticalOp(String) constructor
	}
	
	//Implementing abstract method from parent class
	public float compute() {
		return this.a - this.b;
	}
}