public class MyQueue {
    private Node front;
    private Node rear;
    private int N;

    public  MyQueue() {
        this.front = null;
        this.rear = null;
    }
    public boolean  isEmpty() {
        return this.N == 0;
    }
    public void enqueue(String newNode) {
        Node prev = rear;
        rear = new Node();
        rear.setData(newNode);
        rear.setNext(null);
        if (isEmpty()) {
            front = rear;
        } else {
            prev.setNext(rear);
        }
        N++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return "";
        } 
        String item = front.getData();
        front = front.getNext();
        N--;
        return item;
    }

    public void displayQueue() {
       Node current = front;
       while (current != null) {
           current.printNode();
           current = current.getNext();
           System.out.println(" ");
       }
       System.err.println();
    }

}
