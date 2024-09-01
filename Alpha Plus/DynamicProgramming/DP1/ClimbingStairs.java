import java.util.Arrays;

public class ClimbingStairs {
    public static int ways(int n) {//O(2^n)
        if (n == 0)
            return 1;
        if (n == -1)
            return 0;
        return ways(n - 1) + ways(n - 2);

    }

    // memoization
    public static int ways(int n, int dp[]) {//O(n)
        if (n == 0)
            return 1;
        if (n == -1)
            return 0;
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = ways(n - 1, dp) + ways(n - 2, dp);
        return dp[n];
    }

    // Tabulation
    public static int countWays(int n) {//O(n)
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1)
                dp[i] = dp[0] + 0;// dp[1]=1;
            else
                dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n));
        System.out.println(ways(n, dp));
        System.out.println(countWays(n));
    }
}
