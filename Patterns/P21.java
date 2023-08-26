import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the value of n : ");
            int n = sc.nextInt();
            int c = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {

                    System.out.print(c + "\t");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
