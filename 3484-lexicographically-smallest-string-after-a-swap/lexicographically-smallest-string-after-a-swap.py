class Solution:
    def getSmallestString(self, s: str) -> str:
        s = list(s)
        
        for i in range(len(s) - 1):
            a = int(s[i])
            b = int(s[i + 1])
            
            # same parity check
            if (a % 2 == b % 2) and (a > b):
                # swap
                s[i], s[i + 1] = s[i + 1], s[i]
                return "".join(s)
        
        return "".join(s)