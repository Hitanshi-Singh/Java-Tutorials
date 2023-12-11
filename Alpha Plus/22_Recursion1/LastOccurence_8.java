import java.util.Scanner;

public class LastOccurence_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        System.out.println(lastOcc(a, 0, key, -1));
    }

    public static int lastOcc(int a[], int i, int key, int temp) {
        if (a[i] == key) {
            temp = i;
        }
        if (i == a.length - 1)
            return temp;
        return lastOcc(a, ++i, key, temp);
    }
}
