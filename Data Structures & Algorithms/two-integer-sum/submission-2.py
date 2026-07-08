class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        hashmap = {}
        for i in range(len(nums)):
            compliment = target - nums[i]
            if compliment in hashmap:
                return sorted([i, hashmap[compliment]])
            hashmap[nums[i]] = i

        return []
        