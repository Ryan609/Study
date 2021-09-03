public class Node {

	private int data;
	private Node left;
	private Node right;

	//base constructor
	public Node() {}

	//parametric constructor
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	//get and set method
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	//Create printnode method
	public void printNode() {
		System.out.println("Node data: " + data);
	}



}