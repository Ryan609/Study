public class Main {
    public static void main(String[] args) {
        MyBST bst = new MyBST();

        bst.insert(6);
        bst.insert(3);
        bst.insert(8);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        bst.PreOrder();
        bst.InOrder();
        bst.PostOrder();
        bst.LevelOrder();
    }
}
