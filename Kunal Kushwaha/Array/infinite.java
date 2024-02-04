
public class infinite {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 23, 45, 55, 67, 88, 90, 99 };
        int target = 23;
        System.out.println(findingRange(arr, target));
    }

    public static int findingRange(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = end + (end - temp + 1) * 2;
        }
        return binarySearch(arr, target, start, end);

    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
