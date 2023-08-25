import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] a = {};
        int n = a.length;

        // selection sort
        int max = 0;
        for (int i = 0; i < n; i++) {
            // finding max
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[max]) {
                    max = j;

                }
            }
            // swapping
            int temp = a[max];
            a[max] = a[n - i - 1];
            a[n - i - 1] = temp;
            max = 0;

        }
        System.out.println(Arrays.toString(a));
    }
}
