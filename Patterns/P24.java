import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            else
                System.out.print(" ");

            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            else
                System.out.print(" ");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            else
                System.out.print(" ");
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            else
                System.out.print(" ");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
