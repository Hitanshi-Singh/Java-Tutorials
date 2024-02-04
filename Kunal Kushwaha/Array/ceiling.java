
public class ceiling {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 5;
        int start = 0, c = Integer.MIN_VALUE;
        int end = arr.length - 1;

        // Binary Search
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                c = target;
                System.out.println(target);
                break;
            }
        }
        if (target != c) {
            if (arr[start] >= target) {
                System.out.println(arr[start]);
            } else
                System.out.println(arr[end]);
        }

    }
}