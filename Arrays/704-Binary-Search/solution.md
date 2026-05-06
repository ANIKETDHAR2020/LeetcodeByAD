#  704. Binary Search

---

##  Problem Statement
Given a sorted (ascending) integer array `nums` and a target value, return the index of the target if it exists. Otherwise, return `-1`.

You must implement an algorithm with **O(log n)** time complexity.
https://leetcode.com/problems/binary-search

---

##  Concepts Used
- Binary Search Algorithm  
- Array Indexing  
- Divide and Conquer  
- Iterative Approach  

---

##  Approach
- Initialize `low = 0`, `high = n - 1`
- Compute `mid = low + (high - low) / 2`
- If `nums[mid] == target` → return `mid`
- If target is greater → search right half
- Else → search left half
- Repeat until `low > high`
- Return `-1` if not found

---

##  Complexity Analysis
- **Time Complexity:** `O(log n)`  
- **Space Complexity:** `O(1)`

---

##  Constraints
- `1 <= nums.length <= 10^4`  
- `-10^4 < nums[i], target < 10^4`  
- Array is sorted in ascending order  
- All elements are unique  

---

##  Edge Cases
- Target not found → return `-1`  
- Single element array  
- Target at first or last index  

---

##  Performance
- Runtime: 0 ms  
- Memory: 48 MB  

---
##  ad
### ads
---
