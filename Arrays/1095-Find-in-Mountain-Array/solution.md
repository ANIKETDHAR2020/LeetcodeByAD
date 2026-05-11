##  Problem Statement
1095. Find in Mountain Array
A mountain array is defined as an array where:
- Elements strictly increase up to a peak element
- Then strictly decrease after the peak

---

##  Concepts Used
- Binary Search  
- Order Agnostic Binary Search  
- Peak Element Detection  
- Divide and Conquer  
- Array Indexing  

---

##  Approach

### Step 1 → Find Peak Element
Use Binary Search to locate the peak index in the mountain array.

Example:
```text
[1,2,3,4,5,3,1]
             ↑
          Peak
```

---

### Step 2 → Search Left Half
The left side of the peak is sorted in ascending order.

Apply Binary Search:
```text
[1,2,3,4,5]
```

---

### Step 3 → Search Right Half
If target is not found on left side, search the descending part.

```text
[3,1]
```

---

### Step 4 → Return Result
- If target exists → return index
- Otherwise → return `-1`

---

##  Functions Breakdown

### `search()`
Main controller function:
- Finds peak
- Searches ascending side
- Searches descending side
- Returns final answer

---

### `peakIndexInMountainArray()`
Finds the peak element index using Binary Search.

---

### `orderAgnosticBS()`
Performs Binary Search on:
- Ascending arrays
- Descending arrays

using the same function.
---

## 📊 Complexity Analysis

### Time Complexity
```text
O(log n)
```

---

### Space Complexity
```text
O(1)
```
---

##  Constraints
- `3 <= arr.length <= 10^4`
- `0 <= arr[i] <= 10^9`
- Array is guaranteed to be a mountain array


---

## ⚠️ Edge Cases
- Target at peak element  
- Target in ascending side  
- Target in descending side  
- Target not present   

---

## 🚀 Example

### Input
```text
arr = [1,2,3,4,5,3,1]
target = 3
```

### Output
```text
2
```
---
