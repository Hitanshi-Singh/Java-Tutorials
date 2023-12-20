import java.util.Scanner;

public class FriendPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frnd(3));
        sc.close();
    }

    public static int frnd(int i) {
        if (i == 2 || i == 1)
            return i;

        return (frnd(i - 1)) + ((i - 1) * frnd(i - 2));
    }

}
