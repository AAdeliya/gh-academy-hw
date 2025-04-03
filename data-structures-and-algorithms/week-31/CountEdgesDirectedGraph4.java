import java.io.PrintWriter;
import java.util.Scanner;
public class CountEdgesDirectedGraph4 {
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

        int edgeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
    
}
