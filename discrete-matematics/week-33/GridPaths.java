package discrete

import java.util.Scanner;

-matematics.week-33;

public class GridPaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String row  = scanner.nextLine();
            grid[i] = row.toCharArray();
        }

        //dp[i][j] stores ythe number of paths from(0,0) to (i, j)
        int[][] = new int[n][n];

        //Modulo value to prevent integer overflow
        int MOD = 1000000007;

        //Base case: If the starting cell is a trap, there are no paths
        if (grid[0][0] == '*') {
            System.out.println(0);
            scanner.close();
            return;
        }

        //Initialize the starting cell (top-left) to 1
        dp[0][0] = 1;

        //Fill the first row. We can only reach (0,j) if all cells to its left are free
        for (int j = 1; j < n; j++) {
            if (grid[0][j] == '.') {
                dp[0][j] = dp[0][j-1]; // Number of paths is same as the cell to the left

            } else {
                dp[0][j] = 0; //trap, no paths
            }
        }

        //Fill the first column. We can only reach (i,0) if all cells aboce it are free
        for (int i = 1; i < n; i++) {
            if (grid[i][0] == '.') {
                dp[i][0] = dp[i-1][0];

            } else {
                dp[i][0] = 0; // trap, no paths
            }
        }

        //iterate thru the rest of the grid 
    }

    }

    for(

    int i = 1;i<n;i++)
    {
        for (int j = 1; j < n; j++) {
            // If the current cell is a trap, there are no paths to it
            if (grid[i][j] == '*') {
                dp[i][j] = 0;
            } else {
                // the number of paths to (i,j) is the sum of paths from the cell above (i-1, j)
                // and the cell to the left (i, j -1), modulo MOD
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

    }

    // The result is stored in dp[n-1][n-1] (bottom-right cell)
    System.out.println(dp[n-1][n-1]);scanner.close();
}}
