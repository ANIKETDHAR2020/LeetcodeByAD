## Problem Statement
 162. Find Peak Element
Given an integer array `nums`, find a peak element and return its index.

A peak element is an element that is strictly greater than its neighboring elements.

You may assume:
- `nums[-1] = -∞`
- `nums[n] = -∞`

The array may contain multiple peaks, and returning the index of any peak is valid.

---

## Concepts Used

- Binary Search
- Arrays
- Conditional Logic
- Divide and Conquer

---

## Approach

The solution uses Binary Search to efficiently locate a peak element.

### Steps:

1. Calculate the middle index.
2. Compare `nums[mid]` with `nums[mid + 1]`.

- If `nums[mid] > nums[mid + 1]`
  - You are on the decreasing slope.
  - A peak exists at `mid` or on the left side.
  - Move `high = mid`.

- Otherwise
  - You are on the increasing slope.
  - A peak exists on the right side.
  - Move `low = mid + 1`.

3. Continue until `low == high`.

At the end, both pointers point to a peak element index.

### Example

Input:
```java
nums = {1,2,3,1};
```

Output:
```text
2
```

---

## Complexity

### Time Complexity

```text
O(log n)
```

### Space Complexity

```text
O(1)
```

---

## Constraints

- `1 <= nums.length <= 1000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `nums[i] != nums[i + 1]` for all valid `i`

---

## Edge Cases

### Single Element Array

```java
nums = {1};
```

Output:
```text
0
```

---

### Multiple Peaks

```java
nums = {1,2,1,3,5,6,4};
```

Possible Output:
```text
1 or 5
```

Both indices are valid peak elements.

---

## Performance

Runtime 0 ms
Memory 44.29 MB

---
