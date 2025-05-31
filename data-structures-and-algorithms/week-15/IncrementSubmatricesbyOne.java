public class IncrementSubmatricesbyOne {

  public int[][] incrementSubmatricesByOne(int n, int[][] queries) {
    int[][] diff = new int[n + 1][n + 1];
    for (int[] q: queries) {
      int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3];
      diff[r1][c1] += 1;

      if (c2 + 1 < n) diff[r1][c2+ 1] -= 1;
      if (r2 + 1 < n) diff[r2 + 1][c1] -= 1;
      if (r2 + 1 < n && c2 + 1 < n) diff[r2 + 1][c2 + 1] += 1;

    }

    int[][] mat = new int[n + 1 ][n + 1];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i > 0 ) diff[i][j] += diff[i - 1][j];
        if (j > 0) diff[i][j] += diff[i][j - 1];
        if ( j> 0 && i > 0) diff[i][j] -= diff[i - 1][ j - 1];
        mat[i][j] = diff[i][j];

      }
    }

    return mat;

  }
  
}


class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
// Creating a bigger array, so that I don't have to care
        // about going out of bounds in any computations.
        int[][] a = new int[n + 2][n + 2];
 
        for (int[] query : queries) {
            // Intentionally adding 1 to all indices to make
            // the array and queries 1-indexed.
            int r1 = query[0] + 1, c1 = query[1] + 1;
            int r2 = query[2] + 1, c2 = query[3] + 1;
 
            // O(1) per update
            // Apply +1 on a[r1 .. n][c1 .. n]
            a[r1][c1] += 1;
            // Undo +1 on a[r2+1 .. n][c1 .. n]
            a[r2 + 1][c1] -= 1;
            // Undo +1 on a[r1][c2+1 .. n]
            a[r1][c2 + 1] -= 1;
            // Apply +1 on a[r2+1 .. n][c2+1 .. n] because +1 was undone twice (-2)
            a[r2 + 1][c2 + 1] += 1;
        }
        
        // O(N^2)
        // Compute 2D prefix sums, i.e. the final array.
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                a[r][c] = (a[r - 1][c] +
                           a[r][c - 1] -
                           a[r - 1][c - 1]) + a[r][c];
            }
        }
 
        // O(N^2)
        // The problem requires returning a strictly n x n array
        // [my array "a" is (n+2)x(n+2)], so I copy results to this array "r"
        // that I will return. 
        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = a[i + 1][j + 1];
            }
        }
        return r;
    }
}