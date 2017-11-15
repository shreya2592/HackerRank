"""
You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. Insert this value into its appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

Constraints

No. of nodes in the tree  500
Output Format

Return the root of the binary search tree after inserting the value into the tree.



"""

class Node:
    def __init__(self, data):
        self.data=data
        self.left=None
        self.right=None






def insert(r,val):    
    if r is None:
        r = Node('')
        r.data = val
    elif val < r.data:
        if r.left is None:
            r.left = Node('')
            r.left.data = val
        else:
            insert(r.left, val)
    else:
        if r.right is None:
            r.right = Node('')
            r.right.data = val
        else:
            insert(r.right, val)
    return r




