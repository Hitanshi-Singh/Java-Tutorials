// package 22_Recursion1;

import java.util.Scanner;

public class FirstOccurence_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        System.out.println(firstOcc(a, 0, key));
    }

    public static int firstOcc(int a[], int i, int key) {
        if (a[i] == key)
            return i;
        if (i == a.length - 1)
            return -1;
        return firstOcc(a, ++i, key);
    }
}
