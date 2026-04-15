from typing import List
from collections import defaultdict
class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        freq = defaultdict(int)
        n = len(nums)
        for arr in nums:
            for num in arr:
                freq[num] += 1
        result = []
        for num in freq:
            if freq[num] == n:
                result.append(num)
        return sorted(result)