package Lab2;

import java.util.HashSet;

public class ACMLab2Task8 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }

        int[] ans = new int[intersection.size()];

        int iterator = 0;
        for (int num : intersection) {
            ans[iterator++] = num;
        }

        return ans;
    }
}
