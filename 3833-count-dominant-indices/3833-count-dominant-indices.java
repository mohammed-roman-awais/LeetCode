class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int sum = nums[n - 1];
        int ans = 0;
        for (int i = n - 2; i >= 0; i--) {
            if ((long) nums[i] * (n - 1 - i) > sum) ans++;
            sum += nums[i];
        }
        return ans;
    }
}