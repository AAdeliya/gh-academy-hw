public class RangeSumQuery-2D {
    class NumArray {
        int[][]  sum;

        public NumArray(int[][] nums) {
            int n = nums.length;
            int m = nums[0].length;
            sum = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    sum[i][j] = nums[i - 1][j- 1]
                    + sum[i - 1][j]
                    +sum[i][j - 1]
                    - sum[i - 1][j - 1];
                }
            }
        }

        public int sumRange(int r1, int c1, int r2, int c2) {
            return sum[r2][c2]
            - sum[r2][c2 - 1]
            - sum[r1 - 1][c2]
            + sum[r1 - 1][c1 - 1];

            // int RED_RECTANGLE = sums[row2+1][col2+1];
        // int PURPLE_RECTANGLES = sums[row1][col2+1] + sums[row2+1][col1];
        // int BLUE_RECTANGLE = sums[row1][col1];
        // return RED_RECTANGLE - PURPLE_RECTANGLES + BLUE_RECTANGLE;
        // }
    }
    
}
