

public class LargestRectangleinHistogram {
    public int largestRectangle(int[] heights) {
    int n = heights.length();
    if (n == 0) {
        return 0;

        int maxArea= 0;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = -1;
        right[n-1] = n;


        for (int i = 1; i<n ; i++) {
            int orev = i -1;
            while (prev>=0 && )
        }
        }
    }
