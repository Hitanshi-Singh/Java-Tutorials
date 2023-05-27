package Array;

import java.util.*;

class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}