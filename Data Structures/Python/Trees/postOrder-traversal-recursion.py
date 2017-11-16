"""
Complete the postOrder function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated values.

Input Format

Our hidden tester code passes the root node of a binary tree to your postOrder function.

Constraints

1 Nodes in the tree  500

Output Format

Print the tree's postorder traversal as a single line of space-separated values.

"""


class Node:
    def __init__(self,data):
        self.left=None
        self.right=None
        self.data=data
        
        
def postOrder(root):
    #Write your code here
    
    if root:
        postOrder(root.left)
        postOrder(root.right)
        print root.data, 

