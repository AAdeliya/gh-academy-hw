import java.io.PrintWriter;
import java.util.Scanner;

public class VertexInOutDegreesEdgeListDirected15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            inDegree[i] = 0;
            outDegree[i] = 0;
        }

        for (int i = 0; i < m; i++) {
           int u = in.nextInt();
           int v = in.nextInt();
           outDegree[u]++;
           inDegree[v]++;
        }

        for (int u = 1; i <= n; i++) {
            out.print(inDegree[i] + " " + outDegree[i]);
        }

        out.flush();
    }
    
}
