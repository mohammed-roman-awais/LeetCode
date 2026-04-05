class Solution:
    def firstUniqueEven(self, nums: list[int]) -> int:
        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0) + 1
        for num in nums:
            if num % 2 == 0 and freq[num] == 1:
                return num
        return -1