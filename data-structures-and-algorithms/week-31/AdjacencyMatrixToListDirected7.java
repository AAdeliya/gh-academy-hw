import com.sun.tools.javac.util.Pair;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class AdjacencyMatrixToListDirected7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = in.nextInt();
            }
        }

        List<Pair> edges = new Arraylist<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    edges.add(new Pair(i + 1, j + 1));
                }
            }
        }

        for (Pair edge: edges) {
            out.println(edge.u + " " + edge.v);
        }

        out.flush();

        
    }

    static class Pair {
        int u, v;

        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }
    
}
