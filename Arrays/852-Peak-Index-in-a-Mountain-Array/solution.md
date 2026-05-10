## Problem Statement
852. Peak Index in a Mountain Array
Given a mountain array , return the index of the peak element.


---

## Concepts Used

- Binary Search
- Arrays
- Conditional Logic
- Divide and Conquer

---

## Approach

The solution uses Binary Search to find the peak element efficiently.

### Steps:

1. Calculate the middle index.
2. Compare `arr[mid]` with `arr[mid + 1]`.

- If `arr[mid] > arr[mid + 1]`
  - You are in the decreasing part of the mountain.
  - The peak lies at `mid` or on the left side.
  - Move `high = mid`.

- Otherwise
  - You are in the increasing part.
  - Move `low = mid + 1`.

3. Continue until `low == high`.

At the end of the loop, both pointers point to the peak index.

### Example

Input:
```java
arr = {0,2,5,3,1};
```

Output:
```text
2
```

## Complexity

### Time Complexity

```text
O(log n)
```

### Space Complexity

```text
O(1)
```

## Constraints

- `3 <= arr.length <= 10^5`
- `0 <= arr[i] <= 10^6`
- `arr` is guaranteed to be a mountain array.
- There exists exactly one peak element.

---

## Edge Cases

### Smallest Valid Mountain Array

```java
arr = {0,1,0};
```

Output:
```text
1
```

---

### Large Input Array

Handles large mountain arrays efficiently because Binary Search avoids linear traversal .

---

## Performance

Runtime 0 ms
Memory 80.29 MB

---
