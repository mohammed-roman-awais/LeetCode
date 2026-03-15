class Solution:
    def fourDiv(self, val):
        div, summ = 0, 0
        for i in range(1, int(val**0.5) + 1):
            if val % i == 0:
                if i == val // i:
                    div += 1
                    summ += i
                else:
                    div += 2
                    summ += i + val // i
                if div > 4:
                    return 0
        if div == 4:
            return summ
        return 0
    def sumFourDivisors(self, nums: List[int]) -> int:
        ans = 0
        for val in nums:
            ans += self.fourDiv(val)
        return ans