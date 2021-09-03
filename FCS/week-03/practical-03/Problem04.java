public class Problem04{
	public static void main(String[] args) {

		//Define complex numA and complex numB
		ComplexCalculator numA = new ComplexCalculator(5,8);
		ComplexCalculator numB = new ComplexCalculator(2,2);

		//Use the method add in the ComplexCalculator class to calculate and print out
		ComplexCalculator add = ComplexCalculator.add(numA,numB);
		System.out.print("(a). addition: ");
		ComplexCalculator.print(add);

		//Use the method sub in the ComplexCalculator class to calculate and print out
		ComplexCalculator sub = ComplexCalculator.sub(numA,numB);
		System.out.print("(b). Subtraction: ");
		ComplexCalculator.print(sub);

		//Use the method mul in the ComplexCalculator class to calculate and print out
		ComplexCalculator mul = ComplexCalculator.mul(numA,numB);
		System.out.print("(c). Multiplcation: ");
		ComplexCalculator.print(mul);

		//Use the method div in the ComplexCalculator class to calculate and print out
		ComplexCalculator div = ComplexCalculator.div(numA,numB);
		System.out.print("(d). Division: ");
		ComplexCalculator.print(div);		
	}

}



class ComplexCalculator {

	double real;
	double imag;

	//Define the real and imaginary parts of a complex number a and a complex number b
	public ComplexCalculator(double numA, double numB){
		real = numA;
		imag = numB;
	}

	//Define a method to addition complex numA and complex numB
	public static ComplexCalculator add(ComplexCalculator numA, ComplexCalculator numB){
		//Calculate the value according to the plural publicity, and assign the value to temp
		ComplexCalculator temp = new ComplexCalculator(numA.real + numB.real, numA.imag + numB.imag);
		return temp;
	} 

	//Define a method to subtraction complex numA and complex numB
	public static ComplexCalculator sub(ComplexCalculator numA, ComplexCalculator numB){
		ComplexCalculator temp = new ComplexCalculator(numA.real - numB.real, numA.imag - numB.imag);
		return temp;
	}

	//Define a method to multiplication complex numA and complex numB
	public static ComplexCalculator mul(ComplexCalculator numA, ComplexCalculator numB){
		ComplexCalculator temp = new ComplexCalculator(numA.real * numB.real - numA.imag * numB.imag,
		                      							numA.real * numB.imag + numA.imag * numB.real);
		return temp;
	}
	//Define a method to division complex numA and complex numB
	public static ComplexCalculator div(ComplexCalculator numA, ComplexCalculator numB){
		ComplexCalculator temp = new ComplexCalculator((numA.real*numB.real+numA.imag*numB.imag)/(numB.real*numB.real+numB.imag*numB.imag),
		                       							(numA.imag*numB.real-numA.real*numB.imag)/(numB.real*numB.real+numB.imag*numB.imag));
		return temp;
	}

	//Determine whether the imaginary part of the result value is greater than 0
	public static void print(ComplexCalculator temp) {
		if (temp.imag >= 0) {
			//If it is greater than zero, add a plus sign in front of it
			System.out.println(temp.real + "+" + temp.imag + "i");
			//If it is less than 0, use the number directly
		} else
			System.out.println(temp.real + "" + temp.imag + "i");
	}
}