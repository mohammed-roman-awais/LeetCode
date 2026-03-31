class Solution:
    def digitCount(self, num: str) -> bool:
        freq = [0] * 10
        for ch in num:
            freq[int(ch)] += 1        
        for i in range(len(num)):
            if freq[i] != int(num[i]):
                return False
        
        return True