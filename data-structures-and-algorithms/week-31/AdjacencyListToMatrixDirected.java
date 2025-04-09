import java.io.PrintWriter;
import java.util.Scanner;
public class AdjacencyListToMatrixDirected {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextLine();
        int m = in.nextLine();

        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextLine(); //source vertex
            int v = in.nextLine(); //destination vertex

            adjacencyMatrix[u - 1][v - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(adjacencyMatrix[i][j] + " ");
            }

            out.println();
        }

        out.flush();

    }
}
