"""


Input Format

Our hidden tester code passes the root node of a binary tree to your inOrder function.

Constraints

1 Nodes in the tree  500

Output Format

Print the tree's inorder traversal as a single line of space-separated values.


"""

class Node:
    def __init__(self,data):
        self.left=None
        self.right=None
        self.data=data

def inOrder(node):
    #Write your code here
    if node.left is not None:
        inOrder(node.left)
    print node.data, 
    if node.right is not None:
        inOrder(node.right)

