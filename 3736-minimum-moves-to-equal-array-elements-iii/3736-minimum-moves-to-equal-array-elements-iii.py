class Solution:
    def minMoves(self, nums: List[int]) -> int:
        mx = max(nums)
        moves = 0
        
        for num in nums:
            moves += (mx - num)
        
        return moves