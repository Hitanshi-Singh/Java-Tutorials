import java.util.Scanner;

public class Tiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For the size of board 2 x n, Enter n : ");
        int n = sc.nextInt();
        System.out.println(tile(n));
        sc.close();
    }

    public static int tile(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;
        // the work
        // vertical choice
        int fnm1 = tile(n - 1);

        // horizontal choice
        int fnm2 = tile(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }
}