from typing import List

class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        m, n = len(grid), len(grid[0])
        total = m * n
        
        k %= total
        
        flat = []
        for row in grid:
            flat.extend(row)
        
        rotated = [0] * total
        for i in range(total):
            new_index = (i + k) % total
            rotated[new_index] = flat[i]
        
        result = []
        for i in range(0, total, n):
            result.append(rotated[i:i+n])
        
        return result