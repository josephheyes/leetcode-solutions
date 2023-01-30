class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        hashmap = {}
        for i, num in enumerate(nums):
            if target-num in hashmap:
                return [i, hashmap[target-num]]
            hashmap[num] = i

