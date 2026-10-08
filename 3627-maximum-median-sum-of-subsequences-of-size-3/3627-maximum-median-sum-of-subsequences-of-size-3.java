class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for (int i = n / 3; i < n; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}