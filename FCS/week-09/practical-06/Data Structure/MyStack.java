public class MyStack {

	private Node top;

	//Basic constructor
	public MyStack() {
		this.top = null;
	}

	//Create a push method to put the node on the stack
	public void push(Node node) {
		//Set top to the next node of the new node
		node.setNext(this.top);
		//Set the new node to top
		this.top = node;
	}

	//Create a pop method to remove the top node from the stack
	public Node pop() {
		//Determine whether it is empty, if it is empty, print the text
		if(top == null) {
			System.out.println("Stack is empty");
		}

		Node topNode = top;
		if(top.getNext() == null) {
			top = null;
		} else {
			top = top.getNext();
		}

		return topNode;
	}

	public Node peek() {
		if(top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		return top;
	}

	public boolean isEmpty() {
		if(top == null) {
			return true;
		} else {
			return false;  
		}
	}
}