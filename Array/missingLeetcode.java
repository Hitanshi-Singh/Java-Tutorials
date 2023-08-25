import java.util.*;

public class missingLeetcode {
    public static void main(String args[]) {
        int[] a = { 2, 5, 4, 3, 0 };

        System.out.println(missingNumber(a));
    }

    public static int missingNumber(int[] nums) {
        int i;
        int n = nums.length;
        for (i = 0; i < n; i++) {

            while (nums[i] != (i + 1) && nums[i] != n) {
                int s = nums[i];
                int temp = s;
                nums[i] = nums[s - 1];
                nums[s - 1] = temp;
            }

        }
        if (nums[n - 1] != n)
            return n;
        else {
            for (i = 0; i < n; i++) {
                if (nums[i] != i)
                    return nums[i];
            }
        }
        return -1;
    }
}
