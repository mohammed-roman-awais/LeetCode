class Solution:
    def minimumRightShifts(self, nums: List[int]) -> int:
        n = len(nums)
        
        count = 0
        
        for i in range(n):
            if nums[i] > nums[(i + 1) % n]:
                count += 1
                idx = i
        
        if count > 1:
            return -1
        
        if count == 0:
            return 0
        
        return n - idx - 1