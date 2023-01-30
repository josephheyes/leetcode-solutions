class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        map = {}
        for n in nums:
            if n not in map:
                map[n] = 1
            else:
                map[n] += 1
        for i in map:
            if map[i] == 1:
                return i