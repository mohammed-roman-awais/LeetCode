class Solution:
    def minimumMoves(self, s: str) -> int:
        i,count=0,0

        while i < len(s):
            if 'X' == s[i] :
                count+=1
                i+=3
            else:
                i+=1         
        return count          