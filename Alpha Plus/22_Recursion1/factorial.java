// package 22_Recursion1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
