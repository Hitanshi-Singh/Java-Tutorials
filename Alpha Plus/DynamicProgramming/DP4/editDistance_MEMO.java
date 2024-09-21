package DynamicProgramming.DP4;

public class editDistance_MEMO {
    public static void main(String[] args) {
        String w1 = "horse";
        String w2 = "ros";
        System.out.println(minDistance(w1, w2));
    }

    public static int minDistance(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = -1;
                }
            }
        }
        return min(w1, w2, m, n, dp);
    }

    public static int min(String w1, String w2, int m, int n, int dp[][]) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;
        if (dp[m][n] != -1)
            return dp[m][n];
        if (w1.charAt(m - 1) == w2.charAt(n - 1))
            return dp[m][n] = min(w1, w2, m - 1, n - 1, dp);
        else {
            // add
            int ans1 = min(w1, w2, m, n - 1, dp) + 1;
            // deletion
            int ans2 = min(w1, w2, m - 1, n, dp) + 1;
            // replacement
            int ans3 = min(w1, w2, m - 1, n - 1, dp) + 1;
            return dp[m][n] = Math.min(ans3, Math.min(ans1, ans2));
        }
    }
}
