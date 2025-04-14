import java.io.PrintWriter;
import java.util.Scanner;

public class CheckTransitiveDirectedGraph22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        boolean isTransitive = true;
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (u == v) continue;
                for (int w = 0; w < n; w++) {
                    if (v == w || u == w) continue;

                    boolean uvEdgeExists = (adjacencyMatrix[u][v] == 1);
                    boolean vwEdgeExists = (adjacencyMatrix[v][w] == 1);
                    if (uvEdgeExists && vwEdgeExists) {
                        if (adjacencyMatrix[u][w] != 1) {
                            isTransitive = false;
                            break;
                        }
                    }
                }

                if (!isTransitive) {
                    break;
                }
            }

            if (isTransitive) {
                out.print("YES");
            } else {
                out.print("NO");
            }

            out.flush();
        }

    }
    
}
