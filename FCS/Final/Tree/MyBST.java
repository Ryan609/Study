import java.util.Queue;
import java.util.LinkedList;

public class MyBST {
    private Node root;

    public MyBST() {
        this.root = null;
    }
    
    public MyBST(int data) {
        this.root = new Node(data);
    }

    public void insert(int data) {
        //Node newNode = new Node(data);
        this.root = this.insertRec(this.root, data);
    }

    public Node insertRec(Node root, int data) {  //树这里不可以加this！！！
        Node newNode = new Node(data);
        if (root == null) {
            return newNode;
        } else {
            if (data < root.getData()) {
                root.setLeft(insertRec(root.getLeft(), data));
            } else if (data > root.getData()) {
                root.setRight(insertRec(root.getRight(), data));
            }
            return root;
        }
    }

    public void PreOrder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }

    public void InOrder(Node root) {
        if (root != null) {
            InOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            InOrder(root.getRight());
        }
    }
    
    public void PostOrder(Node root) {
        if (root != null) {
            PostOrder(root.getLeft());
            PostOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    public void InOrder() {
        InOrder(root);
        System.out.println();
    }

    public void PostOrder() {
        PostOrder(root);
        System.out.println();
    }

    public void LevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(this.root);
        // Use while loop to traverse
        while (!queue.isEmpty()) {
            // Enqueue left child
            if (queue.peek().getLeft() != null) {
                queue.add(queue.peek().getLeft());
            }
            // Enqueue right child
            if (queue.peek().getRight() != null) {
                queue.add(queue.peek().getRight());
            }
            System.out.print(queue.poll().getData() + " ");
        }
        System.out.println();
    }


}
