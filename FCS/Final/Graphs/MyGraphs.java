import java.util.LinkedList;

public class MyGraphs {
    private int v; //vertices
    private int[][] adjMatrix;
    private LinkedList[] adjList;

    public MyGraphs(int v) {
        this.v = v;

        this.adjMatrix = new int[v][v];

        this.adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            this.adjList[i] = new LinkedList();
        }
    }

    public void addEdge(int v1, int v2) {
        //add edge in matrix
        this.adjMatrix[v1][v2] = 1;
        this.adjMatrix[v2][v1] = 2;

        //add in list
        this.adjList[v1].add(v2);
        this.adjList[v2].add(v1);
    }

    public void printList() {
        for (int i = 0; i < this.v; i++) {
            System.out.println(i + ":");
            this.adjList[i].print();
            
        }
    }

    public void printMatrix() {
        System.out.print("  ");
        for (int i = 0; i < this.v; i++) {
            System.out.print(i + ": ");
        }
        System.out.println();

        for (int i = 0; i < this.v; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < this.v; j++) {
                System.out.print(this.adjMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Node bfs(int query) {
        
    }



    
}
