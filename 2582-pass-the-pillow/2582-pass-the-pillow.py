class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        cycle = n - 1
        
        rounds = time // cycle
        rem = time % cycle
        
        if rounds % 2 == 0:
            return 1 + rem
        
        return n - rem