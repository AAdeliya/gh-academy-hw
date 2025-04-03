import java.util.Scanner;

public class CountEdgesUndirectedGraph3 {
    Scanner in = new Scanner(System.in);
    java.io.PrintWriter out = new java.io.PrintWriter(System.out);

    int n = in.nextInt();

    int[][] adjacencyMatrix = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            adjacencyMatrix[i][j] = in.nextInt();
        }
    }

    int edgeCount = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (adjacencyMatrix[i][j] == 1) {
                edgeCount++;
            }
        }
    }
    out.println(edgeCount);
    out.flush();
    in.close();
    out.close();
    
}
