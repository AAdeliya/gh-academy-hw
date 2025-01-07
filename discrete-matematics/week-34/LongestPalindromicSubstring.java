package discrete-matematics.week-34;

public class LongestPalindromicSubstring {

    
public static void main(String[] args) throws IOException {
        // Reading input from the input file
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String s = br.readLine().trim();
        br.close();
        
        int n = s.length();
        if (n == 0) {
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            writer.println(0);
            writer.println("");
            writer.close();
            return;
        }

        // Create a DP table
        boolean[][] dp = new boolean[n][n];

        // Variables to track the start and length of the longest palindromic substring
        int start = 0;
        int maxLength = 1;

        // Base cases: Single characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Base cases: Two consecutive identical characters
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Fill the DP table for substrings of length >= 3
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1; // End index of the substring

                // Check if the substring s[i:j+1] is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        // Extract the longest palindromic substring
        String longestPalindrome = s.substring(start, start + maxLength);

        // Write the result to the output file
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        writer.println(maxLength); // Length of the longest palindromic substring
        writer.println(longestPalindrome); // The substring itself
        writer.close();
    }
}
