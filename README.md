## Problem Description  

Given a binary tree with `n` nodes, determine whether all its nodes satisfy the **sum property**:  
- Each node's value should be equal to the sum of its child nodes' values.  
- A `NULL` child is considered to have a value of 0.  
- Leaf nodes are considered to follow the sum property since they have no children.  

Return:  
- `1` if all nodes satisfy the property.  
- `0` otherwise.  

---  

### Solution Approach  

The problem is solved using **recursive traversal** with the following steps:  

1. **Base Cases**:  
   - If the current node is `null`, return `true` (property is satisfied).  
   - If the current node is a leaf node, return `true`.  

2. **Node Validation**:  
   - Check if the node's value equals the sum of its left and right children.  
   - For `null` children, their value is considered as `0`.  

3. **Recursive Check**:  
   - Validate the left and right subtrees recursively to ensure they also satisfy the property.  

4. **Final Return**:  
   - Combine the results of the left and right subtree checks and the current node's validation.  

---  

### Key Points  

- **Recursive Helper Function**:  
  - Traverses the tree and validates the sum property at each node.  

- **Edge Cases**:  
  - Handles scenarios with `null` children or leaf nodes seamlessly.  

- **Boolean Logic**:  
  - Uses logical operators to ensure all nodes are validated.  

---  

### Time and Space Complexity  

- **Time Complexity**: O(n), where `n` is the number of nodes in the binary tree. Each node is visited once.  
- **Space Complexity**: O(h), where `h` is the height of the binary tree, due to the recursion stack.  

---  

For a detailed explanation and code, visit the [repository here](https://www.geeksforgeeks.org/problems/children-sum-parent/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=hildren-sum-parent).  

---  
