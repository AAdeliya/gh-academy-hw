package data

import java.io.PrintWriter;
import java.util.Scanner;

-structures-and-algorithms.week-32;

public class DepthFirstSearchComponentsSize {
    static int n;
    static int[][] adjacencyMatrix;
    static boolean[] visited;
    static int componentSize;

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int startVertex = in.nextInt();

        adjacencyMatrix = new int[n][n];
        visited = new boolean[n];
        componentSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  adjacencyMatrix[i][j] = in.nextInt();
          
        }

    }

    dfs(startVertex - 1);
    out.println(componentSize);
    out.flush();
    
}

static void dfs(int vertex) {
    visited[vertex] = true;
    componentSize++;
    for (int neighbor = 0; neighbor < n; neighbor++) {
        if (adjacencyMatrix[vertex][neighbor] == 1 && !visited[neighbor]) {
            dfs(neighbor);
        }}
        
    }
}
