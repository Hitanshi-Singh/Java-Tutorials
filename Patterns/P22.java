import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int c = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                if (c == 1)
                    c = 0;
                else
                    c = 1;
            }
            System.out.println();
        }
    }
}
