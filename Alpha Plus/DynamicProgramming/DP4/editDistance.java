package DynamicProgramming.DP4;
//RECURSION 2^N
public class editDistance {
    public static void main(String[] args) {
        String w1="horse";
        String w2="ros";
        System.out.println(minDistance(w1, w2));
    }

    public static int minDistance(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();
        return min(w1, w2, m, n);
    }

    public static int min(String w1, String w2, int m, int n) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;
        if (w1.charAt(m - 1) == w2.charAt(n - 1))
            return min(w1, w2, m - 1, n - 1);
        else {// add
            int ans1 = min(w1, w2, m, n - 1) + 1;
            // deletion
            int ans2 = min(w1, w2, m - 1, n) + 1;
            // replacement
            int ans3 = min(w1, w2, m - 1, n - 1) + 1;
            return Math.min(ans3, Math.min(ans1, ans2));
        }
    }
}
