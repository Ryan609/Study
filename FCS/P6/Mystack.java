public class Mystack {
    private Node top;
    private int N;

    public Mystack() {
        this.top = null;
    }

    public void push(Node node) {
        // node.setNext(this.top);
        // this.top = node; 
        Node temp = new Node();
        temp.setData(node.getData());
        temp.setNext(top);
        top = temp;
    }

    public String pop() {
        if (this.top == null) {
            System.out.println("Stack is emptu");
        }    
        String data = top.getData();
        top = top.getNext();
        return data;
    }

    public String peek() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            System.err.println("Stack is empty");
            return "";
        }  
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void print() {
        if (this.top == null) {
            System.out.println("Empty");
        } else {
            Node tmp = this.top;
            while(tmp != null) {
                System.out.println(tmp.getData());
                System.out.println("|");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
}
