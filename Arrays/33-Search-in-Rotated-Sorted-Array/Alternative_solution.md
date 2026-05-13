## Problem Statement
# Search in Rotated Sorted Array with Duplicate Elements

Given a rotated sorted array `nums` that may contain duplicate values and a target value, return the index of the target element.
If the target is not present, return `-1`.
The array was originally sorted in ascending order and then rotated at some pivot point.

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
- Pivot Detection
- Conditional Logic
- Duplicate Handling
- Divide and Conquer

---

## Approach

The solution works in two main phases:

### 1. Find Pivot with Duplicate Handling

The `findpivotwithduplicatsvalues()` method finds the rotation pivot using Binary Search.

Unlike normal rotated arrays, duplicates create ambiguity because:

```java
array[start] == array[mid] == array[end]
```

In this case:
- Normal Binary Search logic cannot determine the sorted half.
- The algorithm safely skips duplicate values after checking whether `start` or `end` is the pivot.

### Pivot Detection Cases

#### Case 1

```java
array[mid] > array[mid + 1]
```

Then `mid` is the pivot.

---

#### Case 2

```java
array[mid] < array[mid - 1]
```

Then `mid - 1` is the pivot.

---

#### Case 3

If duplicates exist:

```java
array[start] == array[mid] && array[mid] == array[end]
```

Skip duplicates carefully while checking for pivot conditions.

---

### 2. Apply Binary Search

After finding the pivot:

- If array is not rotated:
  - Perform normal Binary Search.

- If target equals pivot element:
  - Return pivot index.

- Otherwise:
  - Decide whether target lies in left half or right half.
  - Perform Binary Search only on that section.

---

## Complexity

### Time Complexity

#### Average Case

```text
O(log n)
```

Binary Search efficiently reduces the search space.

#### Worst Case

```text
O(n)
```

When many duplicate elements exist, duplicate skipping may degrade performance to linear time.

Example:

```java
{1,1,1,1,1,1,1}
```

---

### Space Complexity

```text
O(1)
```

---

## Constraints

- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- Array may contain duplicate values.
- Array is sorted and rotated.
- `-10^4 <= target <= 10^4`

---

## Edge Cases

### Array Not Rotated

```java
nums = {1,2,3,4,5};
target = 4;
```

Output:
```text
3
```

---

### Duplicate Elements Everywhere

```java
nums = {2,2,2,2,2};
target = 2;
```

Output:
```text
Any valid index
```

---

### Target Not Present

```java
nums = {2,5,6,0,0,1,2};
target = 3;
```

Output:
```text
-1
```

---

### Pivot Hidden by Duplicates

```java
nums = {2,2,2,3,4,2};
target = 3;
```

Output:
```text
3
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
