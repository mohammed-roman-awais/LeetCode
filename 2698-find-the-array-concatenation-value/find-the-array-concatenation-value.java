class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0, j = nums.length - 1;
        long ans = 0;

        while (i <= j) {
            if (i == j) {
                ans += nums[i];
            } else {
                String s = nums[i] + "" + nums[j];
                ans += Long.parseLong(s);
            }
            i++;
            j--;
        }

        return ans;
    }
}