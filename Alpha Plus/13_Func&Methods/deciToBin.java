import java.util.Scanner;

public class deciToBin {
    public static int decToBin(int n) {
        int result = 0;
        for (int i = n, pow = 0; i > 0; i = i / 2, pow++) {
            int rem = i % 2;
            result += rem * Math.pow(10, pow);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}