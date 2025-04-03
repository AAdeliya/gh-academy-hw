import java.io.PrintWriter;
import java.util.Scanner;
public class CheckedUndirectedGraph1 {
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

        boolean isUndirected = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[i][j] != adjacencyMatrix[j][i]) {
                    isUndirected = false;
                    break;
                }
                if (i == j && adjacencyMatrix[i][j] != 0) {
                    isUndirected = false;
                    break;
                }
            }

            if (!isUndirected) {
                break;
            }
        }

        if (isUndirected) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
        in.close();
        out.close();
        
    }
    
}
