public class Node {
	private int index;

	////parametric constructor
	public Node(int index) {
		this.index = index;
	}

	//get and set method
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	//creat printNode method
	public void printNode() {
		System.out.print("Node: " + index);
	}
}