import java.util.Arrays;
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) nums[i] = arr[i];
        Arrays.sort(nums, (a, b) -> {
            int x = Integer.bitCount(a), y = Integer.bitCount(b);
            return x != y ? Integer.compare(x, y) : Integer.compare(a, b);
        });
        for (int i = 0; i < arr.length; i++) arr[i] = nums[i];
        return arr;
    }
}
