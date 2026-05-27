class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        ans = 0
        n = len(arr)
        for i in range(n):
            total = (i + 1) * (n - i)
            odd = (total + 1) // 2
            ans += arr[i] * odd
        return ans