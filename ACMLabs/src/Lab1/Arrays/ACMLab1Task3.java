package Lab1.Arrays;

public class ACMLab1Task3 {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        ans[0] = 1;

        for (int i = 1; i < ans.length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int multiplier = 1;

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * multiplier;
            multiplier *= nums[i];
        }

        return ans;
    }
}
