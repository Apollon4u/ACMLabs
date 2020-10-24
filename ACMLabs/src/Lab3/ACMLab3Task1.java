package Lab3;

import java.util.HashSet;

public class ACMLab3Task1 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }

        return false;
    }
}
