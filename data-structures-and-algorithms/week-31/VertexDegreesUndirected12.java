import java.io.PrintWriter;
import java.util.Scanner;

public class VertexDegreesUndirected12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] adjasencyMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjasencyMatrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int degree = 0;
        for (int j = 0; j < n; j++) {
            degree += adjasencyMatrix[i][j];
        }

        out.print(degree);
        }

        
    }
    
}
