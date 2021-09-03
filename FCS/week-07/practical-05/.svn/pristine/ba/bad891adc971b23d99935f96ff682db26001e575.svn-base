public class QuickSort extends MySortAlg {

	//Override the sort method
	@Override
	public int[] sort(int[] array) {
		//Call quick sort method and return value
		return QuickSort(array, 0, array.length-1);
	}

	//Define the exchange element method
	private void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}

	//define quick sort method
	private int[] QuickSort(int[] array, int start, int end) {
		//Use if statement to judge
		if (start < end) {
			//call partition method Reorder the array
			int pivot_idx = partition(array, start, end);
			//Use recursion to sort left and right
			QuickSort(array, start, pivot_idx - 1);
			QuickSort(array, pivot_idx + 1, end);
		}
		return array;
	} 

	//define partition method
	private int partition(int[] array, int start, int end) {
		//Select the last element as pivot
		int pivot = array[end];
		//index in left part
		int i = start;
		//Use a for loop to traverse the array
		for (int j = start; j < end; j++) {
			//if j > pivot，swap positions
			if (array[j] > pivot) {
				//call swap method
				swap(array, i, j);
				i++;
			}	
		}
		swap(array, i, end);
		return i;
	}


}