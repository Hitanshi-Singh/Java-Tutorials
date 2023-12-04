
//I have made it a bit complicated, it's easy only
import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        String str = "";
        char n = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == n) {
                count++;
            } else {
                if (count > 1)
                    str = str + n + count;
                else {
                    str = str + n;
                }
                count = 1;
                n = s.charAt(i);
            }
            if (i == s.length() - 1) {
                if (count > 1)
                    str = str + n + count;
                else
                    str = str + n;

            }
        }
        System.out.println(str);
    }
}
