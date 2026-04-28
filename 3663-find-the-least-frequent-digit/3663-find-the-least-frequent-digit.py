class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        freq = [0] * 10
        
        for digit in str(n):
            freq[int(digit)] += 1
        
        min_freq = float('inf')
        for f in freq:
            if f > 0:
                min_freq = min(min_freq, f)
        
        for i in range(10):
            if freq[i] == min_freq:
                return i