class Solution:
    def lexSmallest(self, s: str) -> str:
        n = len(s)
        ans = s
        for k in range(1, n + 1):
            first = s[:k][::-1] + s[k:]
            ans = min(ans, first)
            last = s[:n-k] + s[n-k:][::-1]
            ans = min(ans, last)
        return ans