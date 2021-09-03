import java.util.Queue;
import java.util.LinkedList;

public class MyBST {
	private Node root;

	//base constructor
	public MyBST() {
		this.root = null;
	}

	//insert a node into the tree
	public void insert(int value) {
		//Call the insertRec method
		this.root = this.insertRec(this.root, value);
	}

	//Create insertRec method
	private Node insertRec(Node current, int value) {
		//if current node is empty
		if (current == null) {
			return new Node(value);
		} else {
			//If value is less than the value of the current node, insert it to the left
			if (value < current.getData()) {
				current.setLeft(this.insertRec(current.getLeft(), value));
				//If value is greater than the value of the current node, insert to the right
			} else if (value > current.getData()) {
				current.setRight(this.insertRec(current.getRight(), value));
			}
			return current;
		}
	}

	//search a node in the tree
	public boolean search(int value) {
		return this.searchRec(this.root, value);
	}

	//Create searchRec method
	public boolean searchRec(Node current, int value) {
		//if current node is empty，return false
		if (current == null) {
			return false;
			//if not empty,return true
		} else if (current.getData() == value) {
			return true;
		}
		//if current node greater than value,search to the left
		if (current.getData() > value) {
			return this.searchRec(current.getLeft(), value);
			////if current node less than value,search to the right
		} else if (current.getData() < value) {
			return this.searchRec(current.getRight(), value);
		} 	
		return false;
	}

	//create printLecelOrder method
	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.root);
		//Use while loop to traverse
		while (!queue.isEmpty()) {
			//Enqueue left child
			if (queue.peek().getLeft() != null) {
				queue.add(queue.peek().getLeft());
			}
			//Enqueue right child
			if (queue.peek().getRight() != null) {
				queue.add(queue.peek().getRight());
			}
			System.out.println(queue.poll().getData() + " ");
		}
	}















}