import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        boolean v = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("Not a Palindrome");
                v = false;
                break;
            }
        }
        if (v) {
            System.out.println("Palindrome");
        }
        sc.close();
    }

}
