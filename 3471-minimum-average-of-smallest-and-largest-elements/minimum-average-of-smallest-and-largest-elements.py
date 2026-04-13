class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        nums.sort()
        i, j = 0, len(nums) - 1
        ans = float('inf')

        while i < j:
            avg = (nums[i] + nums[j]) / 2
            ans = min(ans, avg)
            i += 1
            j -= 1

        return ans