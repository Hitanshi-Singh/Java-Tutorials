import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        sub(str, 0, "");
        sc.close();
    }

    public static void sub(String str, int i, String newStr) {
        if (i == str.length()) {
            if (newStr == "") {
                System.out.println("null");

            } else
                System.out.println(newStr);
            return;
        }
        sub(str, i + 1, newStr);

        newStr += str.charAt(i);
        sub(str, i + 1, newStr);

    }

}
