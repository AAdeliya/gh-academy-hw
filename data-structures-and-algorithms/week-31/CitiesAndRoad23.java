import java.io.PrintWriter;
import java.util.Scanner;

public class CitiesAndRoad23 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        if (n == 0) {
            out.print(0);
            out.flush();
            return;
        }

        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = in.nextInt();
            }
        }

        int roadCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    roadCount++;
                }
            }
        }

        out.print(roadCount);
        out.flush();
        
    }
    
}
