

## Problem Statement
# 34. Find First and Last Position of Element in Sorted Array
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
---

## Concepts Used

- Binary Search
- Arrays
- Conditional Logic
- Method Decomposition
- Searching Algorithms

---

## Approach

The solution uses Binary Search twice:

1. First Binary Search:
   - Finds the first occurrence of the target.
   - Continues searching toward the left side.

2. Second Binary Search:
   - Finds the last occurrence of the target.
   - Continues searching toward the right side.

Both indices are stored in an array and returned as the final answer.

### Example

Input:
```java
nums = {5,7,7,8,8,10};
target = 8;
```

Output:
```text
[3, 4]
```

---

## Complexity

### Time Complexity

```text
O(log n)
```

Two Binary Search operations are performed.

### Space Complexity

```text
O(1)
```

Only constant extra space is used.

---

## Constraints

- The array is sorted in non-decreasing order.
- Array size can be zero.
- Duplicate elements may exist.
- If the target does not exist, return `[-1, -1]`.

---

## Edge Cases

- Empty array
- Target not present
- Single element array
- All elements are the same
- Target appears only once
- Target appears multiple times


```

---

## Performance

Runtime 0 ms
Memory 48.42MB
---
