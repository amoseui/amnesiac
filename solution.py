# -*- coding: utf-8 -*-

class Solution:
	
	def sub(a, b):
		return a - b

	def twoSum(nums, target):
		"""
		:type nums: List[int]
		:type target: int
		:rtype: List[int]
		"""
		a = 0
		b = 0
		for idx, num in enumerate(nums):
			for idx2, num2 in enumerate(nums[idx + 1:]):
				if num2 == target - num:
					a = idx
					b = idx2 + idx + 1
					break
		return [a, b]
