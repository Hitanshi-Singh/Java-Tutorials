import java.util.Scanner;

public class XpowerN_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(XpowN(x, n));
    }

    public static int XpowN(int x, int n) {
        if (n == 0) {
            return 1;
       
        return x* XpowN(x, n - 1);
    }

}
