import java.util.LinkedList;

public class MyGraph {
	LinkedList adjListArray[];

	//initlization of array requires size
	public MyGraph() {}

	//creat graph methods
	public void Graph(int v) {
		adjListArray = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjListArray[i] = new LinkedList<Node>();
		}
	}

	//creat matrixTolist methods 
	public void matrixToList(int[][] matrix) {
		Graph(matrix.length);
		//Use a for loop to traverse the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1) {
					adjListArray[i].add(new Node(j));
				}
			}
		}
	}

	//creat displayAdjListArray method
	public void displayAdjListArray() {
		int size;
		//Use for loop to traverse
		for (int i = 0; i < adjListArray.length; i++) {
			System.out.print(i + ": ");
			size = adjListArray[i].size();
			//Use the if statement to judge, if size is zero, it is empty.
			if (size == 0) {
				System.out.println("Empty");	
			}
			//Use for loop to traverse
			for (int j = 0; j < size; j++) {
				Node node = (Node)adjListArray[i].get(j);
				node.printNode();
				if (j + 1 < size) {
					System.out.print("->");
				}
			}
			System.out.println();
		}
	}
}