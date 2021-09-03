public class Queue {
	private Node front;
	private Node back;

	public Queue() {
		this.front = null;
		this.back = null;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public void setBack(Node back) {
		this.back = back;
	}

	public Node getFront() {
		return this.front;
	}

	public Node getBack() {
		return this.back;
	}

	public void enqueue(Student tmpStudent) {
		Node temp = new Node(tmpStudent);
		if (front == null) {
			front = temp;
			back = temp;
		} else {
			back.setNext(temp);
			back = temp;
		}
	}

	public Student dequeue() {
		if (this.front == null) {
			return null;
		} else {
			Node temp = this.front;
			front = front.getNext();
			return temp.getInfo();

		}
	}

	public String peek() {
		if (this.back == null) {
			return " ";
		} else {
			Node tmp = this.back;
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			setFront(tmp);
			return front.getInfo().getName();
		}

	}

	public void displayQueue() {
		if (this.front == null) {
			System.out.println("There are no students waiting for a scholarship");
		}
		Node temp = this.front;

		int count = 1;

		while (temp != null) {
			String per = "st";
				if (temp.getInfo().getPeriod()==2) {
					per = "nd";
				} else if (temp.getInfo().getPeriod()==3) {
					per= "rd";
				}
				System.out.println("#" + count + " " + temp.getInfo().getName() + " " + temp.getInfo().getAge() + "years old" +  " " + temp.getInfo().getPeriod()+per + "year in Hogwarts;");
				temp = temp.getNext();
				System.out.println(" ");
				count++;
		}
	}


}