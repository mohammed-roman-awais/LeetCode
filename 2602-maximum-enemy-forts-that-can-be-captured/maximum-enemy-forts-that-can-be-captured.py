class Solution:
    def captureForts(self, forts: List[int]) -> int:
        max_capture = 0
        prev = -1   # stores index of last non-zero fort
        for i in range(len(forts)):
            if forts[i] != 0:
                if prev != -1 and forts[i] != forts[prev]:
                    max_capture = max(max_capture, i - prev - 1)
                prev = i
        return max_capture