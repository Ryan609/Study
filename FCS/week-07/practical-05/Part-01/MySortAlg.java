public abstract class MySortAlg {

	//Define the printing method
	public void printArray(int[] array) {
		System.out.print("[");
		//Use a for loop to print array elements in sequence
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	//Define abstract sort method
	abstract int[] sort(int[] array);
}