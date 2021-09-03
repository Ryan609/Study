public class MyQueue {

	private Node front, rear;

	//Basic constructor
	public MyQueue() {
		front = null;
		rear = null;
	}

	//add the element to the back
	public void enqueue(Node node) {
		//If rear is empty, the new node is located at both rear and front
		if(rear == null) {
			rear = node;
			front = node;
		} else {
			//Make the new node the next node of the rear node
			rear.setNext(node);
			rear = node;
		}
	}
	//Create dequeue method
	public String dequeue() {
		//If the queue is empty, return null
		if(front == null) {
			return null;
		}
		//Put data into temporary space
		Node frontNode = front;
		//Set the next node to the front
		front = front.getNext();
		return frontNode.getData();
	}

	//Create isempty method to determine whether it is empty
	public boolean isEmpty() {
		if(front == null) {
			return true;
		} else {
			return false;
		}
	}

	//Create the display queue method
	public void displayQueue() {
		//If front is null, print the text
		if(front == null) {
			System.out.println("Queue is empty");
			return;
		}
		//Store data in a temporary node
		Node node = this.front;
		//Use a while loop
		while(node != null) {
			//call printnode method
			node.printNode();
			node = node.getNext();
		}
	}

}