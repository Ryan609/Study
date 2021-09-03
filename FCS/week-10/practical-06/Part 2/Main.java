public class Main {
	public static void main(String[] args) {
		//creat an object
		MyGraph graph = new MyGraph();
		//Define a matrix
		int matrix[][] = {{0,0,1,0},{1,0,0,1},{0,0,1,1},{0,1,1,0}};

		//Print out the matrix
		System.out.println("Input matrix:");
		for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
          	}
            System.out.println();
        }
        System.out.println();

        System.out.println("Output for displayAdjListArray");
		graph.matrixToList(matrix); //call matrixtolist method to Conversion matrix
		graph.displayAdjListArray(); //call displayAdjListArray to print result.
	}
}