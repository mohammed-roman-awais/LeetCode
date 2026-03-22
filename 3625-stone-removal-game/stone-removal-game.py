class Solution:
    def canAliceWin(self, n: int) -> bool:
        stones_to_remove = 10
        alice_turn = True
        
        while stones_to_remove > 0:
            if n < stones_to_remove:
                return not alice_turn  # current player loses
            
            n -= stones_to_remove
            stones_to_remove -= 1
            alice_turn = not alice_turn
        
        return False