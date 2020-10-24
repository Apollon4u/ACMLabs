package Lab1.Arrays;

public class ACMLab1Task2 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
