package data

import java.io.PrintWriter;
import java.util.Scanner;

-structures-and-algorithms.week-32;

public class CellDeletion {
    static int m, n;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        m = in.nextInt();
        n = in.nextInt();

        grid = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++)  {
            String row = in.next(); //read each row as a string of 3

            for (int j = 0; j < n; i++) {
                grid[i][j] = row.charAt(j); //store each charatcetr in the grid array
                visited[i][j] = false; //cell as not visited

            }
        }

        int componentCount = 0; //count of connected components

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //if current cell is '#' and not yet visited yet, it's a start of a new component
                if (grid[i][j] == '#' && !visited[i][j]) {
                    componentCount++;
                    dfs(i, j); //perform dfs starting from this clee
                }
            }
        }

        out.print(componentCount);
        out.flush();
    }

    static void dfs(int row, int col) {
        //base case for recursion termination

        //1.Check if the current cell is out of grid boundaries
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return; //stop DFS if out of bounds
        }

        //2.Check if th ecurrent cell is deleted (.) or already visited
        if (grid[row][col] == '.' || visited[row][col]) {
            return;
        }

        visited[row][col] = true;


        //recursively explore adjacency cells (up, down, left, right)

        dfs(row + 1, col); //down
        dfs(row - 1, col); //up
        dfs(row, col + 1); //right
        dfs(row, col - 1); //left
    }
    
}
