class Solution:
    def minCosts(self, cost: List[int]) -> List[int]:
        ans = []
        mini = float('inf')
        
        for c in cost:
            mini = min(mini, c)
            ans.append(mini)
        
        return ans