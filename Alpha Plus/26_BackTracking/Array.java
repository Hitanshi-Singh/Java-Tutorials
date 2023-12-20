import java.util.Arrays;
import java.util.Scanner;

// package 26_BackTracking;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        backtrack(n - 1, a, n - 1);
        System.out.println(Arrays.toString(a));
        sc.close();

    }

    public static void backtrack(int n, int a[], int i) {
        if (i == -1) {
            System.out.println(Arrays.toString(a));
            return;
        }
        a[i] = i + 1;
        backtrack(n, a, i - 1);
        a[i] -= 2;

    }

}
