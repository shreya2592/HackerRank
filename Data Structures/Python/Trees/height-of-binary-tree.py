class BinarySearchTree:
    def __init__(self): 
        self.root = None

    def create(self, val):  
        if self.root == None:
            self.root = Node(val)
        else:
            current = self.root
         
            while True:
                if val < current.info:
                    if current.left:
                        current = current.left
                    else:
                        current.left = Node(val)
                        break
                elif val > current.info:
                    if current.right:
                        current = current.right
                    else:
                        current.right = Node(val)
                        break
                else:
                    break


def height(node):
    if node == None:
        return -1
    else:
        return (1+ max(height(node.left),height(node.right)))
    



tree = BinarySearchTree()
t = int(raw_input())

for _ in xrange(t):
    x = int(raw_input())
    tree.create(x)

print height(tree.root)

