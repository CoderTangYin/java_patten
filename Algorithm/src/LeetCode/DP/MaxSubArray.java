package LeetCode.DP;

public class MaxSubArray {

    public static void main(String[] args) {
      System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxVal = dp[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i-1] <= 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i-1] + nums[i];
            }
            maxVal = Math.max(dp[i], maxVal);
        }
        return maxVal;
    }
}
