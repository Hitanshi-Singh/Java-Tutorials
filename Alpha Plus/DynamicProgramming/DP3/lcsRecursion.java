package DynamicProgramming.DP3;

//https://leetcode.com/problems/longest-common-subsequence/description/
public class lcsRecursion {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        return longest(text1, text2, m - 1, n - 1);
    }

    public static int longest(String s1, String s2, int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (s1.charAt(m) == s2.charAt(n))
            return 1 + longest(s1, s2, m - 1, n - 1);
        else
            return Math.max(longest(s1, s2, m - 1, n), longest(s1, s2, m, n - 1));
    }
}
