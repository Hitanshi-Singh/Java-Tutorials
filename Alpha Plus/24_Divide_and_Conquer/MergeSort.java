
// package 24_ Divide and Conquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 5, -1, 66, 43, 2, -9 };
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // left part of array
        mergeSort(a, si, mid);
        // right part of array
        mergeSort(a, mid + 1, ei);
        merge(a, si, ei, mid);
    }

    public static void merge(int a[], int si, int ei, int mid) {
        // check for smaller element
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        // for leftover elems of first part of array
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // for leftover elems of second part of array
        while (j <= ei) {
            temp[k++] = a[j++];
        }
        // copying the elements to the original array
        for (i = si, k = 0; k < temp.length; i++, k++)
            a[i] = temp[k];

    }

}
