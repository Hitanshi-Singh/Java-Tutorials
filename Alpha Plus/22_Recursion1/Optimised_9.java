import java.util.Scanner;

public class Optimised_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(opt(x, n));
    }

    public static int opt(int x, int n) {
        if (n == 0)
            return 1;
        int halfPow = opt(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        if (n % 2 == 0)
            return halfPowSq;
        else
            return x * halfPowSq;

    }
}
