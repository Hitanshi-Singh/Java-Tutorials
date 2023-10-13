import java.util.Scanner;

public class maxSubArraySum {
    public static int returnSubSum(int arr[], int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("enter the array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                int sum = returnSubSum(arr, i, j);
                if (sum > max)
                    max = sum;
            }

        }
        System.out.println("the max sum is :" + max);
    }
}