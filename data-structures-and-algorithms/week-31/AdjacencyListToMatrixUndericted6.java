import java.io.PrintWriter;
import java.util.Scanner;

public class AdjacencyListToMatrixUndericted6 {
    Scanner in = new Scanner(System.in);
    PrintWriter out  = new PrintWriter(System.out);
    //read the number of vertices and edges 
    int n = in.nextInt();
    int m = in.nextInt();

    //create 2D array to store the adjacency matrix to all 0s

    int[][] adjacencyMatrix = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            adjacencyMatrix[i][j] = 0; //initialize all elements to 0
        }
    }

    ///read m lines, each reperesenting an eadge(n, v)

    for (int i = 0; i < m; i++) {
        int u = in.nextInt();
        int v = in.nextInt();

        //for an undirected grpah if there's an edge between u and v we set both to 1
        //we substrcat 1 from u aand v because the input vertices are 1-based indexed
        //while out matriux is 0-based indexed 

        adjacencyMatrix[u - 1][v -  1] = 1;
        adjacencyMatrix[v - 1][u - 1] = 1;
    } 

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            out.print(adjacencyMatrix[i][j] + " ");
        }

        out.println();
    }
    out.flush();
    in.close();
    out.close();
    
}
