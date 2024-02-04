import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of N : ");
        int n = sc.nextInt();
        int a = 97;
        int b = 65;
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (flag == 0) {
                    System.out.print((char) a + " ");
                    flag = 1;
                } else {
                    System.out.print((char) b + " ");
                    flag = 0;
                }
                a++;
                b++;
            }
            System.out.println();

        }
    }
}
