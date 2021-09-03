public class LinkList {

    private Node head;

    public LinkList() {

    }

    public LinkList(Node head) {
        this.head = null;
    }

    public void addList(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        }else {
            Node n = this.head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(newNode);
        }
    
    }

    public void delete(int value) {
        if (this.head == null) {
            return;
        } else if (this.head.getValue() == value) {
            this.head = this.head.getNext();
            return;
        }
        Node temp = this.head;
        Node prev = null;
        while (temp != null && temp.getValue() != value) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp != null) {
            prev.setNext(temp.getNext());
        }
    }

    public void printList() {
        Node temp = this.head;
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

}
