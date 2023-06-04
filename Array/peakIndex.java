public class peakIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 6, 5, 4, 3, 2 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] < arr[mid - 1]) {
                end = mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
