import java.util.Scanner;

class get_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of whose ith bit you wanna check");
        int n = sc.nextInt();
        System.out.println("Enter i ki value");
        int i = sc.nextInt();
        if ((n & (1 << i)) == 0)
            System.out.println(0);
        else
            System.out.println(1);
        sc.close();
    }
}