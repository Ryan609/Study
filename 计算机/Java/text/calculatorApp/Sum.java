public class Sum extends ArithmeticalOp {

	//Basic constructor
	Sum() {
		super("addition"); // call ArithmeticalOp(String) constructor
	}
	
	//Implementing abstract method from parent class
	public float compute() {
		return this.a + this.b;
	}
}