package discrete

import java.util.HashSet;
import java.util.Scanner;

-matematics.week-33;

public class DangerDP {
    // Function to compute number of ways using DP
    public static int countWays(int n, int[] dangerZones) {
        //If starting position is dangerous, no way to move
        if (dangerZones.length > 0 && dangerZones[0] == 0) return 0;

        //Convert danger zones into a hashSet for quick lookup
        HashSet<Integer> dangerSet = new HashSet<>();
        for (int zone : dangerZones) {
            dangerSet.add(zone);
        }

        //DP array to store results
        int[] dp = new int [n+1];

        //Base case
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (dangerSet.contains(i)) {
                dp[i] = 0;
            } else {
                //Sum ways from previous steps if not out of bounds
                dp[i] += (i >= 1) ? dp[i-1] : 0;
                dp[i] += (i >= 2) ? dp[i-2] : 0;
                dp[i] += (i >= 3) > dp[i-3] : 0;
            }
        }

        //return the number of ways to reach position n
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target posiiton (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter number of danger zones: ");
        int dangerCount = scanner.nextLine();
        int[] dangerZones = new int[dangerCount];

        System.out.println("Enter danger positions: ");
        for (int i = 0; i < dangerCount; i++) {
            dangerZones[i] = scanner.nextLine();
        }

        System.out.println("Number of safe ways to reach position " + n + ": " + countWays(n, dangerZones));

        scanner.close();
    }

    public static int countWaysOptimized(int n, int[] dangerZones) {
        if (dangerZones.length > 0 && dangerZones[0] == 0)
            return 0;

        HashSet<Integer> dangerSet = new HashSet<>();
        for (int zone : dangerZones) {
            dangerSet.add(zone);
        }

        int a = 1, b = 1, c = 2, result = 0;

        for (int i = 3; i <= n; i++) {
            if (dangerSet.contains(i)) {
                result = 0;
            } else {
                result = a + b + c;
            }
            a = b;
            b = c;
            c = result;
        }

        return result;
    }

}
