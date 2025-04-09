#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        """
        map = {}

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in map:
                return [map[diff], i]
            map[nums[i]] = i

        return []

        
# @lc code=end

