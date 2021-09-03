import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.addList(2);
        list.addList(4);
        list.addList(6);
        list.printList();

        list.delete(4);
        list.printList();


    }
}
