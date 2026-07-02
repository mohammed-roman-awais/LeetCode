class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] seen = new boolean[k + 1];
        int count = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            int x = nums.get(i);

            if (x <= k && !seen[x]) {
                seen[x] = true;
                count++;

                if (count == k) {
                    return nums.size() - i;
                }
            }
        }

        return nums.size();
    }
}