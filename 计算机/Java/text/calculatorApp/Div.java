public class Div extends ArithmeticalOp {

	//Basic constructor
	Div() {
		super("division"); // call ArithmeticalOp(String) constructor
	}
	
	//Implementing abstract method from parent class
	public float compute() {

		try{
			//if division by zero
			if (this.b == 0) {
				// Throw an exception
				throw new ArithmeticException("Div by 0 is not allowed");
			} else {
				return (float) this.a / this.b;
			}
		} catch (Exception e) {
			System.out.println("Division by Zero!!!");
			return -666;
		}

	}

	//Overload
	public float compute(float defaultRes) {
		if (this.b == 0) {
			return defaultRes;
		} else {
			return (float)this.a / this.b;
		}
	}

	public void setB(int b) {
		if (b == 0) {
			this.b = 1;
		} else {
			this.b = b;
		}
	}

	//Overriding method info
	@Override
	public void info() {
		super.info(); //calling info method from parent class
		System.out.println("Note: division by 0 is not allowed");
	}



 }