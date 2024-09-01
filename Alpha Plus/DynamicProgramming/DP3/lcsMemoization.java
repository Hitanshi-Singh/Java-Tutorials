package DynamicProgramming.DP3;

public class lcsMemoization {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = -1;
        return longest(s1, s2, m, n, dp);
    }

    public static int longest(String s1, String s2, int m, int n, int dp[][]) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        else {
            if (s1.charAt(m - 1) == s2.charAt(n - 1))
                return dp[m][n] = 1 + longest(s1, s2, m - 1, n - 1, dp);
            else
                return dp[m][n] = Math.max(longest(s1, s2, m, n - 1, dp), longest(s1, s2, m - 1, n, dp));

        }
    }
}
