import java.util.Scanner;

// package 22_Recursion1;

public class Fibonacci_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fibo(n - 1) + fibo(n - 2);
    }
}
