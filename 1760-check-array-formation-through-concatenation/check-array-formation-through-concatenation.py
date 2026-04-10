from typing import List

class Solution:
    def canFormArray(self, arr: List[int], pieces: List[List[int]]) -> bool:
        # Map first element -> piece
        mp = {piece[0]: piece for piece in pieces}
        
        i = 0
        while i < len(arr):
            # If current element is not a starting point
            if arr[i] not in mp:
                return False
            
            piece = mp[arr[i]]
            
            # Check if piece matches
            for num in piece:
                if arr[i] != num:
                    return False
                i += 1
        
        return True