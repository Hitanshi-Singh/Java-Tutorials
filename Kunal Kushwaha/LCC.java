import java.util.*;

public class LCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        int c1 = 0, c2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] == 1) {
                c1++;
            } else {
                if (c1 > c2) {
                    c2 = c1;
                    c1 = 0;
                } else {
                    c1 = 0;
                }
            }
        }
        System.out.println(c2);
    }
}
