
// package 22_Recursion1;
import java.util.*;

public class decreasing_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        dec(n);
    }

    static void dec(int n) {
        System.out.print(n + "\t");
        if (n > 1)
            dec(n - 1);
    }
}
