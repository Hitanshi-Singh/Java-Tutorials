
public class interview3 {
    public static void main(String[] args) {
        char arr[] = { 'a', 'c', 'e', 'g', 'h', 'l', 'p' };
        char target = 'd';
        System.out.println(nextGreatestLetter(arr, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }
        System.gc();// this statement call garbage collection and saves memory was used in a
                    // optimised on leetcode
        return letters[start % letters.length];
    }
}
