class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long[] suffixMin = new long[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum - suffixMin[i + 1]);
        }
        return ans;
    }
}