import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] a = {};
        int n = a.length;
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else
                    break;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
