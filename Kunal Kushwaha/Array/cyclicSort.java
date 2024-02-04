import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] a = { 3, 5, 2, 1, 4 };
        // System.out.println("hey");
        int i;
        for (i = 0; i < a.length; i++) {

            while (a[i] != (i + 1)) {
                int s = a[i];
                int temp = s;
                a[i] = a[s - 1];
                a[s - 1] = temp;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
