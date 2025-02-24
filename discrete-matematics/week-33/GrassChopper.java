package discrete

import java.util.Scanner;

-matematics.week-33;

public class GrassChopper {
    public static int countWays(int n) {
        // Edge case
        if (n < 0)
            return 0;

        // Base case
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        // DP array to store resukts
        int[] dp = new int[n + 1];

        // Initialize base cases
        dp[0] = 1; // stay at start
        dp[1] = 1; // 1 step
        dp[2] = 2; // 2 ways

        // Fill DP table using bottom-up approach
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; // recurrence relation

        }

        // return the resilt for n
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target posiion (n): ");
        int n = scanner.nextInt();

        System.out.println("Number of ways to reach position " + n + " : " + countWays(n));
        scanner.close();
    }

}public static int countWaysOptimized(int n) {
    if (n == 0) return 1;
    if (n == 1) return 1;
    if (n == 2) return 2;

    int a = 1, b = 1, c = 2, result = 0;

    for (int i = 3; i <= n; i++) {
        result = a + b + c;  // f(n) = f(n-1) + f(n-2) + f(n-3)
        a = b;
        b = c;
        c = result;
    }

    return result;
}
