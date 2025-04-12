import java.io.PrintWriter;
import java.util.Scanner;

public class VertexInOutDegreeDirected14 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = in.nextInt();
    int[][] adjacencyMatrix = new  int[n][n];
    for (int i  = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        adjacencyMatrix[i][j] = in.nextInt();

        }
    }

    for (int i = 0; i < n; i++) {
        int inDegree = 0;
        int outDegree = 0;

        for (int j = 0; j < n; j ++) {
            inDegree += adjacencyMatrix[i][j];

        }

        for (int j = 0; j < n; j++) {
            outDegree += adjacencyMatrix[j][i];
        }

        out.print(inDegree + " " + outDegree);

    }

    out.flush();
}
}
