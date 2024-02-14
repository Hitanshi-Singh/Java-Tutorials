
// package 14_ advanced_Patterns;

import java.util.Scanner;

public class hollowRect {
    public static void hRect(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Row");
        int r = sc.nextInt();
        System.out.println("enter Column");
        int c = sc.nextInt();
        hRect(r, c);
        sc.close();
    }
}
