import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int a[], int si, int ei) {
        if (si >= ei)
            return;
        // last element
        int pIdx = partition(a, si, ei);
        quickSort(a, si, pIdx - 1);// left
        quickSort(a, pIdx + 1, ei);// right
    }

    public static int partition(int a[], int si, int ei) {
        int pivot = a[ei];
        int i = si - 1;// to make place for elements smaller than pivot
        for (int j = 0; j < ei; j++) {
            if (a[j] <= pivot) {
                i++;
                // swap
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        a[ei] = a[i];// dont write pivot =a[i]
        a[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int a[] = { 6, 2, 2, 6, 7, 9, 7, 12 };
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}
