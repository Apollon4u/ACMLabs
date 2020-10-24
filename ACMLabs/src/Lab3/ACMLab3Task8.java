package Lab3;

import java.util.Random;

public class ACMLab3Task8 {
    int nums[];
    Random random = new Random();

    public ACMLab3Task8(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        while (true) {
            int index = random.nextInt(nums.length);
            if (nums[index] == target)
                return index;
        }
    }
}
