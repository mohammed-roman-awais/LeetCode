class Solution:
    def findTheLongestBalancedSubstring(self, s: str) -> int:
        i = 0
        n = len(s)
        ans = 0

        while i < n:
            zero = 0
            one = 0

            while i < n and s[i] == '0':
                zero += 1
                i += 1

            while i < n and s[i] == '1':
                one += 1
                i += 1

            ans = max(ans, 2 * min(zero, one))

        return ans