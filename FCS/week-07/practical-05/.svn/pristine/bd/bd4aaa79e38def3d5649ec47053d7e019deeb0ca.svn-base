public class MergeSort extends MySortAlg {

	//Override the sort method
	@Override
	public int[] sort(int[] array) {
		//Call mergesort method and return value
		return mergeSort(array, 0, array.length-1);
	}

	//using recursion to Sort an array 
	private int[] mergeSort(int[] array, int left, int right) {
		if (left < right) {
			//find middle index
			int mid = (right + left) / 2;

			//Use recursion to find the left side of the array
			mergeSort(array, left, mid);
			//Use recursion to find the reight side of the array
			mergeSort(array, mid+1, right);
			//Call the merge method to merge the array
			merge(array, left, mid, right);
		}
		return array;

	}

	//Define the merge method
	private void merge(int[] array, int left, int mid, int right) {

		int leftPart = mid - left + 1; //left part
		int rightPart = right - mid; // right part

		//Assign the left and right parts to the temp array
		int[] tempLeft = new int[leftPart];
		int[] tempRight = new int[rightPart];

		//Back up the left array
		for (int i = 0; i < leftPart; i++) {
			tempLeft[i] = array[left + i];
		}

		//Back up the right array
		for (int i = 0; i < rightPart; i++) {
			tempRight[i] = array[mid + 1 + i];
		}

		//merge elements
		int i1 = 0, i2 = 0, j = left;
		//Use while to determine whether there is an element to compare
		while (i1 < leftPart && i2 < rightPart) {
			if (tempLeft[i1] > tempRight[i2]) {
				array[j] = tempLeft[i1];
				i1++;
			} else {
				array[j] = tempRight[i2];
				i2++;
			}
			j++;
		}
		
		//Add all remaining elements in the array
		while (i1 < leftPart) {
			array[j++] = tempLeft[i1++];
		}
		while (i2 < rightPart) {
			array[j++] = tempRight[i2++];
		}
	}


}