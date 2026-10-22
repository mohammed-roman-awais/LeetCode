class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        int score = nums[0] + nums[1];
        int operations = 1;

        for (int i = 2; i + 1 < n; i += 2) {
            if (nums[i] + nums[i + 1] == score) {
                operations++;
            } else {
                break;
            }
        }

        return operations;
    }
}