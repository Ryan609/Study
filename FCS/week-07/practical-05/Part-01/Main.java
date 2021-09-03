import java.util.*;

public class Main {
	public static void main(String[] args) {

		
		int[] array = {99, 2, 333, 222, 11};	//Define array
		int[] ansSort = {333, 222, 99, 11, 2};	//Manually sorted array
		
		int[] array1 = {33, 23, 77, 99, 100};	//Define array1
		int[] ansSort1 = {100, 99, 77, 33, 23};	//Manually sorted array1
		
		int[] array2 = {232, 322, 12, 43, 50};	//Define array2
		int[] ansSort2 = {322, 232, 50, 43, 12};//Manually sorted array2

		MySortAlg sort = new InsertionSort();	//Create an InsertionSort object
		MySortAlg sort1 = new MergeSort();	//Create an MergeSort object
		MySortAlg sort2 = new QuickSort();	//Create an QuickSort object

		//print text.
		System.out.println("-------------------------------------");
		System.out.print("Before sort: ");
		sort.printArray(array);	//call printarray method to print array
		System.out.println();

		System.out.print("After Insertion sort: ");
		int[] sorted = sort.sort(array.clone());	//Call the insertion sort method to sort the array
		sort.printArray(sorted);	//Print sorted array
		/*
		Call the test method to determine 
		whether the array using insertion sort and the array manually sorted are equal
		*/
		System.out.println("test result: " + test(sorted, ansSort));

		System.out.print("After Merge sort: ");
		int[] sorted1 = sort1.sort(array.clone());	//Call the merge sort method to sort the array
		sort.printArray(sorted1);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted1, ansSort));

		System.out.print("After Quick sort: ");
		int[] sorted2 = sort2.sort(array.clone());	//Call the quick sort method to sort the array
		sort.printArray(sorted2);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted2, ansSort));

		System.out.println("-------------------------------------");
		System.out.print("Before sort: ");
		sort.printArray(array1); //call printarray method to print array1
		System.out.println();

		System.out.print("After Insertion sort: ");
		int[] sorted3 = sort.sort(array1.clone());	//Call the insertion sort method to sort the array
		sort.printArray(sorted3);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted3, ansSort1));

		System.out.print("After Merge sort: ");
		int[] sorted4 = sort1.sort(array1.clone());	//Call the merge sort method to sort the array
		sort.printArray(sorted4);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted4, ansSort1));

		System.out.print("After Quick sort: ");
		int[] sorted5 = sort2.sort(array1.clone());	//Call the quick sort method to sort the array
		sort.printArray(sorted5);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted5, ansSort1));

		System.out.println("-------------------------------------");
		System.out.print("Before sort: ");
		sort.printArray(array2);	//call printarray method to print array1
		System.out.println();

		System.out.print("After Insertion sort: ");
		int[] sorted6 = sort.sort(array2.clone());	//Call the insertion sort method to sort the array
		sort.printArray(sorted6);	//Print sorted array
		System.out.println("test result: " + test(sorted6, ansSort2));

		System.out.print("After Merge sort: ");
		int[] sorted7 = sort1.sort(array2.clone());	//Call the merge sort method to sort the array
		sort.printArray(sorted7);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted7, ansSort2));

		System.out.print("After Quick sort: ");
		int[] sorted8 = sort2.sort(array2.clone());	//Call the quick sort method to sort the array
		sort.printArray(sorted8);	//Print sorted array
		//Determine whether the arrays are equal and return the result
		System.out.println("test result: " + test(sorted8, ansSort2));

		System.out.println("-------------------------------------");
		System.out.println("Comparing method");
		sort.printArray(array);	//print array
		System.out.println("and");
		sort.printArray(ansSort); //print anssort array
		//Call the compare method to determine the two arrays
		System.out.println("test compare: " + compare(array.clone(), ansSort));
		System.out.println();
		sort.printArray(array1);	//print array1
		System.out.println("and");
		sort.printArray(ansSort);	//print anssort1 array
		//Call the compare method to determine the two arrays
		System.out.println("test compare: " + compare(array1, ansSort));

		System.out.println("-------------------------------------");
		System.out.println("Small sum method");
		sort.printArray(array1);
		//Call the findsmallestsum method to sum the smallest two numbers in array1
		System.out.println("small sum = " + findSmallestSum(array1));


	}

	//Create a test method to determine whether the arrays are exactly the same
	public static boolean test(int[] result, int[] ans) {
		//Use a for loop to traverse the array
		for (int i = 0; i < result.length; i++) {
			//Use the if statement to determine whether each element is equal
			if (result[i] != ans[i]) {
				//If not, return false
				return false;	
			}
		}
		//If equal, return true
		return true;
	}

	/*	
	Create a compare method to Determine whether 
	the elements in the array are the same, the order can be different
	*/
	public static boolean compare(int[] arr1, int[] arr2) {
		//Create an object
		MySortAlg sort = new InsertionSort();
		//Assign the sorted arrays to array1 and array2 respectively
		int[] array1 = sort.sort(arr1);
		int[] array2 = sort.sort(arr2);
		//Use array. equals to determine whether the array elements are the same
		return Arrays.equals(array1,array2);
	}

	//Creat a find smallestsum method
	public static int findSmallestSum(int[] array) {
		//Creat an object
		MySortAlg sort = new QuickSort();
		//Initialize sum to 0
		int sum = 0;
		//Call sort method
		sort.sort(array);
		//Add the last number of the array to the second to last number
		sum = array[array.length - 1] + array[array.length - 2];
		return sum;

	}

}