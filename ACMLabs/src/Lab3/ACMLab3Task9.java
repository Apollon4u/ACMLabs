package Lab3;

import java.util.HashMap;

public class ACMLab3Task9 {
    public int subarraySum(int[] nums, int k) {

        int counter = 0, sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k))
                counter += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return counter;

    }
}
