"""

Complete the preOrder function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single line of space-separated values.

Input Format

Our hidden tester code passes the root node of a binary tree to your preOrder function.

Constraints

 Nodes in the tree 

Output Format

Print the tree's preorder traversal as a single line of space-separated values.
"""
class Node:
    def __init__(self,data):
        self.left=None
        self.right=None
        self.data=data

def preOrder(root):
    #Write your code here
    if root:
        print root.data, 
        preOrder(root.left)
        preOrder(root.right)
   
    
