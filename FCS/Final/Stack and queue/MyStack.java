public class MyStack {
    private Node top;

    public MyStack() {}

    public MyStack(Node top) {
        this.top = null;
    }

    public void push(String value) {
        Node temp = new Node(value);
        temp.setNext(top);
        top = temp;
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.getValue());
        }
    }

    public Node pop() {
        if (this.top == null) {
            System.out.println("Stack is empty");
        }
        Node topNode = top;
        if (top.getNext() == null) {
            top = null;
        } else {
            top = top.getNext();
        }      
        return topNode;
    }

    public void print() {
        if (this.top == null) {
            System.out.println("Stack is empty");
        } else {
            Node tmp = this.top;
            while (tmp != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        }
    }
}
