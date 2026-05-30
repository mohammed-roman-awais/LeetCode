class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        freq = {}
        pairs = 0
        for num in nums:
            pairs += freq.get(num, 0)
            freq[num] = freq.get(num, 0) + 1
        return pairs