class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq = new int[1001];
        int ans = 0;
        int maxFreq = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                freq[nums[i + 1]]++;
                if (freq[nums[i + 1]] > maxFreq) {
                    maxFreq = freq[nums[i + 1]];
                    ans = nums[i + 1];
                }
            }
        }

        return ans;
    }
}