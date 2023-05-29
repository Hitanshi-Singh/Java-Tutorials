import java.util.*;

public class ceiling_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'a', 'c', 'e', 'g', 'h', 'l', 'p' };
        char target = 'd';
        System.out.println(ceil(arr, target));
    }

    static char ceil(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start);
            if (target <= arr[mid]) {
                end = mid - 1;
            } else if (target >= arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid])
                return arr[mid];

        }
        return arr[start];

    }
}
