import java.util.Scanner;

public class XpowerN_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(XpowN(x, n, x));
    }

    public static int XpowN(int x, int n, int temp) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return temp;
        }
        temp = temp * x;
        return XpowN(x, n - 1, temp);
    }

}
