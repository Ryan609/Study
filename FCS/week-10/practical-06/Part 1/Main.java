public class Main {
	public static void main(String[] args) {
		//Create an object
		MyBST bst = new MyBST();

		//Call the insert method to insert data
		bst.insert(5);
		bst.insert(2);
		bst.insert(7);
		bst.insert(1);
		bst.insert(4);
		bst.insert(6);
		bst.insert(8);
		bst.insert(3);
		bst.printLevelOrder(); //call printLevelOrder method

		//call search method and print result
		System.out.println("1 is in BST: " + bst.search(1));
		System.out.println("12 is in BST: " + bst.search(12));
	}
}