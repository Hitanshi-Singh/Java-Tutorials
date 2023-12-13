import java.util.Scanner;

public class set_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of whose ith bit you wanna change : ");
        int n = sc.nextInt();
        System.out.print("\nEnter i ki value : ");
        int i = sc.nextInt();
        System.out.println("\nThe binary value is " + Integer.toBinaryString(n));
        System.out.println("The changed string is : " + Integer.toBinaryString(n | (1 << i)));
    }
}
