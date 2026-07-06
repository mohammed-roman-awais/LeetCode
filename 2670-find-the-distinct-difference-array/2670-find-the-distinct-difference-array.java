class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Map<Integer, Integer> suffix = new HashMap<>();
        for (int num : nums) {
            suffix.put(num, suffix.getOrDefault(num, 0) + 1);
        }

        Set<Integer> prefix = new HashSet<>();

        for (int i = 0; i < n; i++) {
            prefix.add(nums[i]);

            suffix.put(nums[i], suffix.get(nums[i]) - 1);
            if (suffix.get(nums[i]) == 0) {
                suffix.remove(nums[i]);
            }

            ans[i] = prefix.size() - suffix.size();
        }

        return ans;
    }
}