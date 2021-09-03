public class Queue {
	private Node front;
	private Node back;

	public Queue() {
	}

	public Node getFront() {
		return front;
	}

	public Node getBack() {
		return back;
	}

	public void enqueue(Student tmpStudent) {
		Node newNode = new Node(tmpStudent);
		if (this.front == null) {
			this.front = newNode;
			this.back = newNode;
			return;
		} else {
			this.back.setNext(newNode);
			this.back = newNode;
		}
	}

	public Student dequeue() {
		if (this.front == null) {
			return null;
		}

		Student oldFront = this.front.getInfo();
		this.front = this.front.getNext();

		if (this.front == null) {
			this.back = null;
		}
		return oldFront;
	}

	public String peek() {
		if (this.front == null) {
			return " ";
		}
		return this.front.getInfo().getName();
	}

	// //print queue list
 //    public void displayQueue(){
 //        //if the queue is empty
 //        if (this.front == null) {
 //            System.out.println("There are no students waiting for a scholarship");
 //        }
 //        int i = 1;
 //        // get current node
 //        Node currentNode = this.front;
 //        while(currentNode != null) {
 //            //get current student
 //            Student currentStudent = currentNode.getInfo();
 //            //print information
 //            System.out.print("#" + i + " ");
 //            System.out.print(currentStudent.getName() + ", ");
 //            System.out.print(currentStudent.getAge() + " years old, ");
 //            System.out.print(currentStudent.getPeriod());
 //            if (currentStudent.getPeriod() == 1){
 //                System.out.print("st");
 //            }
 //            else if (currentStudent.getPeriod() == 2){
 //                System.out.print("nd");
 //            }
 //            else if (currentStudent.getPeriod() == 3){
 //                System.out.print("rd");
 //            }
 //            else{
 //                System.out.print("th");
 //            }
 //            System.out.print(" year in Hogwarts;\n");
 //            //next node(student)
 //            currentNode = currentNode.getNext();
 //            //i = i + 1
 //            i += 1;
 //        }
 //    }

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
				System.out.print("#" + count + " " + temp.getInfo().getName() + " " + temp.getInfo().getAge() + "years old" +  " " + temp.getInfo().getPeriod()+per + " year in Hogwarts;");
				temp = temp.getNext();
				System.out.println(" ");
				count++;
		}
	}


}