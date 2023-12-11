import java.util.Scanner;

// package 22_Recursion1;

public class Sorted_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements : ");
        int n = sc.nextInt();
        System.out.println("enter n elements : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(checkSort(a, 0));
    }

    public static boolean checkSort(int[] a, int i) {
        if (i == a.length - 1)
            return true;

        if (a[i] > a[i + 1])
            return false;

        return checkSort(a, i + 1);

    }
}
