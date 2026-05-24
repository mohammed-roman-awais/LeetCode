class Solution:
    def minAbsoluteDifference(self, nums: list[int]) -> int:
        ones = []
        twos = []
        
        for i, num in enumerate(nums):
            if num == 1:
                ones.append(i)
            elif num == 2:
                twos.append(i)
        
        if not ones or not twos:
            return -1
        
        ans = float('inf')
        
        for i in ones:
            for j in twos:
                ans = min(ans, abs(i - j))
        
        return ans