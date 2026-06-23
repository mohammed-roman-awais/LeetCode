class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = 1;
        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];

            int expected = (len % 2 == 1) ? 1 : -1;

            if (diff == expected) {
                len++;
            } 
            else if (diff == 1) {
                len = 2;
            } 
            else {
                len = 1;
            }

            ans = Math.max(ans, len);
        }

        return ans == 1 ? -1 : ans;
    }
}