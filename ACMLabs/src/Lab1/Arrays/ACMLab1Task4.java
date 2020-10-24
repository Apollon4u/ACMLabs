package Lab1.Arrays;

import java.util.HashSet;

public class ACMLab1Task4 {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < set.size() + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
