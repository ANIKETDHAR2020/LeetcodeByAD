# 744. Find Smallest Letter Greater Than Target

## Overview
A simple Java program that finds the **smallest character in a sorted array that is greater than a given target character**.

The solution uses Binary Search to achieve efficient performance.

---

It demonstrates basic concepts such as:
- Binary Search
- Arrays
- Conditional logic
- Modular arithmetic
- Efficient searching

---

## How It Works

- The array of characters is sorted in ascending order.
- Binary Search is used to locate the position of the next greatest character.
- If the target is greater than or equal to all characters in the array, the search wraps around and returns the first character.

### Example

Input:
```java
letters = {'c', 'f', 'j'};
target = 'a';
```

Output:
```
c
```

---

## Constraints

- The character array must be sorted in ascending order.
- The array contains only lowercase English letters.
- At least one character will always exist in the array.
- If no greater character exists, the search wraps around to the first character.

---

## Time Complexity

```
O(log n)
```
## Space Complexity

```
O(1)
```
