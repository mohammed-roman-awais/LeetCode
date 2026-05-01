class Solution:
    def minimumFlips(self, n: int) -> int:
        s = bin(n)[2:]  
        
        i, j = 0, len(s) - 1
        flips = 0
        
        while i < j:
            if s[i] != s[j]:
                flips += 2
            i += 1
            j -= 1
        
        return flips