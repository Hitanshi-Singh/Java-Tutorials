
// package Patterns;
import java.util.*;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k <= (i - 1) * 2 - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
