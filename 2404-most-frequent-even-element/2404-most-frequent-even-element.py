from typing import List
from collections import Counter

class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        freq = Counter()
        for num in nums:
            if num % 2 == 0:
                freq[num] += 1
        if not freq:
            return -1
        max_freq = max(freq.values())
        ans = float('inf')
        for num in freq:
            if freq[num] == max_freq:
                ans = min(ans, num)
        return ans