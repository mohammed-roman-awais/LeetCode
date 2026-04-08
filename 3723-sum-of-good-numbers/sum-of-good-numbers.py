from typing import List

class Solution:
    def sumOfGoodNumbers(self, nums: List[int], k: int) -> int:
        n = len(nums)
        total = 0
        
        for i in range(n):
            good = True
            
            # Check left
            if i - k >= 0 and nums[i] <= nums[i - k]:
                good = False
            
            # Check right
            if i + k < n and nums[i] <= nums[i + k]:
                good = False
            
            if good:
                total += nums[i]
        
        return total