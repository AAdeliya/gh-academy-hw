package data-structures-and-algorithms.week-32;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheckIfTree {
    static int n; 
    static int[][] adjacencyMatrix;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = in.nextInt();
        adjacencyMatrix = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = in.nextInt();
            }
        }

        int edgeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    edgeCount++;
                }
            }


            if (edgeCount != n - 1) {
                out.println("NO");
                out.flush();
                return;
            }

            dfs(0);

            int visitedCount = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    visitedCount++;
                }
            }

            if (visitedCount == n) {
                out.print("YES");
            } else {
                out.print("NO");
            }

            out.flush();
        }
    }

        static void dfs(int vertex) {
            visited[vertex] = true;
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (adjacencyMatrix[vertex][neighbor] == 1 && !visited[neighbor]) {
                    dfs(neighbor);
                }
            }
        }
        
    }
    
}
