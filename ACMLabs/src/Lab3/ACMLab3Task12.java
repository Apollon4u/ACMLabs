package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ACMLab3Task12 {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> map.get(n1) - map.get(n2));

        for (int n: map.keySet()) {

            heap.add(n);

            if (heap.size() > k)
                heap.poll();
        }

        int[] top = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            top[i] = heap.poll();
        }

        return top;
    }
}
