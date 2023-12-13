public class msaOptimised {
    public static void main(String[] args) {
        int a[] = { 1, -2, 6, -1, 3 };
        int n = a.length;
        int prefix[] = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("The max sum is : " + max);
    }
}
