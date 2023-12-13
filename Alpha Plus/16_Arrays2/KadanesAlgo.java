public class KadanesAlgo {
    public static void main(String[] args) {
        int a[] = { 1, -2, 3, -4, 5, 6 };
        int n = a.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (sum < 0)
                sum = 0;
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
