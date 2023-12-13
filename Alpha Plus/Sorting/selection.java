package Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int max, index = 0;
        for (int i = 0; i < a.length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = i; j < a.length; j++) {
                if (max < a[j]) {
                    max = a[j];
                    index = j;
                }
            }
            int temp = a[i];
            a[i] = max;
            a[index] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
