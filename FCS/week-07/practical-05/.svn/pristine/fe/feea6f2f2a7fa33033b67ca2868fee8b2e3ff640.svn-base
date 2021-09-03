public class InsertionSort extends MySortAlg {

	//Override the sort method
	@Override
	public int[] sort(int[] array) {
		//Use for loop to through array elements
		for (int i = 1; i < array.length; i++) {
			//Assign array elements to key
			int key = array[i];

			//Find the place to insert and searching to the left from key.
			int j = i - 1;
			while(j >= 0 && array[j] < key) {
				//Move the element to the right and free up space
				array[j+1] = array[j];
				j--;
			}
			//insert key
			array[j+1] = key;
		}
		//return array.
		return array;
	}
}