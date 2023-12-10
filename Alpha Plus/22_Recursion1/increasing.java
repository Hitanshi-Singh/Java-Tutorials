// package 22_Recursion1;

import java.util.Scanner;

public class increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        inc(n);
        sc.close();
    }

    public static void inc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        inc(n - 1);
        System.out.print(n + " ");
    }
}
