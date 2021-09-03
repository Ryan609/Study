public class Main {
    public static void main(String[] args) {
        MyGraphs g = new MyGraphs(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(4, 3);

        // g.printList();
        System.out.println();
        g.printMatrix();
    }
}
