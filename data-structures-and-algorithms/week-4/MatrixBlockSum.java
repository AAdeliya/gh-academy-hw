package data-structures-and-algorithms.week-4;

public class MatrixBlockSum {
    public int[][] MatrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] sum = new int[m + 1][n + 1];

        for (int r = 1; r <= m; r++) {
            for (int c = 1; c <n; c++) {
                sum[r][c] = mat[r - 1][c - 1]
                + sum[r - 1][c]
                + sum[r][c - 1]
                - sum[r - 1][c - 1];
            }
        }

        int[][] ans = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n ; c++) {
                int r1 = Math.max(0, r - k), c1 = Math.max(0, c - k);
                int r2 = Math.min(0, r + k), c2 = Math.min(n - 1, c + k);
                r1++; c1++; r2++; c2++;

                ans[r][c] = sum[r2][c2] 
                - sum[r2][c1 - 1]
                - sum[r1 - 1][c2]
                + sum[r1 - 1][c1 - 1];
            }
        }

        return ans;
    }
    
}
