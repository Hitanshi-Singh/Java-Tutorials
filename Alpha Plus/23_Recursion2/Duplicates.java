import java.util.Scanner;

// package 23_Recursion2;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int i = 0;
        String newStr = "";
        System.out.println(removeDuplicate(str, newStr, i, new boolean[26]));
        sc.close();
    }

    public static String removeDuplicate(String str, String newStr, int i, boolean[] map) {
        if (i == str.length()) {
            return newStr;
        }
        char ch = str.charAt(i);
        if (map[(int) ch - 97] == false) {
            newStr += ch;
            map[(int) ch - 97] = true;
        }
        return removeDuplicate(str, newStr, i + 1, map);

    }
}
