package Lab1.Arrays;

public class ACMLab1Task5 {
    public double findMaxAverage(int[] nums, int k) {

        int sum = nums[0];

        for (int i = 1; i < k; i++) {
            sum += nums[i];
        }

        double ans = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, sum);
        }

        return ans / k;
    }
}
