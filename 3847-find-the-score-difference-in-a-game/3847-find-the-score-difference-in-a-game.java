class Solution {
    public int scoreDifference(int[] nums) {
        int ans = 0;
        boolean firstActive = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) firstActive = !firstActive;
            if (i % 6 == 5) firstActive = !firstActive;
            if (firstActive) ans += nums[i];
            else ans -= nums[i];
        }
        return ans;
    }
}