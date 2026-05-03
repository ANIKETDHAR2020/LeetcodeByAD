# 1672. Richest Customer Wealth

 https://leetcode.com/problems/richest-customer-wealth/

## Problem Statement

.. given a 2D array `accounts` where:

* Each row represents a customer
* Each column represents money in a bank account
Return the **maximum wealth** among all customers.

---
## Approach
* Traverse each row (customer)
* For each row:
      * Calculate the sum of all accounts
      * Track the maximum sum found
      * Return the maximum value
---
## Complexity Analysis
* Time Complexity: O(n × m)
  (n = number of rows, m = number of columns)

* Space Complexity: O(1)
  (no extra space used)

---
## Key Learning
* Efficient row-wise traversal in 2D arrays
* Maintaining running sum and max simultaneously
--
## Edge Cases

* Single customer
* Single account per customer
* All values are zero

---
Runtime 0ms 
Memory 44.66MB
