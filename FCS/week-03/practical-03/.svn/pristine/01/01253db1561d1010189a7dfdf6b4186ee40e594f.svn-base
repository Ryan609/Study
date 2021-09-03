public class Problem01 {
	public static void main(String[] args) {

		//Define the array and print it out using the printArray method
		int array[] = {10,11,12,13,14,15};
		BaseOperations.printArray(array);

		//Define the array and print it out using the printArray method
		String array1[] = {"dog","cat","fish","bird"};
		BaseOperations.printArray(array1);
		
		//Define the array and print it out using the printArray method
		float array2[] = {1.1f,2.2f,3.3f,4.4f,5.5f};
		BaseOperations.printArray(array2);

        System.out.println("----------------");

        //Use the reverseArray method to reverse the array array, then re-assign it to the array and print
		array = BaseOperations.reverseArray(array);
		BaseOperations.printArray(array);

		array1 = BaseOperations.reverseArray(array1);
		BaseOperations.printArray(array1);

		array2 = BaseOperations.reverseArray(array2);
		BaseOperations.printArray(array2);
	}
}

class BaseOperations{

	//Define a method
	public static void printArray(int[] array) {
		System.out.print("[");
		//Use a for loop to print out the array in order
		for (int i = 0; i < array.length; i++){
			//If it is the last element, print the element directly, if it is not the print out element and  ","
			if(i == array.length - 1){
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println("]");
	}

	//Define a method
	public static void printArray(String[] array) {
		System.out.print("[");
		//Use a for loop to print out the array in order
		for (int i = 0; i < array.length; i++){
			//If it is the last element, print the element directly, if it is not the print out element and  ","
			if(i == array.length - 1){
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println("]");
	}

	//Define a method
	public static void printArray(float[] array) {
		System.out.print("[");
		//Use a for loop to print out the array in order
		for (int i = 0; i < array.length; i++){
			//If it is the last element, print the element directly, if it is not the print out element and  ","
			if(i == array.length - 1){
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println("]");
	}


	//Define a method
	public static int[] reverseArray(int[] array){
		/*Print the array in a loop, initialize the two index variables "start" and "end", 
		and the judgment condition is that start is less than end.*/
		for (int start = 0, end = array.length - 1; start<=end; start++, end--){
			//Variable exchange	
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
		return array;
	}

	//Define a method
	public static String[] reverseArray(String[] array){
		/*Print the array in a loop, initialize the two index variables "start" and "end", 
		and the judgment condition is that start is less than end.*/
		for (int start = 0, end = array.length - 1; start<=end; start++, end--){	
			//Variable exchange
			String temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
		return array;
	}

	//Define a method
	public static float[] reverseArray(float[] array){
		/*Print the array in a loop, initialize the two index variables "start" and "end", 
		and the judgment condition is that start is less than end.*/
		for (int start = 0, end = array.length - 1; start<=end; start++, end--){
			//Variable exchange	
			float temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
		return array;
	}

}