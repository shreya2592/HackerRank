/*

You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. You only have to complete the function. For example:

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
For the above tree, the level order traversal is 1 -> 2 -> 5 -> 3 -> 6 -> 4.

Input Format

You are given a function,

void levelOrder(node * root) {

}
Constraints

1 Nodes in the tree  500

Output Format

Print the values in a single line separated by a space.

Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
Sample Output

1 2 5 3 6 4

Explanation

We need to print the nodes level by level. We process each level from left to right. 
Level Order Traversal: 1 -> 2 -> 5 -> 3 -> 6 -> 4.

*/

//import java.util.queue;
//import java.util.LinkedList;

  /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       Queue<Node> queue= new LinkedList<Node>();
       queue.add(root);
       
       while (!queue.isEmpty()){
           Node tempNode= queue.poll();
           System.out.print(tempNode.data+ " ");
           
           if(tempNode.left!=null){
               queue.add(tempNode.left);
           }
           
           if (tempNode.right!=null){
               queue.add(tempNode.right);
           }
       }
      
      
    }

