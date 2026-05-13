## Problem Statement
33. Search in Rotated Sorted Array
Given a rotated sorted array `nums` and a target value, return the index of the target element.
If the target is not present, return `-1`.
The array was originally sorted in ascending order and then rotated at some pivot index.
https://leetcode.com/problems/search-in-rotated-sorted-array
### Example

```java
nums = {4,5,6,7,0,1,2};
target = 0;
```

Output:
```text
4
```

---

## Concepts Used

- Binary Search
- Rotated Sorted Array
- Conditional Logic
- Divide and Conquer
- Pivot Finding Technique

---

## Approach

The solution is divided into two main parts:

### 1. Find Pivot

The pivot is the index where rotation happens.

Example:

```text
4 5 6 7 0 1 2
        ^
      pivot
```

The `findpivot()` method uses Binary Search to locate the pivot element efficiently.

### 2. Apply Binary Search

After finding the pivot:

- If the array is not rotated:
  - Perform normal Binary Search on the entire array.

- If the target equals the pivot element:
  - Return pivot index directly.

- Otherwise:
  - Decide whether the target lies in the left half or right half.
  - Perform Binary Search on that section only.

---

## Complexity

### Time Complexity

```text
O(log n)
```

- Finding pivot takes `O(log n)`
- Binary Search takes `O(log n)`

### Space Complexity

```text
O(1)
```
---

## Constraints

- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- All values are unique.
- `nums` is sorted and rotated.
- `-10^4 <= target <= 10^4`

---

## Edge Cases

### Array Not Rotated

```java
nums = {1,2,3,4,5};
target = 3;
```

Output:
```text
2
```

---

### Target Not Present

```java
nums = {4,5,6,7,0,1,2};
target = 8;
```

Output:
```text
-1
```

---

### Single Element Array

```java
nums = {1};
target = 1;
```

Output:
```text
0
```

---

### Target at Pivot

```java
nums = {4,5,6,7,0,1,2};
target = 7;
```

Output:
```text
3
```

---

## Performance

Runtime 0ms
Memory43.65MB
---
