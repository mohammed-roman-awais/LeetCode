class Solution:
    def maxSum(self, nums: List[int]) -> int:
        best = {}
        ans = -1
        for num in nums:
            mx_digit = max(str(num))
            if mx_digit in best:
                ans = max(ans, num + best[mx_digit])
                best[mx_digit] = max(best[mx_digit], num)
            else:
                best[mx_digit] = num
        return ans