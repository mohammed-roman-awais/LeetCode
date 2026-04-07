from typing import List

class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)  # Step 1
        
        total_sum = sum(nums)
        curr_sum = 0
        result = []
        
        for num in nums:
            curr_sum += num
            result.append(num)
            
            if curr_sum > total_sum - curr_sum:
                break
        
        return result