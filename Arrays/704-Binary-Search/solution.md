704. Binary Search
Problem Statement

Given a sorted (ascending) integer array nums and a target value, return the index of the target if it exists. Otherwise, return -1.

You must implement an algorithm with O(log n) time complexity.

Concepts Used:

Binary Search Algorithm
Array Indexing
Divide and Conquer Strategy
Iterative Approach


Approach:
Initialize two pointers: low = 0, high = n - 1
Compute mid = low + (high - low) / 2
Compare nums[mid] with target:
If equal → return mid
If target is greater → search right half
If target is smaller → search left half
Repeat until low > high
If not found → return -1


Complexity Analysis:
Time Complexity: O(log n)
(Search space halves each iteration)
Space Complexity: O(1)
(No extra memory used)


Constraints:
1 <= nums.length <= 10^4
-10^4 < nums[i], target < 10^4
nums is sorted in ascending order
All elements are unique

Edge Cases:
Target not present → return -1
Single element array
Target at first or last index


Performance (LeetCode):
Runtime: 0 ms
Memory Usage: 48 MB
