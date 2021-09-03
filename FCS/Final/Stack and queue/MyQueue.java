public class MyQueue {
    private Node head;
    private Node last;

    public MyQueue() {}

    public MyQueue(Node head, Node last) {
        this.head = null;
        this.last = null;
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.last = newNode;
            this.head= newNode;
        } else {
            Node oldLast = this.last;
            this.last = newNode;
            oldLast.setNext(this.last);
        }
    }

    public String dequeue() {
        if (this.head == null) {
            System.out.println("Queue is empty");
        }
            Node temp = this.head;
            this.head = this.head.getNext();
            return temp.getValue();
    }


    public void displayQueue() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getValue());
            current = current.getNext();
            System.out.print(" ");
        }
        System.out.println();
    }
}
