public abstract class ArithmeticalOp {

	protected String opName;
	protected int a;
	protected int b;
	protected int[] array;

	//Basic constructor
	ArithmeticalOp() {
		this.opName = "unknown";
		//this.array = new int[10];
	}

	ArithmeticalOp(int n) {
		this.array = new int[n];
	}

	public void setArray(int i, int v) {
		this.array[i] = v;
	}

	//Parametrized constructor
	ArithmeticalOp(String opName) {
		this.opName = opName;
	}

	//Methods
	public void info() {
		System.out.println("You chose " + this.opName + " operation.");
	}

	//Abstract method
	public abstract float compute();

	// Accessors
	public String getOpName() {
		return this.opName;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	//Mutators
	public void setOpName(String opName) {
		this.opName = opName;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}


}