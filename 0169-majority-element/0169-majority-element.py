class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()

        n = len(nums)
        tar = n // 2

        cnt = 1

        if n == 1:
            return nums[0]

        for i in range(n - 1):

            if nums[i] == nums[i + 1]:
                cnt += 1

                if cnt > tar:
                    return nums[i]

            else:
                cnt = 1