// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class leetcode448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i, n = nums.length;
        for (i = 0; i < n; i++) {
            while (nums[i] != (i + 1)) {
                int s = nums[i];
                if (nums[s - 1] != s) {
                    int temp = nums[i];
                    nums[i] = nums[s - 1];
                    nums[s - 1] = temp;

                } else
                    break;

            }
        }
        List<Integer> arr = new ArrayList<>();

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                arr.add(i + 1);

            }
        }
        return arr;
    }
}
