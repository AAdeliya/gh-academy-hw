import java.io.PrintWriter;
import java.util.Scanner;

public class CheckRegularGraph17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] vertexDegree = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            vertexDegree[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            vertexDegree[u]++;
            vertexDegree[v]++;
        }

        boolean isRegular = true;
        if (n > 0) {
            int firstDegree = vertexDegree[1];
            for (int i = 2; i <= n; i++) {
                if (vertexDegree[i] != firstDegree) {
                    isRegular = false;
                    break;
                }
            }
        }

        if (isRegular) {
            out.print("YES");
        } else {
            out.print("NO");
        }
         
    }
    
}
