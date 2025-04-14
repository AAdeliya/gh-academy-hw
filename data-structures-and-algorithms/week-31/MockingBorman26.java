import java.io.PrintWriter;
import java.util.Scanner;

public class MockingBorman26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] distanceMatrix = new int[n][n];
    for (int i = 0; i < n ; i++) {
        for (int j = 0; j < n; j++) {
            distanceMatrix[i][j] = in.nextInt();
        }
    }

    int minRouteDistance = Integer.MAX_VALUE;
    int[] bestRoute = null;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) continue;
            for (int k = 0; k < n; k++) {
                if (k == i || k == j) continue;

                int currentRouteDistance = distanceMatrix[i][j] + distanceMatrix[j][k] + distanceMatrix[k][i];

                if (currentRouteDistance < minRouteDistance) {
                    minRouteDistance = currentRouteDistance;
                    bestRoute = new int[]{i + 1, j + 1, k + 1};
                }
            }
        }
    }

    if (bestRoute != null) {
        for (int i = 0; i < 3; i++) {
            out.print(bestRoute[i] + (i == 2 ? "" : ""));
        }

        out.println();
    }

    out.flush();
    }
    
}
